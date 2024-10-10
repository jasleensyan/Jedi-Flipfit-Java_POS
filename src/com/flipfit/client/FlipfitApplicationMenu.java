package com.flipfit.client;

import java.util.Scanner;

import static com.flipfit.constant.Constants.*;

public class FlipfitApplicationMenu {
    public static Scanner scanner = new Scanner(System.in);

    private static void mainPage(){
        System.out.println(WELCOME_MESSAGE);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Login\n2. Registration of the GYM Customer\n3. Registration of the GYM Owner\n4. Update Password\n5. Exit");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                registration();
                break;
            case 3:
                registration();
                break;
            case 4:
                updatePassword();
                break;
            case 5:
                System.out.println(EXIT_MESSAGE);
                return;
            default:
                System.out.println(INVALID_CHOICE_ERROR);
                break;
        }
        mainPage();
    }

    private static void login(){
        System.out.println("Please enter your login details: ");

        String login = scanner.next();


        if( login.equals("admin") ){
            FlipfitAdminMenu adminMenu = new FlipfitAdminMenu();
            adminMenu.mainPage();
        }
        else if( login.equals("user") ){
            FlipfitCustomerMenu customerMenu = new FlipfitCustomerMenu();

        }

    }

    private static void registration(){
        System.out.println("Please enter your registration details: ");
    }

    private static void updatePassword(){
        System.out.println("Please enter your new password: ");
    }

    public static void main(String[] args) {
        mainPage();
    }

}
