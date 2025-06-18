package com.pluralsight.ledgerapi2.controllers;

import com.pluralsight.ledgerapi2.models.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpendingTracker {

    private List<Transaction> purchaseList;

    public SpendingTracker() {
        this.purchaseList = new ArrayList<>();

        // Sample transactions
        purchaseList.add(new Transaction(1, 150.75, "Amazon"));
        purchaseList.add(new Transaction(2, 89.99, "Walmart"));
        purchaseList.add(new Transaction(3, 200.00, "Best Buy"));
    }

    @RequestMapping(path = "/transactions", method = RequestMethod.GET)
    public List<Transaction> getAllPurchases() {
        return purchaseList;
    }
}
