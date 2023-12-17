CREATE DATABASE QUANLYSINHVIEN
GO
USE QUANLYSINHVIEN

--Nhóm người đăng nhập: maNDN(số nguyên tăng dần), tên nhóm người dùng (sinh viên, giảng viên, admin,...)	
go
CREATE TABLE NHOMNGUOIDANGNHAP
(
	maNhomNguoiDung varchar(5) PRIMARY KEY,
	tenNhomNguoiDung nvarchar(max) NOT NULL,
)

--Chức năng : maChucNang, tenChucNang, tenManHinh
go
CREATE TABLE CHUCNANG
(
     id int IDENTITY(1,1) PRIMARY KEY,
	 maChucNang AS CAST('CN' + right('000' + CAST(id as varchar(3)), 3) as char(5)) persisted,
     tenChucNang nvarchar(max) NOT NULL,
     tenManHinh nvarchar(max) NOT NULL
)

--Tài khoản:  maTK(SV1, GV1,...), tenNguoiDung, tenDangNhap, matkhau, trangThaiXoa (0, 1), maNhomNguoiDung
go
CREATE TABLE TAIKHOAN
(
	id int IDENTITY(1,1) PRIMARY KEY,
	maNND varchar(5) FOREIGN KEY REFERENCES NHOMNGUOIDANGNHAP on delete cascade,
	maTK AS CAST(maNND + right('000' + CAST(id as varchar(3)), 3) as char(5)) persisted,
	tenNguoiDung nvarchar(max) NOT NULL,
	tenDangNhap varchar(max) NOT NULL,
	matKhau varchar(max) NOT NULL,
	trangThaiXoa smallint NOT NULL
)

go
CREATE TABLE PHANQUYEN
(
    maNhomNguoiDung varchar(5) FOREIGN KEY REFERENCES NHOMNGUOIDANGNHAP on delete cascade,
    maChucNang INT FOREIGN KEY REFERENCES CHUCNANG on delete cascade,
    PRIMARY KEY (maNhomNguoiDung, maChucNang)
)

go
CREATE TABLE KHOA(
	maKhoa varchar(15) PRIMARY KEY,
	tenKhoa nvarchar(100) UNIQUE,
	sdt varchar(15),
	trgKhoa varchar(15),
	ngayNhanChuc date
);

go
CREATE TABLE NGANH(
	maNganh varchar(15) PRIMARY KEY,
	tenNganh nvarchar(100) UNIQUE,
	maKhoa varchar(15) FOREIGN KEY REFERENCES KHOA(maKhoa) on delete cascade
);

go
CREATE TABLE LOP(
	maLop varchar(15) PRIMARY KEY,
	tenLop nvarchar(100) UNIQUE,
	maNganh varchar(15) FOREIGN KEY REFERENCES NGANH(maNganh) on delete cascade,
	coVan varchar(15),
);

go
CREATE TABLE SINHVIEN(
	maSV varchar(15) PRIMARY KEY,
	hoSV nvarchar(20) NOT NULL,
	tenlotSV nvarchar(50),
	tenSV nvarchar(10) NOT NULL,
	phai nvarchar(10) NOT NULL
	CONSTRAINT gioitinh CHECK (phai IN ('Nam', N'Nữ', N'Khác')),
	ngaySinh date NOT NULL,
	email varchar(500),
	sdt varchar(15),
	maLop varchar(15) FOREIGN KEY REFERENCES LOP(maLop) on delete cascade,
	namNhapHoc int NOT NULL,
	trangThai nvarchar(100) NOT NULL
	CONSTRAINT trangthai CHECK (trangThai IN (N'Đang học', N'Đã tốt nghiệp', N'Bảo lưu', N'Đã thôi học')),
	hinhAnh nvarchar(max)	
);

go
CREATE TABLE GIANGVIEN(
	maGV varchar(15) PRIMARY KEY,
	hoGV nvarchar(20) NOT NULL,
	tenlotGV nvarchar(50),
	tenGV nvarchar(10) NOT NULL,
	phai nvarchar(10)
	CONSTRAINT phai CHECK (phai IN('Nam', N'Nữ', N'Khác')),
	ngaySinh date,
	maKhoa varchar(15) FOREIGN KEY REFERENCES KHOA(maKhoa) on delete cascade,
	ngayBD date,
	email varchar(500),
	ngayKT date,
	trangThai nvarchar(50) NOT NULL,
	hinhAnh nvarchar(max),
	CONSTRAINT trangthaiGV CHECK (trangThai IN (N'Đang công tác', N'Đã nghỉ việc')),
);
go
ALTER TABLE KHOA ADD CONSTRAINT fk_KHOA_GIANGVIEN FOREIGN KEY(trgKhoa) REFERENCES GIANGVIEN(maGV);
ALTER TABLE LOP ADD CONSTRAINT fk_LOP_GIANGVIEN FOREIGN KEY(coVan) REFERENCES GIANGVIEN(maGV);

go
CREATE TABLE MONHOC(
	maMH varchar(15) PRIMARY KEY,
	tenMH nvarchar(1000) UNIQUE,
	stclt int NOT NULL,
	stcth int NOT NULL,
	phanLoai nvarchar(20),
	CONSTRAINT phanloai CHECK (phanLoai IN (N'Cơ sở', N'Chuyên ngành')),
	khoa varchar(15) FOREIGN KEY REFERENCES KHOA(maKhoa) on delete cascade
);

go
CREATE TABLE HOCKY(
	maHK varchar(20) PRIMARY KEY,
	hocKy int,
	nienKhoa varchar(15)
);

go
CREATE TABLE LOPTINCHI(
	maLopTC int PRIMARY KEY,
	maMH varchar(15) FOREIGN KEY REFERENCES MONHOC(maMH) on delete cascade, 
	maHK varchar(20) FOREIGN KEY REFERENCES HOCKY(maHK) on delete cascade,
	maLop varchar(15) FOREIGN KEY REFERENCES LOP(maLop),
	nhom int NOT NULL,
	svMin int NOT NULL,
	svMax int NOT NULL,
	huyLop int NOT NULL
	CONSTRAINT huy_lop CHECK (huyLop IN ('1', '0'))
);


go
CREATE TABLE BANGDIEMHOCKY(
	maBD varchar(15) PRIMARY KEY,
	maSV varchar(15) FOREIGN KEY REFERENCES SINHVIEN(maSV) on delete cascade,
	maHK varchar(20) FOREIGN KEY REFERENCES HOCKY(maHK) on delete cascade,
	diemTB float,
	xeploai nvarchar(20)
	CONSTRAINT xeploai CHECK (xeploai IN (N'Xuất sắc', N'Giỏi', N'Khá', N'Trung bình', N'Yếu'))
);

go
CREATE TABLE CHITIETBANGDIEMHOCKY(
	maBD varchar(15) FOREIGN KEY REFERENCES BANGDIEMHOCKY(maBD) on delete cascade,
	maLTC int FOREIGN KEY REFERENCES LOPTINCHI(maLopTC),
	diem float,
	ketQua nvarchar(20)
	CONSTRAINT ketqua CHECK (ketQua IN(N'Đạt', N'Không đạt')),
	PRIMARY KEY(maBD, maLTC)
);

go
CREATE TABLE DANGKY(
	maSV varchar(15) FOREIGN KEY REFERENCES SINHVIEN(maSV) on delete cascade,
	maLTC int FOREIGN KEY REFERENCES LOPTINCHI(maLopTC),
	PRIMARY KEY (maSV, maLTC)
);


go
CREATE TABLE PHANCONG(
	maGV varchar(15) FOREIGN KEY REFERENCES GIANGVIEN(maGV) on delete cascade,
	maLTC int FOREIGN KEY REFERENCES LOPTINCHI(maLopTC),
	PRIMARY KEY (maGV, maLTC)
);

--INSERT DATA
go 
set dateformat dmy

-- NHOM NGUOI DANG NHAP
go
INSERT INTO NHOMNGUOIDANGNHAP (maNhomNguoiDung, tenNhomNguoiDung) VALUES
('SV', N'Sinh viên'), ('GV', N'Giáo viên'), ('AD', 'Admin')

-- CHUC NANG
go
INSERT INTO CHUCNANG (tenChucNang, tenManHinh) VALUES
('CTDT', N'Chương trình đào tạo'),
('DSKN', N'Danh sách khoa, ngành'),
('CTBD', N'Chi tiết bảng điểm'),
('PCGD', N'Phân công giảng dạy'),
('DKLTC', N'Đăng ký lớp tín chỉ'),
('TTLH', N'Thông tin lớp học'),
('TTSV', N'Thông tin sinh viên'),
('TTGV', N'Thông tin giảng viên');	
-- DBCC CHECKIDENT ('CHUCNANG', RESEED, 0);

-- TAI KHOAN
go
INSERT INTO TAIKHOAN (maNND, tenNguoiDung, tenDangNhap, matKhau, trangThaiXoa) VALUES
('SV', N'Nguyễn Phương Thảo', 'ngphthao10', '123456', '0'),
('SV', N'Nguyễn Thị Minh Thư', 'aklc', '123456', '0'),
('SV', N'Đặng Ngọc Yến', 'ngocYen', '123456', '0'),
('GV', N'Nguyễn Trung Hiếu', 'trunghieu', '123456', '0'),
('AD', N'ADMIN', 'admin', '123456', '0');

-- PHAN QUYEN
go
INSERT INTO PHANQUYEN VALUES
('SV', 1), ('SV', 2), ('SV', 3), ('SV', 5), ('SV', 6), ('SV', 7), 
('GV', 1), ('GV', 2), ('GV', 3), ('GV', 4), ('GV', 6), ('GV', 8),
('AD', 1), ('AD', 2), ('AD', 3), ('AD', 4), ('AD', 5), ('AD', 6), ('AD', 7), ('AD', 8); 

-- HOCKY
go
INSERT INTO HOCKY VALUES
('01_2018-2019', 1, '2018-2019'),
('02_2018-2019', 2, '2018-2019'),
('01_2019-2020', 1, '2019-2020'),
('02_2019-2020', 2, '2019-2020'),
('01_2020-2021', 1, '2020-2021'), 
('02_2020-2021', 2, '2020-2021'),
('01_2021-2022', 1, '2021-2022'),
('02_2021-2022', 2, '2021-2022'),
('01_2022-2023', 1, '2022-2023'),
('02_2022-2023', 2, '2022-2023'),
('01_2023-2024', 1, '2023-2024'),
('02_2023-2024', 2, '2023-2024')

--MON HOC
go
INSERT INTO MONHOC VALUES
('BAS1105-7', N'Giáo dục quốc phòng và an ninh'       , 3, 4, N'Cơ sở'		 , NULL),
('BAS1106'  , N'Giáo dục thể chất 1'		          , 1, 1, N'Cơ sở'		 , NULL),
('BAS1150'  , N'Triết học Mác - Lênin'		          , 3, 0, N'Cơ sở'	     , NULL),
('BAS1201'  , N'Đại số'						          , 3, 0, N'Cơ sở'		 , NULL),
('INT1154'  , N'Tin học cơ sở 1'			          , 1, 1, N'Cơ sở'		 , NULL),
('BAS1107'  , N'Giáo dục thể chất 2'		          , 1, 1, N'Cơ sở'		 , NULL),
('BAS1151'  , N'Kinh tế chính trị Mác - Lênin'        , 2, 0, N'Cơ sở'		 , NULL),
('BAS1157'  , N'Tiếng Anh (Course 1)'		          , 2, 2, N'Cơ sở'		 , NULL),
('BAS1224'  , N'Vật lý 1 và thí nghiệm'		          , 2, 2, N'Cơ sở'		 , NULL),
('INT1155'  , N'Tin học cơ sở 2'			          , 1, 1, N'Cơ sở'		 , NULL),
('BAS1158'  , N'Tiếng Anh (Course 2)'				  , 2, 2, N'Cơ sở'		 , NULL),
('INT1339'  , N'Ngôn ngữ lập trình C++'				  , 2, 1, N'Chuyên ngành', NULL),
('INT1306'  , N'Cấu trúc dữ liệu và giải thuật'		  , 2, 1, N'Chuyên ngành', NULL),
('INT1313'  , N'Cơ sở dữ liệu'						  , 2, 1, N'Chuyên ngành', NULL),
('INT1332'  , N'Lập trình hướng đối tượng'			  , 2, 1, N'Chuyên ngành', NULL),
('INT1303'  , N'An toàn và bảo mật hệ thống thông tin', 2, 1, N'Chuyên ngành', NULL)

--KHOA
go
INSERT INTO KHOA VALUES
('VT2', N'Viễn thông 2'			, '0123456789', NULL, '17/02/2019'),
('QT2', N'Quản trị kinh doanh 2', '0223456789', NULL, '10/04/2019'),
('DT2', N'Kỹ thuật điện tử 2'	, '0323456789', NULL, '15/06/2018'),
('CN2', N'Công nghệ thông tin 2', '0423456789', NULL, '25/01/2020'),
('CB2', N'Cơ bản 2'				, '0523456789', NULL, '18/05/2020');

--CAP NHAT MON HOC
go
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1105-7';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1106'; 
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1150';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1201';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1154';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1107';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1151';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1157';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1224';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1155';
UPDATE MONHOC SET khoa = 'CB2' WHERE maMH = 'BAS1158';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1339';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1306';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1313';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1332';
UPDATE MONHOC SET khoa = 'CN2' WHERE maMH = 'INT1303';

--GIANG VIEN
go
INSERT INTO GIANGVIEN VALUES
('VT2GV2', N'Huỳnh' , N'Duy'  , N'Khương', N'Nam', '12/03/1987', 'VT2', '11/01/2014', 'hdkptithcm@gmail.com'   , null		 , N'Đang công tác', N'C:\\Users\\PHUONG THAO\\OneDrive\\Documents\\NetBeansProjects\\StudentManagement\\Image\\rsz_imagegv1.jpg'),
('CN2GV1', N'Huỳnh' , N'Trọng', N'Thưa'  , N'Nam', '01/01/1970', 'CN2', '15/08/2000', 'httptithcm@gmail.com'   , null		 , N'Đang công tác', NULL),
('CN2GV2', N'Nguyễn', N'Thành', N'Hoàng' , N'Nam', '10/05/1990', 'CN2', '12/02/2017', 'nthptithcm@gmail.com'   , null		 , N'Đang công tác', NULL),
('CB2GV1', N'Nguyễn', N'Ngọc' , N'Hải'   , N'Nam', '13/07/1985', 'CB2', '20/02/2015', 'nnhptithcm@gmail.com'   , null		 , N'Đang công tác', NULL),
('CB2GV2', N'Nguyễn', N'Nhựt' , N'Hưng'  , N'Nam', '15/03/1994', 'CB2', '08/01/2018', 'nnhungptithcm@gmail.com', null		 , N'Đang công tác', NULL),
('VT2GV1', N'Huỳnh' , N'Trọng', N'Tấn'   , N'Nam', '14/05/1987', 'VT2', '15/08/2016', 'httanptithcm@gmail.com' , '16/09/2021', N'Đã nghỉ việc' , NULL),
('CN2GV3', N'Trần'  , N'Duy'  , N'Hi'    , N'Nam', '06/01/1991', 'CN2', '19/07/2017', 'tdhptithcm@gmail.com'   , null		 , N'Đang công tác', NULL),
('QT2GV1', N'Bùi'   , N'Quỳnh', N'Hoa'   , N'Nữ' , '16/10/1989', 'QT2', '14/10/2015', 'bqhptithcm@gmail.com'   , null		 , N'Đang công tác', NULL),
('DT2GV1', N'Lê'    , N'Quốc' , N'Nhật'  , N'Nam', '21/06/1987', 'DT2', '23/06/2013', 'lqnptithcm@gmail.com'   , null		 , N'Đang công tác', NULL)

--CAP NHAT KHOA
go
UPDATE KHOA SET trgKhoa = 'CN2GV1' WHERE maKhoa = 'CN2';
UPDATE KHOA SET trgKhoa = 'CB2GV2' WHERE maKhoa = 'CB2';
UPDATE KHOA SET trgKhoa = 'VT2GV2' WHERE maKhoa = 'VT2';
UPDATE KHOA SET trgKhoa = 'QT2GV1' WHERE maKhoa = 'QT2';
UPDATE KHOA SET trgKhoa = 'DT2GV1' WHERE maKhoa = 'DT2';

--NGANH
go
INSERT INTO NGANH VALUES
('CNTT', N'Công nghệ thông tin'		, 'CN2'),
('ATTT', N'An toàn thông tin'		, 'CN2'),
('CNPT', N'Công nghệ đa phương tiện', 'CN2'),
('KTDT', N'Kỹ thuật điện tử'		, 'DT2'),
('DTVT', N'Viễn thông'				, 'VT2'),
('QTKD', N'Quản trị kinh doanh'		, 'QT2'),
('TCKT', N'Kế toán'					, 'QT2')

--LOP
go
INSERT INTO LOP VALUES
('D18CQCN01-N', N'Công nghệ thông tin 1-2018'	  , 'CNTT', 'CN2GV1'),
('D18CQAT01-N', N'An toàn thông tin 1-2018'		  , 'ATTT', 'CN2GV2'),
('D18CQQT01-N', N'Quản trị kinh doanh 1-2018'	  , 'QTKD', 'QT2GV1'),
('D19CQVT01-N', N'Viễn thông 1-2019'			  , 'DTVT', 'VT2GV2'),
('D19CQPT01-N', N'Công nghệ đa phương tiện 1-2019', 'CNPT', 'CN2GV3'),
('D19CQDT01-N', N'Kỹ thuật điện tử 1-2019'		  , 'KTDT', 'DT2GV1'),
('D21CQCN01-N', N'Công nghệ thông tin 1-2021'	  , 'CNTT', 'CN2GV1'),
('D21CQAT01-N', N'An toàn thông tin 1-2021'		  , 'ATTT', 'CN2GV2'),
('D22CQQT01-N', N'Quản trị kinh doanh 1-2022'	  , 'QTKD', 'QT2GV1'),
('D22CQVT01-N', N'Viễn thông 1-2022'			  , 'DTVT', 'VT2GV2'),
('D22CQPT01-N', N'Công nghệ đa phương tiện 1-2022', 'CNPT', 'CN2GV3'),
('D22CQDT01-N', N'Kỹ thuật điện tử 1-2022'		  , 'KTDT', 'DT2GV1'),
('D20CQCN01-N', N'Công nghệ thông tin 1_2020'	  , 'CNTT', 'CN2GV1'),
('D23CQQT01-N', N'Quản trị kinh doanh 1-2023'	  , 'QTKD', 'QT2GV1'),
('D23CQVT01-N', N'Viễn thông 1-2023'			  , 'DTVT', 'VT2GV2'),
('D23CQPT01-N', N'Công nghệ đa phương tiện 1-2023', 'CNPT', 'CN2GV3');

--LOP TIN CHI
go
INSERT INTO LOPTINCHI VALUES
(1 , 'BAS1106', '01_2018-2019', 'D18CQCN01-N', 1, 25, 100, 0),
(2 , 'BAS1150', '01_2018-2019', 'D18CQAT01-N', 1, 25, 160, 0),
(3 , 'BAS1201', '01_2018-2019', 'D18CQCN01-N', 1, 25, 80, 0),
(4 , 'BAS1201', '01_2018-2019', 'D18CQCN01-N', 2, 25, 80, 0),
(5 , 'BAS1107', '02_2018-2019', 'D18CQQT01-N', 1, 25, 100, 0),
(6 , 'BAS1107', '02_2018-2019', 'D18CQCN01-N', 2, 25, 100, 1),
(7 , 'BAS1224', '01_2019-2020', 'D19CQVT01-N', 1, 25, 80, 0),
(8 , 'BAS1224', '01_2019-2020', 'D19CQPT01-N', 2, 25, 80, 0),
(9 , 'INT1339', '02_2020-2021', 'D20CQCN01-N', 1, 25, 80, 0),
(10, 'INT1306', '02_2021-2022', 'D21CQCN01-N', 1, 25, 160, 0),
(11, 'INT1313', '01_2019-2020', 'D19CQVT01-N', 1, 25, 80, 0),
(12, 'INT1306', '02_2019-2020', 'D19CQDT01-N', 1, 25, 160, 0),
(13, 'BAS1151', '02_2019-2020', 'D19CQDT01-N', 1, 25, 80, 0),
(14, 'INT1332', '01_2020-2021', 'D20CQCN01-N', 1, 25, 80, 0),
(15, 'INT1313', '01_2021-2022', 'D21CQCN01-N', 1, 25, 160, 0),
(16, 'INT1303', '01_2022-2023', 'D22CQVT01-N', 1, 25, 80, 0),
(17, 'INT1332', '02_2022-2023', 'D22CQDT01-N', 1, 25, 80, 0)

--PHAN CONG
go
INSERT INTO PHANCONG VALUES
('CB2GV2', 1),
('CB2GV1', 3),
('CB2GV2', 4),
('CB2GV1', 5),
('CB2GV2', 6),
('CB2GV1', 7),
('CN2GV3', 9),
('CN2GV1', 11),
('CB2GV1', 2),
('CB2GV2', 8),
('CN2GV2', 10),
('CN2GV3', 12),
('CB2GV1', 13),
('CN2GV1', 14),
('CN2GV2', 15),
('CN2GV3', 16),
('CN2GV1', 17)

--SINH VIEN
go
INSERT INTO SINHVIEN VALUES
('N18DCQT023', N'Bùi'	, N'Thành'	, N'Nam'	, 'Nam', '25/07/2001', 'btn@gmail.com', null, 'D18CQQT01-N', 2018, N'Đang học', NULL),
('N19DCVT001', N'Nguyễn', N'Tấn'	, N'An'		, 'Nam', '12/07/2001', 'nta@gmail.com', null, 'D19CQVT01-N', 2019, N'Đang học', NULL),
('N18DCCN025', N'Võ'	, N'Hữu'	, N'Thiện'	, 'Nam', '27/02/2001', 'vht@gmail.com', null, 'D18CQCN01-N', 2018, N'Đang học', NULL),
('N20DCCN097', N'Đặng'	, N'Ngọc'	, N'Yến'	, N'Nữ', '15/10/2003', 'dny@gmail.com', null, 'D20CQCN01-N', 2020, N'Đang học', NULL),
('N21DCCN082', N'Nguyễn', N'Minh'	, N'Thư'	, N'Nữ', '08/09/2003', 'nmt@gmail.com', null, 'D21CQCN01-N', 2021, N'Đang học', NULL),
('N21DCCN078', N'Nguyễn', N'Phương'	, N'Thảo'	, N'Nữ', '28/10/2003', 'npt@gmail.com', null, 'D21CQCN01-N', 2021, N'Đang học', NULL),
('N21DCCN055', N'Trần'	, N'Thùy'	, N'Ngân'	, N'Nữ', '04/12/2003', 'ttn@gmail.com', null, 'D21CQCN01-N', 2021, N'Đang học', NULL),
('N22DCDT036', N'Cao'	, N'Mỹ'		, N'Lệ'		, N'Nữ', '28/05/2004', 'cml@gmail.com', null, 'D22CQDT01-N', 2022, N'Đang học', NULL),
('N22DCDT064', N'Trần'	, N'Hồng'	, N'ÁNh'	, N'Nữ', '15/08/2004', 'tha@gmail.com', null, 'D22CQDT01-N', 2022, N'Đang học', NULL);

UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnam1_copy.png' WHERE maSV = 'N18DCQT023';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnam2_copy.png' WHERE maSV = 'N19DCVT001';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnam3_copy.jpg' WHERE maSV = 'N18DCCN025';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnu1_copy.jpeg' WHERE maSV = 'N20DCCN097';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnu2_copy.jpeg' WHERE maSV = 'N21DCCN082';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnu3_copy.jpeg' WHERE maSV = 'N21DCCN078';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnu4_copy.jpeg' WHERE maSV = 'N21DCCN055';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnu5_copy.jpg'  WHERE maSV = 'N22DCDT036';
UPDATE SINHVIEN SET hinhAnh = 'D:\Java\student-management\student-management\AnhTheSinhVien\anhnu6_copy.jpg'  WHERE maSV = 'N22DCDT064';

--BANG DIEM HOC KY
go
INSERT INTO BANGDIEMHOCKY VALUES
('BD01', 'N18DCCN025', '01_2019-2020', 7.3, N'Khá'),
('BD02', 'N20DCCN097', '01_2021-2022', 8.0, N'Giỏi'),
('BD03', 'N21DCCN055', '01_2021-2022', 8.9, N'Giỏi'),
('BD04', 'N18DCQT023', '01_2021-2022', 8.4, N'Giỏi')

--CHI TIET BANG DIEM HOC KY
go
INSERT INTO CHITIETBANGDIEMHOCKY VALUES
('BD01',  7, 7.6, N'Đạt'),
('BD01', 11, 7.0, N'Đạt'),
('BD02', 15, 8.0, N'Đạt'),
('BD04', 15, 8.4, N'Đạt'),
('BD03', 15, 8.9, N'Đạt')