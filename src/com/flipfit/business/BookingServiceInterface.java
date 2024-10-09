package com.flipfit.business;

import com.flipfit.bean.Booking;

import java.util.List;

public interface BookingServiceInterface {

    List<Booking> getBookingByCustomerId(String username);
    void cancelBooking(String bookingID);
}
