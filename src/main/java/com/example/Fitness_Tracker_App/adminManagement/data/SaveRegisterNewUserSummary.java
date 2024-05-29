package com.example.Fitness_Tracker_App.adminManagement.data;

public class SaveRegisterNewUserSummary {
    private String firstName ;

    private String lastName ;

    private String email ;

    private Long phoneNumber ;

    private int age ;

    private int gender ;

    private String address ;

    private  String password ;

    public SaveRegisterNewUserSummary(String firstName, String lastName, String email, Long phoneNumber, int age, int gender, String address,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }
}
