package com.company;

public class MagazineAdvert extends Advert {
    //private String advertType;

    public MagazineAdvert(String advertTitle, String targetCompletionDate, int estimatedAdvertCost, int actualAdvertCost) {
        super(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
        super.advertType = "Magazine";
    }

    public String getAdvertType() {
        return this.advertType;
    }
}
