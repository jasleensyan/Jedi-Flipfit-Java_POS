package com.flipfit.client;

import java.util.Scanner;
import java.util.Date;

import static com.flipfit.constant.Constants.*;
import com.flipfit.business.FlipFitGymOwnerService;
import com.flipfit.bean.Slot;

public class FlipfitGymOwnerMenu {
    public static Scanner scanner = new Scanner(System.in);
    FlipFitGymOwnerService gymOwnerService = new FlipFitGymOwnerService();

    public void gymOwnerLogin(String userName, String password){
        System.out.println("Gym Owner Login");
    }

    public void registerNewGym(){
        System.out.println("Register new gym center");
    }

    public void gymOwnerChangePassword(String userName,String old_password,String new_password){
        System.out.println("Gym Owner Change Password");
    }

    public void gymOwnerClientMainPage(){
        System.out.println("Welcome to gym owner main page!!");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("" +
                "1. View all Gym Centers\n" +
                "2. Send Gym Owner Approval Request\n" +
                "3. Add new Gym Center\n" +
                "4. Add Slots to Gym Centre\n" +
                "5. Go Back to previous menu"
        );
        System.out.println("---------------------------------------------------------------------------");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                gymOwnerService.viewAllGymOwners();
                break;
            case 2:
                gymOwnerService.requestGymOwnerApproval("123");
                break;
            case 3:
                registerNewGym();
                break;
            case 4:
                Date date = new Date();
                Slot slot = new Slot("slot123", "center123", date);
                gymOwnerService.addSlot(slot);
                break;
            case 5:
                System.out.println(PREVIOUS_MENU_MESSAGE);
                return;
            default:
                System.out.println(INVALID_CHOICE_ERROR);
                break;
        }
        gymOwnerClientMainPage();
    }
}
