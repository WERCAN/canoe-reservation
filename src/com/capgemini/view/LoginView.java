package com.capgemini.view;

import java.util.Scanner;

public class LoginView {
    String username;

    public LoginView() {
        System.out.println("User Name:");
        Scanner sc= new Scanner(System.in);
        username=sc.nextLine();

        System.out.println("Password:");
        int password=sc.nextInt();
    }

    public void print(){
        System.out.println(username);
    }
}