package com.example.proj1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnection {

//    public  DatabaseConnection() {
//
//
//
//
//        try{
//
//     //       Connection cn  = DriverManager.getConnection(url,username,password);
//           // String insertQuery = "insert into patient values(?,?,?,?,?,?,?,?)";
//            // PreparedStatement pst =  con.prepareStatement(insertQuery);
//           // Connection String = cn;
//        }catch(Exception e){
//            System.out.println(e);
//            e.printStackTrace();
//        }
//        return cn;
//    }
}

class Connect_db {
    static Connection con=null;
//    public static Connection getConnection()
//    {
//        if (con != null) return con;
//        // get db, user, pass from settings file
//        return getConnection();
//    }

    private static Connection getConnection()
    {
        String url , username , password ,db_name;
        db_name = "yono";
       // url  = "jdbc:mysql://localhost:3306/yono?autoReconnect=true&useSSL=false";
        username = "root";
        password = "RootUser2023";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+db_name+"?user="+username+"&password="+password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }
}
