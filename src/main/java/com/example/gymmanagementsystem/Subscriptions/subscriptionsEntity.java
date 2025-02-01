package com.example.gymmanagementsystem.Subscriptions;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "subscriptions")
public class subscriptionsEntity {

    @Id
    private int subscription_id;
}
