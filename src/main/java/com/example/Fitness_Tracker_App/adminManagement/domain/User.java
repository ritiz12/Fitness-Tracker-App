package com.example.Fitness_Tracker_App.adminManagement.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId" , nullable = false)
    private Long userId ;

    @NotNull(message = "User First Name is Mandatory")
    @Column(name = "firstName" , nullable = false , updatable = false)
    private String firstName ;

    @NotNull(message = "User Last Name is Mandatory")
    @Column(name = "lastName" , nullable = false , updatable = false)
    private String lastName ;

    @NotNull(message = "User email is Mandatory")
    @Column(name = "email" , nullable = false , updatable = true)
    private String email ;

    @NotNull(message = "User Phone Number is Mandatory")
    @Column(name = "phoneNumber" , nullable = false , updatable = true)
    private Long phoneNumber ;

    @NotNull(message = "User age is Mandatory")
    @Column(name = "age" , nullable = false , updatable = true)
    private int age ;

    @NotNull(message = "User Gender is Mandatory")
    @Column(name = "gender" , nullable = false , updatable = false)
    private int gender ;

    @NotNull(message = "User Address is Mandatory")
    @Column(name = "address" , nullable = false , updatable = true)
    private String address ;

    @NotNull(message = "User Password is Mandatory")
    @Column(name = "password" , nullable = false , updatable = true)
    private String password ;

    User()
    {
        super();
    }
    public User( String firstName, String lastName, String email, Long phoneNumber, int age, int gender, String address , String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.password = password ;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
