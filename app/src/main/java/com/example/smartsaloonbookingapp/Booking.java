package com.example.smartsaloonbookingapp;

public class Booking {
    private String SalonService, ServiceStyle, ServicePrice, ServiceDate;
    public Booking() {

    }

    public Booking(String salonService, String serviceStyle, String servicePrice, String serviceDate) {
        SalonService = salonService;
        ServiceStyle = serviceStyle;
        ServicePrice = servicePrice;
        ServiceDate = serviceDate;
    }

    public String getSalonService() {
        return SalonService;
    }

    public void setSalonService(String salonService) {
        SalonService = salonService;
    }

    public String getServiceStyle() {
        return ServiceStyle;
    }

    public void setServiceStyle(String serviceStyle) {
        ServiceStyle = serviceStyle;
    }

    public String getServicePrice() {
        return ServicePrice;
    }

    public void setServicePrice(String servicePrice) {
        ServicePrice = servicePrice;
    }

    public String getServiceDate() {
        return ServiceDate;
    }

    public void setServiceDate(String serviceDate) {
        ServiceDate = serviceDate;
    }
}
