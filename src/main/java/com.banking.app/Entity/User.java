package com.banking.app.Entity;


import java.util.UUID;

public class User {

    private UUID id;
    private String first_Name;
    private String last_Name;
    private String email;
    private String password;
    private String contact_Number;
    private String role;
    private double balance;
    private String account_nbr;


    public User(String first_Name,String last_Name,String email,String password,String contact_Number,String role,double balance,String account_nbr){
        this.id = UUID.randomUUID();
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email = email;
        this.password = password;
        this.contact_Number = contact_Number;
        this.role = role;
        this.balance = balance;
        this.account_nbr = account_nbr;
    }


    //getters


    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact_Name() {
        return contact_Number;
    }
    public UUID getId(){
        return id;
    }

    public String getRole() {
        return role;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount_nbr() {
        return account_nbr;
    }
    public String getPassword() {
        return password;
    }

    //setters

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(UUID id){
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact_Name(String contact_Name) {
        this.contact_Number = contact_Name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccount_nbr(String account_nbr) {
        this.account_nbr = account_nbr;
    }
    public void getFullName(){
        System.out.println(first_Name+last_Name);
    }



    @Override
    public String toString() {
        return "User :" + "\n"+
                "id=" + id + "\n" +
                ", first_Name='" + first_Name + '\'' + "\n"+
                ", last_Name='" + last_Name + '\'' + "\n"
                ;
//                ", email='" + email + '\'' + "\n"+
//                ", password='" + password + '\'' + "\n"+
//                ", contact_Number='" + contact_Number + '\'' + "\n"+
//                ", role='" + role + '\'' + "\n"+
//                ", balance=" + balance +"\n"+
//                ", account_nbr='" + account_nbr + '\''
    }
}