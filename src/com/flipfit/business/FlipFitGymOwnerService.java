package com.flipfit.business;

import com.flipfit.bean.FlipFitGymOwner;

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

    }

    @Override
    public String getGymOwnerId(String userName, String password) {
        return "";
    }

    @Override
    public void requestGymOwnerApproval(String gymOwnerId) {

    }
}
