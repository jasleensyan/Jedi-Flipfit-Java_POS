package com.flipfit.client;

//import com.flipfit.business.FlipFitAdminService;
import java.util.Scanner;

import static com.flipfit.constant.Constants.*;

public class FlipfitAdminMenu {

    public static Scanner scanner = new Scanner(System.in);

    public  void mainPage(){
        System.out.println(WELCOME_MESSAGE);
        adminLogin("name", "");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. View Report \n2. View list of All GYM Centres and Owners \n3. Review all pending Registration of the GYM Customer\n4. Review all pending Registration of the GYM Owner\n5. Update Password\n6. Exit");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Report");
                break;
            case 2:
                System.out.println("list");
                break;
            case 3:
                System.out.println("WELCOME_MESSAGE");
                break;
            case 5:
                adminChangePassword("yes","yes"," ");
                break;
            case 6:
                System.out.println(EXIT_MESSAGE);
                return;
            default:
                System.out.println(INVALID_CHOICE_ERROR);
                break;
        }
        mainPage();
    }
//    FlipFitAdminService adminService = new FlipFitAdminService();


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
