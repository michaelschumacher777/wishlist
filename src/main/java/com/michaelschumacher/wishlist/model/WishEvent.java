package com.michaelschumacher.wishlist.model;

import java.time.LocalDate;

public class WishEvent extends BaseEntity {
    private WishEventType wishEventType;
    private LocalDate wishEventDate;

    public WishEventType getWishEventType() {
        return wishEventType;
    }

    public void setWishEventType(WishEventType wishEventType) {
        this.wishEventType = wishEventType;
    }

    public LocalDate getWishEventDate() {
        return wishEventDate;
    }

    public void setWishEventDate(LocalDate wishEventDate) {
        this.wishEventDate = wishEventDate;
    }
}
