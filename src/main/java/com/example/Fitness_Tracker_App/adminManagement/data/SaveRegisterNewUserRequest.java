package com.example.Fitness_Tracker_App.adminManagement.data;

public class SaveRegisterNewUserRequest {
   final  private String firstName ;

  final   private String lastName ;

   final  private String email ;

   final  private Long phoneNumber ;

  final   private int age ;

   final  private int gender ;

   final  private String address ;

   final private String password ;

    public SaveRegisterNewUserRequest(String firstName, String lastName, String email, Long phoneNumber, int age, int gender, String address , String password) {
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
