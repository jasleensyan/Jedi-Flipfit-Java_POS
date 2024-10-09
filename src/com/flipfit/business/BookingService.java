package com.flipfit.business;

import com.flipfit.bean.Booking;

import java.util.List;

public class BookingService implements BookingServiceInterface{
    @Override
    public List<Booking> getBookingByCustomerId(String username) {
        System.out.println("getBookingByCustomerId: " + username);
        return List.of();
    }

    @Override
    public void cancelBooking(String bookingID) {
        System.out.println("cancelBooking: " + bookingID);
    }
}
