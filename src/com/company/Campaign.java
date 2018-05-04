package com.company;

import com.company.Model.CreativeStaff;

import java.util.ArrayList;

public class Campaign {
    private String title;
    private String campaignStartDate;
    private String campaignFinishDate;
    private int estimatedCost;
    private ArrayList<Advert> campaignAdverts = new ArrayList<Advert>();
    private ArrayList<CreativeStaff> creativeStaffOfCampaign = new ArrayList<CreativeStaff>();


    public Campaign(String title, String campaignStartDate, String campaignFinishDate, int estimatedCost) {
        this.title = title;
        this.campaignStartDate = campaignStartDate;
        this.campaignFinishDate = campaignFinishDate;
        this.estimatedCost = estimatedCost;
    }

    public void addNewAdvert(Advert advert) {
        this.campaignAdverts.add(advert);
    }

    public ArrayList<Advert> getCampaignAdverts() {
        return this.campaignAdverts;
    }

    public void addNewStaffToCampaign(CreativeStaff creativeStaff) {
        this.creativeStaffOfCampaign.add(creativeStaff);
    }

    public ArrayList<CreativeStaff> getCreativeStaffOfCampaign() {
        return this.creativeStaffOfCampaign;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCampaignStartDate() {
        return this.campaignStartDate;
    }

    public String getCampaignFinishDate() {
        return this.campaignFinishDate;
    }

    public int getEstimatedCost() {
        return this.estimatedCost;
    }
}
