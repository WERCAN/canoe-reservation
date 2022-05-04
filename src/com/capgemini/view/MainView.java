package com.capgemini.view;

import java.util.Scanner;

public class MainView {

   public MainView(String userID){
        System.out.println("Welcome " + userID);
        System.out.println("To go to the next menu type a number please!");
        System.out.println("1 "+" Reservation Menu");
        System.out.println("2 "+" Canoe Menu");

        if (userID.equals("John")) System.out.println("3 "+" User Menu");

        System.out.println("4 "+" Log out!");

       Scanner sc=new Scanner(System.in);
       //int num=sc.nextInt();

    }
}
