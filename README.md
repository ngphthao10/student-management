<p align="center">
  <a href="https://ptithcm.edu.vn/" title="Học viên Công nghệ Bưu chính viễn thông cơ sở tại Tp Hồ Chí Minh" style="border: none;">
    <img src="https://daihoconline.edu.vn/wp-content/uploads/2022/12/logo_bcvt_transparent_Original_White-background_600px.png" alt="Học viện Công nghệ Bưu chính viễn thông">
  </a>
</p>

# Phần mềm Quản lý Sinh Viên

## Giới thiệu

* Đây là ứng dụng được sử dụng làm đồ án cuối kì cho môn Lập trình hướng đối tượng.
* Ứng dụng được xây dựng theo mô hình MVC, giao diện cài đặt bằng thư viện Swing và database viết bằng SQL Server. 

### Giảng viên hướng dẫn

* ThS. Nguyễn Trung Hiếu - Khoa Công nghệ Thông Tin 2, Học viện Công nghệ Bưu chính viễn thông cơ sở tại thành phố Hồ Chí Minh

### Sinh viên thực hiện

|**STT**|**MSSV**  |  **Họ và tên**       |       **Email**                 |
|-------|----------|----------------------|---------------------------------|
|   1   |N21DCCN078|Nguyễn Thị Phương Thảo|n21dccn078@student.ptithcm.edu.vn|
|   2   |N21DCCN082|Nguyễn Thị Minh Thư   |n21dccn082@student.ptithcm.edu.vn|
|   3   |N21DCCN097|Đặng Ngọc Yến         |n21dccn097@student.ptithcm.edu.vn|

## Chạy thử project

### Yêu cầu để thực thi project

* NetBeans IDE 2021 - JDK 17
* Microsoft SQL Server Management Studio 2019
* MSSQL-JDBC <version> 11.2.3.jre17
* Mở SQL Server 2019 Configuration Manager => SQL Server Network => Chỉnh TCP/IP enable và TCP port: 1433 => restart
* Component JCalender https://toedter.com/jcalendar/
  
### Bước 1: Khởi tạo database

* Thực thi file QUANLYSINHVIEN.sql để khởi tạo database

### Bước 2: Thực thi chương trình

* Mở file src/main/java/Controller/DataConnection.java để đổi sqlInstanceName thành Server name và password (nếu cần)
* Do không thể khắc phục lỗi khi bỏ source của icon nên code trên lại để link icon của máy cá nhân -> nên đổi lại source file của icon trước khi run
* Run file src/main/java/View/GiaoDienDangNhap.java, tên đăng nhập và mật khẩu có sẵn trong Database
* Lưu ý: Các nút tắt trong từng màn hình là một icon
