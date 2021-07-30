//package dao;
//
//import models.Account;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Select {
//    static  String select = "select * from chitietvt";
//    public static List<Account> select() throws SQLException , ClassNotFoundException {
//        ArrayList<Account> list = new ArrayList<>();
//        Connection connection = ConnectMySql.getConnect();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(select);
//
//        while (resultSet.next()) {
//            String id = resultSet.getString("id");
//            String use = resultSet.getString("use");
//            String passWord = resultSet.getString("use");
//            String gmail = resultSet.getString("gmail");
//            list.add(new Account(id,use,passWord,gmail));
//
//        }
//        return list;
//    }
//}
