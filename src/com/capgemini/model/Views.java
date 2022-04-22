package com.capgemini.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Views {
    List<String> views=new ArrayList<>();

    public Views() {
        File file = new File("src//com//capgemini//views.cfg");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] i = sc.nextLine().split("=");
                views.add(new Role(i[0],i[1]).toString());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println(views.toString());
    }
}