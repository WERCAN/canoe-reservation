package com.capgemini.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Roles {
    List<String> roles=new ArrayList<>();

    public Roles() {
        File file = new File("src//com//capgemini//roles.cfg");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] i = sc.nextLine().split("=");
                roles.add(new Role(i[0],i[1]).toString());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        //System.out.println(roles.toString());
    }
}