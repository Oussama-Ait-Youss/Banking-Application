package com.banking.app.Services;

import com.banking.app.Repositories.UserRepository;


public class UserService {

    private UserRepository userRepository = new UserRepository();



        public void findAll(){
            userRepository.InitializeUser();
            userRepository.findAll();
    }



}