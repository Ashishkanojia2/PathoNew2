package com.example.proj1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Scene2 {
    @FXML
    private Button loginBtn;
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
   PreparedStatement preparedStatement;
   ResultSet resultSet;


    public void loginAdmin() {
        String sql = "Select * from user where Email =? and password =? ";
        // connect = dataBase.connectionDB();
        String url2,username2,password2;
        url2 = "jdbc:mysql://localhost:3306/student_manage?autoReconnect=true&useSSL=false";
        username2 = "root";
        password2 = "Rootuser2023";


        try {
            Connection connect = DriverManager.getConnection(url2,username2, password2);
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, username.getText());
            preparedStatement.setString(2, password.getText());
            resultSet = preparedStatement.executeQuery();

            Alert alert;

            if (username.getText().isEmpty() || password.getText().isEmpty()) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("GLTI AA REHE HAI BHAI");
                alert.setHeaderText("Bhai tune kuch to glt likha hai check kr le ek bar");
                alert.showAndWait();
                System.out.println("Both the fields are blank...");
            } else {
                if (resultSet.next()) {
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("INFORMATION MESSAGE");
                    /*  alert.setHeaderText("null");*/
                    alert.setContentText("Your Id nd Password both are Correct ");
                    alert.showAndWait();
                    //  --> hide your login form
                    loginBtn.getScene().getWindow().hide();

                    Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();

                } else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("GLTI AA REHE HAI BHAI");
                    /* alert.setHeaderText("null");*/
                    alert.setContentText("Bhai  ya to Email glt hai ya to password glt hai ");
                    alert.showAndWait();
                    System.out.println("Something is Error either id was wrong or password....");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
