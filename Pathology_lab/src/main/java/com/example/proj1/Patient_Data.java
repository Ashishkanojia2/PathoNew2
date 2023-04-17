package com.example.proj1;


public class Patient_Data {
    private int id;
    private String Name;
    private int  Age;
    private String Gender;
    private String Phone;
    private String Address;
    private String Date;
    private String Checkup;
    private String DrRef;

    private String Amount;

    public Patient_Data(Integer id1, String Name1, Integer Age1, String Gender1, String Phone1, String  Address1, String Date1, String Checkup1, String DrRef1, String Amount1){
        this.id = id1;
        this.Name = Name1;
        this.Age = Age1;
        this.Gender = Gender1;
        this.Phone = Phone1;
        this.Address = Address1;
        this.Date = Date1;
        this.Checkup = Checkup1;
        this.DrRef = DrRef1;
        this.Amount = Amount1;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public String getDate() {
        return Date;
    }

    public String getCheckup() {
        return Checkup;
    }

    public String getDrRef() {
        return DrRef;
    }

    public String getAmount() {
        return Amount;
    }
}
