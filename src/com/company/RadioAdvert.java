package com.company;

public class RadioAdvert extends Advert {
    //private String advertType;

    public RadioAdvert(String advertTitle, String targetCompletionDate, int estimatedAdvertCost, int actualAdvertCost) {
        super(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
        super.advertType = "Radio";
    }

    public String getAdvertType() {
        return this.advertType;
    }
}
