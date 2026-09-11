package com.banking.app.Repositories;

import com.banking.app.Entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.HashSet;
import java.util.Set;

public class UserRepository {

    // Data structure to store users
    private Set<User> users = new HashSet<>();

    public void InitializeUser() {

        User user1 = new User(
                "Fatima",
                "El Amrani",
                "fatima.amrani@gmail.com",
                "1234",
                "0612345678",
                "client",
                12500.50,
                "MA001"
        );

        User user2 = new User(
                "Oussama",
                "Ait Youss",
                "oussama@gmail.com",
                "1234",
                "0611223344",
                "client",
                40000.39,
                "MA002"
        );

        User user3 = new User(
                "Yassine",
                "Bennani",
                "yassine.bennani@yahoo.com",
                "1234",
                "0698765432",
                "client",
                185400.00,
                "MA003"
        );

        User user4 = new User(
                "Salma",
                "Mansouri",
                "salma.mansouri@outlook.com",
                "1234",
                "0655443322",
                "client",
                0.0,
                "MA004"
        );

        User user5 = new User(
                "Mehdi",
                "Alaoui",
                "mehdi.alaoui@bankcorp.ma",
                "1234",
                "0677889900",
                "admin",
                50000.00,
                "MA005"
        );

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public Set<User> findAll() {
        return users;
    }

        //login method
        public User Login(String email,String password) throws NullPointerException{
            return users.stream()
                    .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
                    .findFirst()
                    .orElse(null);
        }
        public User findByEmail(String email){
            return users.stream()
                    .filter(r->r.getEmail().equals(email))
                    .findFirst()
                    .orElse(null);
        }
}