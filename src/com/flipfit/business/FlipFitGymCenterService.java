package com.flipfit.business;

import com.flipfit.bean.FlipFitGymCentre;

import java.util.List;

public class FlipFitGymCenterService implements FlipFitGymCenterServiceInterface {
    @Override
    public List<FlipFitGymCentre> getAllCentresByOwmerId(String gymOwnerId) {
        return List.of();
    }

    @Override
    public void addCenter(String gymId, String userName, String gymCentreName, String gstin, String city, int capacity, boolean isapproved, float price) {

    }

    @Override
    public void requestGymCentreApproval(String gymCentreName, String userName) {

    }
}
