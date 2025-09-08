import java.sql.*;
public class JDBCPractice {
    public static void main(String[] args) {
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.driver");
            //create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Rahul@123");
            //create statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE student");
            System.out.println("Database created successfully");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Rahul@123");
            //create table
            Statement stm = conn.createStatement();
            stm.executeUpdate("CREATE TABLE studentdata(roll INT PRIMARY KEY, name VARCHAR(20))");
            System.out.println("Table created successfully");

            stmt.close();
            stm.close();
            con.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
