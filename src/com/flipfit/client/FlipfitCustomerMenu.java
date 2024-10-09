package com.flipfit.client;

public class FlipfitCustomerMenu {
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

    public void customerClientMainPage(String username, String customerId){
        System.out.println("Customer Client Main Page");
    }
}
