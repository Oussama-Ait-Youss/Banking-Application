package com.banking.app.Services;

import com.banking.app.Entity.User;
import com.banking.app.Repositories.UserRepository;


public class UserService {

    private UserRepository userRepository = new UserRepository();



        public void findAll(){
            userRepository.InitializeUser();
            System.out.println(userRepository.findAll());
        }

        //method for the login
        public User Login(String email, String password){
            return userRepository.Login(email,password);
        }

        public User findByEmail(String email){
            return userRepository.findByEmail(email);
        }






}