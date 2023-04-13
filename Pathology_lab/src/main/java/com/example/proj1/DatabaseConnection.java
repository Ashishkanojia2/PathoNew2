package com.example.proj1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnection {


    public DatabaseConnection(String insertQuery) {

        String url , username , password;

        url  = "jdbc:mysql://localhost:3306/yono?autoReconnect=true&useSSL=false";
        username = "Root";
        password = "RootUser2023";

        Date date,checkup;
        int Age,Phone;
        String Name,Gender,Address,DoctorRef ;


        try{

            Connection con  = DriverManager.getConnection(url,username,password);
           // String insertQuery = "insert into patient values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst =  con.prepareStatement(insertQuery);



        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }


    }
}
