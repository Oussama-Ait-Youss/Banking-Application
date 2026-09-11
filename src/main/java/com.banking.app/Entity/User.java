package com.banking.app.Entity;



public class User {

    private int id;
    private String first_Name;
    private String last_Name;
    private String email;
    private String contact_Name;
    private String role;
    private double balance;
    private String account_nbr;


    public User(String first_Name,String last_Name,String Email,String contact_Name,String role,double balance,String account_nbr){
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email = email;
        this.contact_Name = contact_Name;
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
        return contact_Name;
    }
    public int getId(){
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

    //setters

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact_Name(String contact_Name) {
        this.contact_Name = contact_Name;
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
}