package com.example.proj1;

public class Sdetail {
    public Sdetail(int id ,String name,int age, String gender, int phone, String Address, String Date,String checkup,String DrRef ){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = Address;
        this.date = Date;
        this.checkup = checkup;
        this.drRef = DrRef;
    }
    private  int  id ,age , phone;
    private String name;
    private String gender;
    private String address;
    private String date;
    private String checkup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheckup() {
        return checkup;
    }

    public void setCheckup(String checkup) {
        this.checkup = checkup;
    }

    public String getDrRef() {
        return drRef;
    }

    public void setDrRef(String drRef) {
        this.drRef = drRef;
    }

    private String drRef;

}
