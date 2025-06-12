package com.pluralsight;

public class Shipper {
    private int shipperId;
    private String companyName;
    private String phone;

    public Shipper(int shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }

    public Shipper(String companyName, String phone) {
        this.companyName = companyName;
        this.phone = phone;
    }

    public int getShipperId() {
        return shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Shipper ID: " + shipperId + ", Company: " + companyName + ", Phone: " + phone;
    }
}
