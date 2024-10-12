package com.flipfit.client;

import com.flipfit.business.FlipFitAdminService;
import java.util.Scanner;

import static com.flipfit.constant.Constants.*;

public class FlipfitAdminMenu {

    public static Scanner scanner = new Scanner(System.in);
    public static FlipFitAdminService adminService = new FlipFitAdminService();

    public  void mainPage(){
        System.out.println(WELCOME_MESSAGE);
//        adminLogin("name", "");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. View All Gym Owners\n2. Approve all gym owners requests\n3. Approve gym owner's request by Id\n" +
                "4. View All Gym Centers\n5. Approve all gym centre requests\n6. Approve gym centre's request by Id\n7. Go Back To Previous Menu");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                adminService.viewAllGymOwners();
                break;
            case 2:
                adminService.validateAllGymOwners();
                break;
            case 3:
                adminService.validateGymOwnerByID("ownerID", 0);
                break;
            case 4:
                adminService.viewAllGymCentres();
                break;
            case 5:
                adminService.validateAllGymCentres();
                break;
            case 6:
                adminService.validateGymCentreByID("gymID", 0);
                return;
            case 7:
                System.out.println(PREVIOUS_MENU_MESSAGE);
                return;
            default:
                System.out.println(INVALID_CHOICE_ERROR);
                break;
        }
        mainPage();
    }

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
