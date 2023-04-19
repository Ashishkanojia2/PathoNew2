package com.example.proj1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.beans.Expression;
import java.sql.*;

import static com.example.proj1.Connect_db.con;

public class DoctorPane {
    @FXML
    private Button Doctor_Add_Btn;

    @FXML
    private TextField Doctor_Age;

    @FXML
    private Button Doctor_Delete_Btn;

    @FXML
    private TextField Doctor_Expirence;

    @FXML
    private TextField Doctor_Gender;

    @FXML
    private Button Doctor_ImageImport_Btn;

    @FXML
    private TextField Doctor_Income;

    @FXML
    private TextField Doctor_Name;

    @FXML
    private TextField Doctor_NoT;

    @FXML
    private TextField Doctor_TreatmentChrg;

    @FXML
    private Button Doctor_clear_Btn;

    @FXML
    private TextField Doctor_id;

    @FXML
    private Button Doctor_update_Btn;

    //****************************************this id is for Doctor Data Column*******************
    @FXML
    private TableView<?> addDoctor_tableVew;
    @FXML
    private AnchorPane ImagePane;

    @FXML
    private TableColumn<?, ?> Doctor_col_Exprience;

    @FXML
    private TableColumn<?, ?> Doctor_col_Gender;

    @FXML
    private TableColumn<?, ?> Doctor_col_Income;

    @FXML
    private TableColumn<?, ?> Doctor_col_Name;

    @FXML
    private TableColumn<?, ?> Doctor_col_NoT;

    @FXML
    private TableColumn<?, ?> Doctor_col_TreatmentCharges;

    @FXML
    private TableColumn<?, ?> Doctor_col_age;

    @FXML
    private TableColumn<?, ?> Doctor_col_id;
    public void DoctorPane()

    {
        String url, username, password;
        url = "jdbc:mysql://localhost:3306/yono?autoReconnect=true&useSSL=false";
        username = "root";
        password = "Rootuser2023";

        int Id,Age,DrNot,Income,TrtChrg;
        String Name, Gender, Expression, DoctorRef, Checkup ,Amount;

        Id = Integer.parseInt(Doctor_id.getText());
        Name = Doctor_Name.getText();
        Age = Integer.parseInt(Doctor_Age.getText());
        Gender = Doctor_Gender.getText();
        Expression = Doctor_Expirence.getText();
        DrNot = Integer.parseInt(Doctor_NoT.getText());
        Income = Integer.parseInt(Doctor_Income.getText());
        TrtChrg = Integer.parseInt(Doctor_TreatmentChrg.getText());


        try {
            String insertQuery = "Insert into doctor values(?,?,?,?,?,?,?,?)";

            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement stm =con.prepareStatement(insertQuery);
            stm.execute(insertQuery);

            stm.setInt(1,Id);
            stm.setString(2,Name);
            stm.setInt(3,Age);
            stm.setString(4,Gender);
            stm.setString(5,Expression);
            stm.setInt(6,DrNot);
            stm.setInt(7,Income);
            stm.setInt(8,TrtChrg);
        } catch (Exception e){
            System.out.println("This Error come from the doctor data inserted in database" + e);

        }
        ResultSet resultSet;
        try {

            String SelectQuery ="Select * from doctor ";
            ObservableList<Doctor_Data> listData = FXCollections.observableArrayList();
            PreparedStatement stm1 = con.prepareStatement(SelectQuery);
            resultSet = stm1.executeQuery();
            Doctor_Data drData;
            while (resultSet.next()){
                drData = new Doctor_Data(resultSet.getInt("D_id"),
                        resultSet.getString("D_Name"),
                        resultSet.getInt("D_Age"),
                        resultSet.getString("D_Gender"),
                        resultSet.getString("Expression"),


            }


        }catch(Exception e){
            System.out.println("This error is comes form the select query when we fetch data from the database" + e);
        }

    }
}
