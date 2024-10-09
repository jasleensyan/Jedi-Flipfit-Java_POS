package com.flipfit.client;

//import com.flipfit.business.FlipFitAdminService;
import java.util.Scanner;

public class FlipfitAdminMenu {
//    FlipFitAdminService adminService = new FlipFitAdminService();
    public static Scanner scanner = new Scanner(System.in);

    public void adminLogin(String userName, String password){
        System.out.println("Welcome " + userName);
    }

    public void adminChangePassword(String userName, String old_password, String new_password) {
        System.out.println("Change your password");
    }

    public void adminClientMainPage(){
        System.out.println("Welcome to Flipfit Admin Client");
    }
}
