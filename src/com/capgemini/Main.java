package com.capgemini;

import com.capgemini.controler.LoginControl;
import com.capgemini.model.*;
import com.capgemini.view.LoginView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Roles roles=new Roles();
    static  Views views=new Views();
    static Permissions permissions= new Permissions();
    static Users users=new Users();

    public static void main(String[] args) {

        new LoginView();

    }
}