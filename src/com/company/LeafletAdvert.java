package com.company;

public class LeafletAdvert extends Advert {
    //private String advertType;

    public LeafletAdvert(String advertTitle, String targetCompletionDate, int estimatedAdvertCost, int actualAdvertCost) {
        super(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
        super.advertType = "Leaflet";
    }

    public String getAdvertType() {
        return this.advertType;
    }
}
