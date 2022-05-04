package com.capgemini.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permissions {
    List<Permission> permissions=new ArrayList<>();

    public Permissions() {
        File file = new File("src//com//capgemini//permissions.cfg");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] i = sc.nextLine().split("=");
                permissions.add(new Permission(i[0],i[1]));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void LogingPermission(String userRole) {
        for (Permission permission : permissions) {
            if(permission.getKeyValue().contains(userRole)){
               // System.out.println(userRole +" " + permission.getKeyName());
            }
        }
    }
}