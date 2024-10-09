package com.flipfit.business;

import com.flipfit.bean.Booking;
import com.flipfit.bean.FlipFitCustomer;
import com.flipfit.bean.FlipFitGymCentre;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface FlipFitCustomerServiceInterface {
    List<FlipFitGymCentre> getAllGymCenterDetailsByCity(String city);
    List<Booking> getCustomerBookings(String customerId);
    boolean bookSlot(String userID, Date date, String slotId, String centreId);
    void cancelBooking(String bookingID);
    public boolean customerLogin(String userName, String password);
    public FlipFitCustomer register();
    public FlipFitCustomer viewMyProfile(String customerId);
    public String getSlotIdFromGymCentreAndTimestamp(String gymOwner, Timestamp timestamp);
    public Integer getBookingCountFromSlotId(String slotId);
    public Integer getGymCentreCapacityFromCentreId(String centerId);
    public String addSchedule(Timestamp timestamp, String slotId);
    public float getGymCentreCostFromCentreId(String centerId);
    public String addPayment(String bookingID, float amountPaid);
    public void customerChangePassword(String userName,String old_password,String new_password) throws WrongCredentialsException;

}
