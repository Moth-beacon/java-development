package com.pluralsight.ledgerapi2.models;

public class Transaction {
    private int transactionId;
    private double amount;
    private String vendor;

    public Transaction(int transactionId, double amount, String vendor) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.vendor = vendor;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getVendor() {
        return vendor;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
