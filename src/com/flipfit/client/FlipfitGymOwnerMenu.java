package com.flipfit.client;

import java.util.Scanner;

import static com.flipfit.constant.Constants.EXIT_MESSAGE;
import static com.flipfit.constant.Constants.INVALID_CHOICE_ERROR;

public class FlipfitGymOwnerMenu {
    public static Scanner scanner = new Scanner(System.in);

    public void gymOwnerLogin(String userName, String password){
        System.out.println("Gym Owner Login");
    }

    public void register(){
        System.out.println("Register gym owner");
    }

    public void gymOwnerChangePassword(String userName,String old_password,String new_password){
        System.out.println("Gym Owner Change Password");
    }

    public void addSlot(){
        System.out.println("Slot Added");
    }

    public void gymOwnerClientMainPage(){
        System.out.println("Welcome to gym owner main page!!");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("" +
                "0. View all Gym Centres\n" +
                "1. Send Gym Owner Approval Request\n" +
                "2. Add new Gym Center\n" +
                "3. Request Gym Centre Approval\n" +
                "4. Add Slots to Gym Centre\n"
        );
        System.out.println("---------------------------------------------------------------------------");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // View All gym centers
                break;
            case 2:
                //send gym owner approval request
                break;
            case 3:
                //Add new gym center
                break;
            case 4:
                //Request Gym center Approval
                break;
            case 5:
                //Add Slots to gym center
                break;
            default:
                System.out.println(INVALID_CHOICE_ERROR);
                break;
        }
        gymOwnerClientMainPage();
    }
}
