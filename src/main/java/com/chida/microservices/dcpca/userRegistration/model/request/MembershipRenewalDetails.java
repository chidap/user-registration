package com.chida.microservices.dcpca.userRegistration.model.request;

import java.time.LocalDate;

public class MembershipRenewalDetails {

    //////// private members ////////////////

    //////// family / individual ////////

    private String membershipType;
    ///////// One year / Lifetime //////

    private String subscriptionType;
    private LocalDate membersipStartDate;
    private LocalDate membershipExpiryDate;
    private int subscriptionAmount;

    ////////////// Setters and Getters /////////


    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public LocalDate getMembersipStartDate() {
        return membersipStartDate;
    }

    public void setMembersipStartDate(LocalDate membersipStartDate) {
        this.membersipStartDate = membersipStartDate;
    }

    public LocalDate getMembershipExpiryDate() {
        return membershipExpiryDate;
    }

    public void setMembershipExpiryDate(LocalDate membershipExpiryDate) {
        this.membershipExpiryDate = membershipExpiryDate;
    }

    public int getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(int subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }
}
