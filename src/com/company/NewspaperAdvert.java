package com.company;

public class NewspaperAdvert extends Advert {
    //private String advertType;

    public NewspaperAdvert(String advertTitle, String targetCompletionDate, int estimatedAdvertCost, int actualAdvertCost) {
        super(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
        super.advertType = "Newspaper";
    }

    public String getAdvertType() {
        return this.advertType;
    }
}
