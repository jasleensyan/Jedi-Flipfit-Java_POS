package com.flipfit.business;

//import com.flipfit.bean.Booking;
import com.flipfit.bean.FlipFitCustomer;
//import com.flipfit.bean.FlipFitGymCentre;
import com.flipfit.exception.InvalidCredentialsException;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class FlipFitCustomerService implements FlipFitCustomerServiceInterface{
//    @Override
//    public List<FlipFitGymCentre> getAllGymCenterDetailsByCity(String city) {
//        return null;
//    }
//
//    @Override
//    public List<Booking> getCustomerBookings(String customerId) {
//        return null;
//    }
//
//    @Override
//    public boolean bookSlot(String userID, Date date, String slotId, String centreId) {
//        return false;
//    }

    @Override
    public void cancelBooking(String bookingID) {

    }

    @Override
    public boolean customerLogin(String userName, String password) {
        return false;
    }

    @Override
    public FlipFitCustomer register() {
        return null;
    }

    @Override
    public FlipFitCustomer viewMyProfile(String customerId) {
        return null;
    }

    @Override
    public void viewMyProfile(FlipFitCustomer customer) {
        if(customer == null){System.out.println("USER NAME doesnot exist "); return ;}
        System.out.println("------------------------------------------------------------------------");
        System.out.println("USER ID: "+ customer.getUserID());
        System.out.println("USER NAME: "+ customer.getUserName());
        System.out.println("EMAIL: "+  customer.getEmail());
        System.out.println("CONTACT: "+  customer.getCustomerPhone());
        System.out.println("CARD DETAILS: "+  customer.getCardDetails());
        System.out.println("---------------------------------------------------------------------------");
    }


//    @Override
//    public FlipFitCustomer viewMyProfile(String  customer) {
////        if(customer == null){System.out.println("USER NAME doesnot exist "); return null;}
////        System.out.println("------------------------------------------------------------------------");
////        System.out.println("USER ID: "+ customer.getUserID());
////        System.out.println("USER NAME: "+ customer.getUserName());
////        System.out.println("EMAIL: "+  customer.getEmail());
////        System.out.println("CONTACT: "+  customer.getCustomerPhone());
////        System.out.println("CARD DETAILS: "+  customer.getCardDetails());
////        System.out.println("---------------------------------------------------------------------------");
//        return null;
//    }



    @Override
    public String getSlotIdFromGymCentreAndTimestamp(String gymOwner, Timestamp timestamp) {
        return "";
    }

    @Override
    public Integer getBookingCountFromSlotId(String slotId) {
        return 0;
    }

    @Override
    public Integer getGymCentreCapacityFromCentreId(String centerId) {
        return 0;
    }

    @Override
    public String addSchedule(Timestamp timestamp, String slotId) {
        return "";
    }

    @Override
    public float getGymCentreCostFromCentreId(String centerId) {
        return 0;
    }

    @Override
    public String addPayment(String bookingID, float amountPaid) {
        return "";
    }

    @Override
    public void customerChangePassword(String userName, String old_password, String new_password) throws InvalidCredentialsException {

    }
}
