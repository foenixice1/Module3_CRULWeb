//package dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ConnectMySql {
//    public static Connection getConnect() throws ClassNotFoundException , SQLException {
//        String jdbcURL = "jdbc:mysql://localhost:3306/quanlyvantai";
//        String jdbcUser = "root" ;
//        String jdbcPass = "123123";
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection(jdbcURL,jdbcUser,jdbcPass);
//
//        return connection;
//    }
//}
