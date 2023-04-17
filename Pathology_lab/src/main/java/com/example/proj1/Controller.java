package com.example.proj1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.*;
import java.util.Optional;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    @FXML
    private Button SlotBackBtn;
    @FXML
    private Button BloodBtn;
    @FXML
    private AnchorPane BloodPane;
    @FXML
    private Button BrainBtn;
    @FXML
    private AnchorPane BrainPane;
    @FXML
    private Button GastricBtn;
    @FXML
    private AnchorPane GastricPane;
    @FXML
    private Button KidneyBtn;

    @FXML
    private AnchorPane KidneyPane;
    @FXML
    private AnchorPane liverPane;
    @FXML
    private Button LiverBtn;
    @FXML
    private Button LumbarBtn;
    @FXML
    private AnchorPane LumbarPane;
    @FXML
    private AnchorPane Palpation;

    @FXML
    private Button PalpationBtn;
    @FXML
    private AnchorPane Phonocardiography;
    @FXML
    private Button PhonocardiographyBtn;
    @FXML
    private Button PregnancyBtn;
    @FXML
    private AnchorPane PregnancyPane;
    @FXML
    private AnchorPane proteinPane;
    @FXML
    private Button ProteinBtn;
    @FXML
    private Button SkinBtn;

    @FXML
    private AnchorPane SkinPane;
    @FXML
    private Button ThyroidBtn;
    @FXML
    private AnchorPane ThyroidPane;
    @FXML
    private Button TomographyBtn;
    @FXML
    private AnchorPane TomographyPane;
    @FXML
    private Button UltrasoundBtn;
    @FXML
    private AnchorPane UltrasoundPane;
    @FXML
    private Button UrographyBtn;
    @FXML
    private AnchorPane UrographyPane;
    @FXML
    private AnchorPane bT01;
    @FXML
    private AnchorPane bT02;
    @FXML
    private AnchorPane bT03;
    @FXML
    private AnchorPane bT04;
    @FXML
    private AnchorPane bT05;
    @FXML
    private AnchorPane bT06;
    @FXML
    private AnchorPane bT07;
    @FXML
    private AnchorPane bT08;
    @FXML
    private AnchorPane bT09;
    @FXML
    private AnchorPane bT10;
    @FXML
    private AnchorPane bT11;
    @FXML
    private AnchorPane bT12;
    @FXML
    private AnchorPane bT13;
    @FXML
    private AnchorPane bT14;
    @FXML
    private AnchorPane bT15;
    @FXML
    private Button INQ1;
    @FXML
    private Button INQ10;
    @FXML
    private Button INQ11;
    @FXML
    private Button INQ12;
    @FXML
    private Button INQ13;
    @FXML
    private Button INQ14;
    @FXML
    private Button INQ15;
    @FXML
    private Button INQ2;
    @FXML
    private Button INQ3;
    @FXML
    private Button INQ4;
    @FXML
    private Button INQ5;
    @FXML
    private Button INQ6;
    @FXML
    private Button INQ7;
    @FXML
    private Button INQ8;
    @FXML
    private Button INQ9;
    @FXML
    private Button medicalBtn;
    @FXML
    private AnchorPane slotAnchorPane;
    @FXML
    private AnchorPane blueScreen;
    @FXML
    private Label welcomeText;
    @FXML
    private Button closeBtn;
    @FXML
    private Button medicalTestbtn;
    @FXML
    private Button loginBtn;
    @FXML
    private AnchorPane main_form;
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;

    @FXML
    private AnchorPane YellowScreen;
    @FXML
    private AnchorPane GreenTable_Screen;
    @FXML
    private AnchorPane doctorScreen;
    @FXML
    private Button homeBtn;
    @FXML
    private Button doctorBtn;
    @FXML
    private Button patientBtn;
    @FXML
    private AnchorPane ContentArea;


    private ActionEvent event;

    //**************************************************************  now this is for design fxml code
    @FXML
    private TableView<Patient_Data> P_COL_TableView;
    @FXML
    private TableColumn<Patient_Data, String> P_Address_Col;

    @FXML
    private TableColumn<Patient_Data, Integer> P_Age_Col;

    @FXML
    private TableColumn<Patient_Data, String> P_Amount_Col;

    @FXML
    private TableColumn<Patient_Data, String> P_CheckUp_Col;

    @FXML
    private TableColumn<Patient_Data, String> P_DR_Refer_Col;

    @FXML
    private TableColumn<Patient_Data, String> P_Gender_Col;

    @FXML
    private TableColumn<Patient_Data, String> P_Name_Col;

    @FXML
    private TableColumn<Patient_Data, String> P_PhoneNo_Col;

    @FXML
    private TableColumn<Patient_Data, String>P_SNo_Col;

    @FXML
    private TableColumn<Patient_Data, String>P_Date_Col;


    @FXML
    private Button SlotBookBtn;

    @FXML
    private Button logout;

    //**********************************************************************************
//doctor Screen
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
    @FXML
    private TextField Col_P_Id;
    @FXML
    private TextField Col_P_Address;
    @FXML
    private TextField Col_P_Age;
    @FXML
    private TextField Col_P_Amount;
    @FXML
    private TextField Col_P_Checkup;

    @FXML
    private TextField Col_P_Date;
    @FXML
    private TextField Col_P_DoctorRef;
    @FXML
    private TextField Col_P_Gender;

    @FXML
    private TextField Col_P_Name;
    @FXML
    private TextField Col_P_Phone;
    private Connection connect;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ObservableList<Patient_Data> addPatientListData() {
        String SelectQuery = "Select * from pathologylab ";
        ObservableList<Patient_Data> listData = FXCollections.observableArrayList();
        connect = dataBase.connectionDB();
        try {
            preparedStatement = connect.prepareStatement(SelectQuery);
            resultSet = preparedStatement.executeQuery();
            Patient_Data patientData;
            while (resultSet.next()) {
                patientData = new Patient_Data(resultSet.getInt("P_id"),
                        resultSet.getString("P_Name"),
                        resultSet.getInt("P_Age"),
                        resultSet.getString("P_Gender"),
                        resultSet.getString("P_Phone"),
                        resultSet.getString("P_Address"),
                        resultSet.getString("P_Date"),
                        resultSet.getString("P_Checkup"),
                        resultSet.getString("P_DrRef"),
                        resultSet.getString("P_Amount"));
                listData.add(patientData);
            }

        } catch (Exception e) {
            System.out.println("this error comes from select Statement Area " + e);
            e.printStackTrace();
        }
        return listData;
    }

    private ObservableList<Patient_Data> addPatientList;

    public void  addPatientShowList() {
        addPatientList = addPatientListData();
        P_SNo_Col.setCellValueFactory(new PropertyValueFactory<>("id"));
        P_Name_Col.setCellValueFactory(new PropertyValueFactory<>("Name"));
        P_Age_Col.setCellValueFactory(new PropertyValueFactory<>("Age"));
        P_Gender_Col.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        P_PhoneNo_Col.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        P_Address_Col.setCellValueFactory(new PropertyValueFactory<>("Address"));
        P_Date_Col.setCellValueFactory(new PropertyValueFactory<>("Date"));
        P_CheckUp_Col.setCellValueFactory(new PropertyValueFactory<>("Checkup"));
        P_DR_Refer_Col.setCellValueFactory(new PropertyValueFactory<>("DrRef"));
        P_Amount_Col.setCellValueFactory(new PropertyValueFactory<>("Amount"));


        P_COL_TableView.setItems(addPatientList);

    }

    public void addPatientSelect() {
        Patient_Data patientData =  P_COL_TableView.getSelectionModel().getSelectedItem();
        int num  = P_COL_TableView.getSelectionModel().getSelectedIndex();
        if((num -1) < - 1 ){
            return;
        }
        P_SNo_Col.setText(String.valueOf(patientData.getId()));
        P_Name_Col.setText((patientData.getName()));
        P_Age_Col.setText(String.valueOf((patientData.getAge())));
        P_Gender_Col.setText((patientData.getGender()));
        P_PhoneNo_Col.setText(String.valueOf((patientData.getPhone())));
        P_Address_Col.setText((patientData.getAddress()));
        P_Date_Col.setText((patientData.getDate()));
        P_CheckUp_Col.setText((patientData.getCheckup()));
        P_DR_Refer_Col.setText((patientData.getDrRef()));
        P_Amount_Col.setText((patientData.getAmount()));




    }

    public void go_to_inquery(ActionEvent event) {
        if (event.getSource() == INQ1) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ2) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ3) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ4) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ5) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ6) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ7) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ8) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ9) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ10) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ11) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ12) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ13) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ14) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == INQ15) {
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        }


    }

    // switch one anchor pane to another pane
    public void switchform(ActionEvent event) {
        if (event.getSource() == homeBtn) {
            YellowScreen.setVisible(true);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == doctorBtn) {
            doctorScreen.setVisible(true);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);


        } else if (event.getSource() == patientBtn) {
            GreenTable_Screen.setVisible(true);
            YellowScreen.setVisible(false);
            doctorScreen.setVisible(false);
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == SlotBookBtn) {
            slotAnchorPane.setVisible(true);
            blueScreen.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);

            addPatientShowList();

        } else if (event.getSource() == medicalBtn) {
            blueScreen.setVisible(true);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        }

    }

    public void aboutTest(ActionEvent event) {

        if (event.getSource() == BloodBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(true);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);

        } else if (event.getSource() == KidneyBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(true);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == LiverBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(true);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == ThyroidBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(true);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == GastricBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(true);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == SkinBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(true);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == BrainBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(true);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == LumbarBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(true);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == TomographyBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(true);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == ProteinBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(true);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == PregnancyBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(true);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == UltrasoundBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(true);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == UrographyBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyPane.setVisible(true);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(false);
        } else if (event.getSource() == PhonocardiographyBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(true);
            Palpation.setVisible(false);
        } else if (event.getSource() == PalpationBtn) {
            blueScreen.setVisible(false);
            slotAnchorPane.setVisible(false);
            YellowScreen.setVisible(false);
            GreenTable_Screen.setVisible(false);
            doctorScreen.setVisible(false);
            BloodPane.setVisible(false);
            KidneyPane.setVisible(false);
            liverPane.setVisible(false);
            ThyroidPane.setVisible(false);
            GastricPane.setVisible(false);
            SkinPane.setVisible(false);
            BrainPane.setVisible(false);
            LumbarPane.setVisible(false);
            TomographyPane.setVisible(false);
            proteinPane.setVisible(false);
            PregnancyPane.setVisible(false);
            UltrasoundPane.setVisible(false);
            UrographyBtn.setVisible(false);
            Phonocardiography.setVisible(false);
            Palpation.setVisible(true);
        }
    }

//    public void BackBtn(ActionEvent event) {
//        if (event.getSource() == SlotBackBtn) {
//            blueScreen.setVisible(false);
//            slotAnchorPane.setVisible(true);
//            YellowScreen.setVisible(false);
//            GreenTable_Screen.setVisible(false);
//            doctorScreen.setVisible(false);
//            BloodPane.setVisible(false);
//            KidneyPane.setVisible(false);
//            liverPane.setVisible(false);
//            ThyroidPane.setVisible(false);
//            GastricPane.setVisible(false);
//            SkinPane.setVisible(false);
//            BrainPane.setVisible(false);
//            LumbarPane.setVisible(false);
//            TomographyPane.setVisible(false);
//            proteinPane.setVisible(false);
//            PregnancyPane.setVisible(false);
//            UltrasoundPane.setVisible(false);
//            UrographyBtn.setVisible(false);
//            Phonocardiography.setVisible(false);
//            Palpation.setVisible(false);
//        }
//
//
//    }
    /////////////comment

    public void AddDoctorDetail() throws SQLException {

        System.out.println("trying to connect database");
        String url, username, password;
        int Id,Age;
        String Name, Gender, Address, DoctorRef, Phone,Date, Checkup ,Amount;


        Id = Integer.parseInt(Col_P_Id.getText());
        Name = Col_P_Name.getText();
        Age = Integer.parseInt(Col_P_Age.getText());
        Gender = Col_P_Gender.getText();
        Address = Col_P_Address.getText();
        Phone = Col_P_Phone.getText();
        Date = Col_P_Date.getText();
        Checkup = Col_P_Checkup.getText();
        DoctorRef = Col_P_DoctorRef.getText();
        Amount  = Col_P_Amount.getText();
        try {
            url = "jdbc:mysql://localhost:3306/yono?autoReconnect=true&useSSL=false";
            username = "root";
            password = "Rootuser2023";

            System.out.println("trying to connect database(1)");
            Connection con = DriverManager.getConnection(url, username, password);
            String insertQuery = "insert into pathologylab values(?,?,?,?,?,?,?,?,?,?)";
            System.out.println("insertQ" + insertQuery);
            PreparedStatement pst = con.prepareStatement(insertQuery);
            System.out.println("Now database is connected");
            Sdetail detail;
            System.out.println("trying to connect database(2)");

            //Col_P_Name.requestFocus();
            pst.setInt(1, Id);
            pst.setString(2, Name);
            pst.setInt(3, Age);
            pst.setString(4, Gender);
            pst.setString(5, Phone);
            pst.setString(6, Address);
            pst.setString(7, Date);
            pst.setString(8, Checkup);
            pst.setString(9, DoctorRef);
            pst.setString(10,Amount);

            pst.execute();
            System.out.println("record is inserted in Database");

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Data Inserted");
            alert.setTitle("Successfully Added");
            alert.setContentText("Null");
            alert.showAndWait();

            Col_P_Name.setText("");
            Col_P_Age.setText("");
            Col_P_Gender.setText("");
            Col_P_Phone.setText("");
            Col_P_Address.setText("");
            Col_P_Date.setText("");
            Col_P_Checkup.setText("");
            Col_P_DoctorRef.setText("");
            Col_P_Amount.setText("");

            Col_P_Name.requestFocus();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        addPatientShowList();

    }


    //**********************************LOGOUT BUTTON***************************************
    public void logout() {
        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you Sure you want to LogOut your Account...!");
            Optional<ButtonType> option = alert.showAndWait();
            if (option.get().equals(ButtonType.OK)) {
                logout.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendRequest() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText("Are you Sure to send the request..!");
        Optional<ButtonType> option = alert.showAndWait();


    }


    //******************************** LOGIN *******************************

    public void loginAdmin() {
        String sql = "Select * from user where Email =? and password =? ";
        connect = dataBase.connectionDB();

        try {
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

    public void closeBtn() {
        System.exit(0);
    }
 
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addPatientShowList();

    }
}
