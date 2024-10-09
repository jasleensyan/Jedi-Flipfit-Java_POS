package com.flipfit.business;

public interface FlipFitAdminServiceInterface {
    public boolean isUserValid(String userName, String password);
    public boolean adminLogin(String userName, String password);
    public void viewAllGymOwners();
    public void validateAllGymOwners();
    public void validateGymOwnerByID(String ownerId, int isApproved);
    public void viewAllGymCentres();
    public void validateAllGymCentres();
    public void validateGymCentreByID(String gymCentreId, int isApproved);
    public void adminChangePassword(String userName, String old_password, String new_password);

}
