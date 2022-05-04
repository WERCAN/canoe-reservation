package com.capgemini.view;

import com.capgemini.model.Users;

import java.util.Scanner;

public class LoginView {

    public LoginView() {
        Users users=new Users();

        System.out.println("User Name:");
        Scanner sc= new Scanner(System.in);
        String userID=sc.nextLine();

        System.out.println("Password:");
        String Password=sc.nextLine();

        users.checkUser(userID,Password);
    }

    public void print(){
        //System.out.println(username);
    }
}