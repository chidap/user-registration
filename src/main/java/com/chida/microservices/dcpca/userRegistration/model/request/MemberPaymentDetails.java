package com.chida.microservices.dcpca.userRegistration.model.request;

import java.time.LocalDate;

public class MemberPaymentDetails {

    ////////////// Private Members //////////////////////
    ////////////// Membership / Donation
    private int paymentType;
    private String paymentdescription;
    private String donationCategory;
    private int paidAmount;
    private LocalDate paymentDate;
    private String paymentInstrument;
    private String instrumentNo;
    private String paymentStatus;

    ////////////// Setters & Getters /////////////////////


    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentdescription() {
        return paymentdescription;
    }

    public void setPaymentdescription(String paymentdescription) {
        this.paymentdescription = paymentdescription;
    }

    public String getDonationCategory() {
        return donationCategory;
    }

    public void setDonationCategory(String donationCategory) {
        this.donationCategory = donationCategory;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public String getInstrumentNo() {
        return instrumentNo;
    }

    public void setInstrumentNo(String instrumentNo) {
        this.instrumentNo = instrumentNo;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
