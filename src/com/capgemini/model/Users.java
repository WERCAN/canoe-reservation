package com.capgemini.model;

import com.capgemini.controler.LoginControl;
import com.capgemini.view.MainView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Users {
    List<User> users = new ArrayList<>();

    public Users() {
        File file = new File("src//com//capgemini//userDefined.cfg");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] i = sc.nextLine().split(",");
                users.add(new User(i[0], i[1], i[2], i[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void checkUser(String inpUserName, String inpPassword) {

        for (User user : users) {
            if (user.getUserName().contains(inpUserName)) {
                if (user.getPassword().equals(inpPassword)) {
                    new MainView(user.getUserName());

                    Permissions permissions = new Permissions();
                    permissions.LogingPermission(user.getUserRole());

                } else {
                    System.out.println("Password is not correct!");
                    break;
                }
                break;
            }
            // TODO: else statement shouldn't be here!
            // I couldn't find a solution here
            else {
                System.out.println("Username is not correct!");
            }
        }
    }
}
