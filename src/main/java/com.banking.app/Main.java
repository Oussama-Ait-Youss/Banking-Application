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

        userService.findAll();

    }
}