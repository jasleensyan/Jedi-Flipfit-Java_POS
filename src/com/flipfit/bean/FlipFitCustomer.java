package com.flipfit.bean;

public class FlipFitCustomer extends User {


    private String customerPhone;
    private String cardDetails;

    public FlipFitCustomer() {
    }

    public FlipFitCustomer(String userId, String userName, String email, String password, String customerPhone, String cardDetails) {
        super(userId, userName, email, password);
        this.customerPhone = customerPhone;
        this.cardDetails = cardDetails;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

}
