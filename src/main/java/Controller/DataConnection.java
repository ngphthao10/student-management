package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnection {
    public static Connection connection;
    public static Statement statement;
    
    public static void createStatement() throws ClassNotFoundException, SQLException{
        try{
            String hostname = "localhost";
            String sqlInstanceName = "LAPTOP-SNRE2PET";
            String sqlDatabase = "QLSV";
            String sqlUser = "sa";
            String sqlPassword = "28102003";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String connectURL = "jdbc:sqlserver://" + hostname + ":1433" + ";instance="
                    + sqlInstanceName + ";databaseName=" + sqlDatabase +";integratedSecurity=false;" +
                    "encrypt=true; trustServerCertificate=true";

            connection = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
            statement = connection.createStatement();
 
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static ResultSet retrieveData(String sqlCommand){
        try{
            createStatement();
            ResultSet rs = statement.executeQuery(sqlCommand);
            return rs;
        }
        catch(Exception e){
           return null;
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        createStatement();
    }
    
}
