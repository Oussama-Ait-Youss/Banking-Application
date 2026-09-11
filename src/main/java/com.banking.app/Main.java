package com.banking.app;


import com.banking.app.Services.UserService;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void Applauncher(){
        System.out.println("=================================\n");
        System.out.println("        Banking Application      \n");
        System.out.println("=================================\n");
    }
    public static void AppEnder(){
        System.out.println("=================================\n");
        System.out.println("       Good Bye ! See you Soon   \n");
        System.out.println("=================================\n");
    }
    public static void main(String[] args) {


        Applauncher();
        UserService userService = new UserService();
        System.out.println("Display all the Users:\n");
        //display users are thiere
        userService.findAll();
        System.out.println("Enter your email :");
        String email = scanner.nextLine();
        System.out.println("Etner your password:");
        String password = scanner.nextLine();
        try {
            System.out.println(userService.Login(email,password));
            if(userService.Login(email,password) != null){
                System.out.println("Welcom " + userService.findByEmail(email));
            };
        } catch (NullPointerException e) {
            throw new RuntimeException("thiere is no object has been returned...");
        }
    }
}