package com.flipfit.client;

public class FlipfitGymOwnerMenu {
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

    public void gymOwnerClientMainPage(String userName, String password){
        System.out.println("Gym Owner Client Main Page");
    }
}
