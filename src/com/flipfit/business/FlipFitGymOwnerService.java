package com.flipfit.business;

import com.flipfit.bean.FlipFitGymOwner;
import com.flipfit.bean.Slot;

public class FlipFitGymOwnerService implements FlipFitGymOwnerServiceInterface {
    @Override
    public FlipFitGymOwner register() {
        return null;
    }

    @Override
    public boolean gymOwnerLogin(String userName, String password) {
        return false;
    }

    @Override
    public void viewAllGymOwners() {
        System.out.println("viewAllGymOwners");
    }

    @Override
    public String getGymOwnerId(String userName, String password) {
        System.out.println("getGymOwnerId");
        return "";
    }

    @Override
    public void requestGymOwnerApproval(String gymOwnerId) {
        System.out.println("Showing Approval status");
    }

    @Override
    public void gymOwnerChangePassword(String userName, String old_password, String new_password) {
        System.out.println("Changing password");
    }

    @Override
    public boolean addSlot(Slot slot) {
        System.out.println("Slot added");
        return false;
    }
}
