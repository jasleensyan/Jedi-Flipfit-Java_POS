package com.flipfit.business;

public class FlipFitAdminService implements FlipFitAdminServiceInterface {

    @Override
    public boolean isUserValid(String userName, String password) {
        return false;
    }

    @Override
    public boolean adminLogin(String userName, String password) {
        return false;
    }

    @Override
    public void viewAllGymOwners() {

    }

    @Override
    public void validateAllGymOwners() {

    }

    @Override
    public void validateGymOwnerByID(String ownerId, int isApproved) {

    }

    @Override
    public void viewAllGymCentres() {

    }

    @Override
    public void validateAllGymCentres() {

    }

    @Override
    public void validateGymCentreByID(String gymCentreId, int isApproved) {

    }

    @Override
    public void adminChangePassword(String userName, String old_password, String new_password) {

    }
}
