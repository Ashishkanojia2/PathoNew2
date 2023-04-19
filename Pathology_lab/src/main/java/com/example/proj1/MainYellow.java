package com.example.proj1;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.lang.ref.PhantomReference;
import java.sql.*;


public class MainYellow {
    @FXML
    private Text NSB_txt;
    String url = "jdbc:mysql://localhost:3306/student_manage?autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "Rootuser2023";
    ResultSet resultSet;
    int countTC = 0;
        Connection cn;
        public void MainYellow() {
            try {
                String StringQuery ="select Count(P_id) from pathologylab";
                cn = DriverManager.getConnection(url, username, password);
                PreparedStatement pstm = cn.prepareStatement(StringQuery);
                resultSet = pstm.executeQuery();
                while(resultSet.next()){
                    countTC = resultSet.getInt("Count(P_id)");
                    NSB_txt.setText(String.valueOf(countTC));
                }


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
// new changes for git 
}
