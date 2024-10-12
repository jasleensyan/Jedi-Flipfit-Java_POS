package com.flipfit.client;

import java.util.Scanner;
import java.util.Date;

import static com.flipfit.constant.Constants.*;

import com.flipfit.business.FlipFitGymCenterService;
import com.flipfit.business.FlipFitGymOwnerService;
import com.flipfit.bean.Slot;

public class FlipfitGymOwnerMenu {
    public static Scanner scanner = new Scanner(System.in);
    FlipFitGymOwnerService gymOwnerService = new FlipFitGymOwnerService();
    FlipFitGymCenterService gymCenterService = new FlipFitGymCenterService();

    public void gymOwnerClientMainPage(){
        System.out.println("Welcome to gym owner main page!!");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("" +
                "1. View all Gym Owners\n" +
                "2. Register New Gym Owner\n" +
                "3. View all Gym Centers by OwnerID\n" +
                "4. Send Gym Owner Approval Request\n" +
                "5. Send Gym Center Approval Request\n" +
                "6. Add new Gym Center\n" +
                "7. Add Slots to Gym Center\n" +
                "8. Change password\n" +
                "9. Go Back to previous menu"
        );
        System.out.println("---------------------------------------------------------------------------");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                gymOwnerService.viewAllGymOwners();
                break;
            case 2:
                gymOwnerService.register();
                break;
            case 3:
                gymCenterService.getAllCentresByOwmerId("123");
                break;
            case 4:
                gymOwnerService.requestGymOwnerApproval("123");
                break;
            case 5:
                gymCenterService.requestGymCentreApproval("gym123", "123");
                break;
            case 6:
                gymCenterService.addCenter("gymid123", "abc", "gym123", "gstin", "BLR", 50, false, 500);
                break;
            case 7:
                Date date = new Date();
                Slot slot = new Slot("slot123", "center123", date);
                gymOwnerService.addSlot(slot);
                break;
            case 8:
                gymOwnerService.gymOwnerChangePassword("abc", "old_password", "new_password");
                return;
            case 9:
                System.out.println(PREVIOUS_MENU_MESSAGE);
                return;
            default:
                System.out.println(INVALID_CHOICE_ERROR);
                break;
        }
        gymOwnerClientMainPage();
    }
}
