package com.flipfit.client;

import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.business.FlipFitCustomerService;
import com.flipfit.business.FlipFitCustomerServiceInterface;

import java.time.LocalDateTime;
import java.util.Scanner;

import static com.flipfit.constant.Constants.INVALID_CHOICE_ERROR;
import static com.flipfit.constant.Constants.PREVIOUS_MENU_MESSAGE;

public class FlipfitCustomerMenu {
    public static Scanner scanner = new Scanner(System.in);
    FlipFitCustomerServiceInterface flipFitCustomerService = new FlipFitCustomerService();
    public void customerLogin(String userName, String password){
        System.out.println("Customer Login");
    }

    public void register(){
        System.out.println("Customer Registered");
    }

    private void bookSlotSubMenu(String userName){
        System.out.println("Book Slot Sub Menu");
    }

    private void cancelBookingSubMenu(String userName){
        System.out.println("Cancel Booking Sub Menu");
    }

    private void printUserPlan(String userName){
        System.out.println("Here is the User Plan");
    }

    public void customerChangePassword(String userName, String old_password, String new_password){
        System.out.println("Customer Change Password");
    }

    public void printCustomerProfile(FlipFitCustomer customer) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("USER ID: "+ customer.getUserID());
        System.out.println("USER NAME: "+ customer.getUserName());
        System.out.println("EMAIL: "+  customer.getEmail());
        System.out.println("CONTACT: "+  customer.getCustomerPhone());
        System.out.println("CARD DETAILS: "+  customer.getCardDetails());
        System.out.println("---------------------------------------------------------------------------");
    }

    public void customerClientMainPage(String username, String customerId){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Welcome to customer main page!!");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Login TIME: "+currentTime);
        System.out.println("---------------------------------------------------------------------------");

        while(true) {
            System.out.println("1. View Profile \n2. Book a slot in Gym \n3. View Bookings\n4. Cancel Bookings\n5. Go Back to previous menu");
            System.out.println("---------------------------------------------------------------------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    FlipFitCustomer customerProfile = flipFitCustomerService.viewMyProfile(customerId);
                    printCustomerProfile(customerProfile);
                    break;

                case 2:
                    System.out.println("Viewing all Available slots");
                    bookSlotSubMenu(username);
                    break;

                case 3:
                    printUserPlan(username);
                    break;

                case 4:
                    cancelBookingSubMenu(username);
                    break;

                case 5:
                    System.out.println(PREVIOUS_MENU_MESSAGE);
                    return;

                default:
                    System.out.println(INVALID_CHOICE_ERROR);
                    break;
            }
        }
    }
}
