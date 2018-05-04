package com.company;

public class PosterAdvert extends Advert {
    //private String advertType;

    public PosterAdvert(String advertTitle, String targetCompletionDate, int estimatedAdvertCost, int actualAdvertCost) {
        super(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
        super.advertType = "Poster";
    }

    public String getAdvertType() {
        return this.advertType;
    }
}
