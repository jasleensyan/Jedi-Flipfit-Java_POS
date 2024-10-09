package com.flipfit.business;

import com.flipfit.bean.Slot;

import java.util.List;

public interface SlotServiceInterface {
    void addSlotsForGym(String gymCentreId, List<Slot> slotList);

}
