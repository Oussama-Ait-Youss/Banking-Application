package com.banking.app.Repositories;

import com.banking.app.Entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepository {

    // Data structure to store users
    private Map<UUID, User> users = new HashMap<>();



        public void InitializeUser(){
            // Generate UUID keys and attach them directly to both the user and the map
            UUID id1 = UUID.randomUUID();
            User user1 = new User("Fatima", "El Amrani", "fatima.amrani@gmail.com", "0612345678", "client", 12500.50, id1.toString());

            UUID id2 = UUID.randomUUID();
            User user2 = new User("Oussama", "Ait Youss", "oussama@gmail.com", "0611223344", "client", 40000.39, id2.toString());

            UUID id3 = UUID.randomUUID();
            User user3 = new User("Yassine", "Bennani", "yassine.bennani@yahoo.com", "0698765432", "client", 185400.00, id3.toString());

            UUID id4 = UUID.randomUUID();
            User user4 = new User("Salma", "Mansouri", "salma.mansouri@outlook.com", "0655443322", "client", 0.0, id4.toString());

            UUID id5 = UUID.randomUUID();
            User user5 = new User("Mehdi", "Alaoui", "mehdi.alaoui@bankcorp.ma", "0677889900", "admin", 50000.00, id5.toString());

            // Put users in the map using their actual UUID
            users.put(id1, user1);
            users.put(id2, user2);
            users.put(id3, user3);
            users.put(id4, user4);
            users.put(id5, user5);
        }


        //find all users

        public void findAll(){
            System.out.println(users);;
    }



}