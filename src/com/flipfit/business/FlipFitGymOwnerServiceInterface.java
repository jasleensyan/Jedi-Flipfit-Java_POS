package com.flipfit.business;

import com.flipfit.bean.FlipFitGymOwner;

public interface FlipFitGymOwnerServiceInterface {
    public FlipFitGymOwner register();
    public boolean gymOwnerLogin(String userName, String password);
    public void viewAllGymOwners();
    public String getGymOwnerId(String userName, String password);
    public void requestGymOwnerApproval(String gymOwnerId);
    public void gymOwnerChangePassword(String userName,String old_password,String new_password);

}
