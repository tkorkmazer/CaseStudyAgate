package com.company;

public class Advert {
    protected String advertType;
    private String advertTitle;
    private String targetCompletionDate;
    private int estimatedAdvertCost;
    private int actualAdvertCost;

    public Advert(){

    }
    public Advert(String advertTitle, String targetCompletionDate, int estimatedAdvertCost, int actualAdvertCost) {
        this.advertTitle = advertTitle;
        this.targetCompletionDate = targetCompletionDate;
        this.estimatedAdvertCost = estimatedAdvertCost;
        this.actualAdvertCost = actualAdvertCost;
    }

    public int getCost(){
        return this.actualAdvertCost;
    }

    public String getAdvertTitle() {
        return advertTitle;
    }

    public String getTargetCompletionDate() {
        return targetCompletionDate;
    }

    public String getAdvertType() {
        return advertType;
    }

    public int getEstimatedAdvertCost() {
        return this.estimatedAdvertCost;
    }

    public int getActualAdvertCost() {
        return this.actualAdvertCost;
    }
}
