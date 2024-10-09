package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCentre;

import java.util.List;

public interface FlipFitGymCenterServiceInterface {
    List<FlipFitGymCentre> getAllCentresByOwmerId(String gymOwnerId);
    void addCenter(String gymId,String userName,String gymCentreName, String gstin, String city,int capacity,boolean isapproved,float price);
    void requestGymCentreApproval(String gymCentreName, String userName);
}
