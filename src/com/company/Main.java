package com.company;

import com.company.Model.CreativeStaff;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Client> clients = new HashMap<>();
        Map<String, Campaign> campaigns = new HashMap<>();
        Map<String, CreativeStaff> staffs = new HashMap<>();
        Map<String, Advert> adverts = new HashMap<>();
        /*Creating new client for test*/
        Client client1 = new Client("Mnm", "Fenerbahçe", "Talip");
        /*Addling client object to a listing purpose arraylist*/
        clients.put("client", client1);
        /*Creating new campaign for test*/
        Campaign campaign1 = new Campaign("Indirim", "13/04/2018", "15/04/2018", 500);
        /*Addling client object to a listing purpose arraylist*/
        campaigns.put("campaign1", campaign1);
        /*Creating new campaign for test*/
        Campaign campaign2 = new Campaign("Indirim2", "13/04/2018", "15/04/2018", 1500);
        /*Addling client object to a listing purpose arraylist*/
        campaigns.put("campaign2", campaign2);
        /*Adding campaign to client*/
        client1.addNewCampaign(campaign1);

        /*Creating new creative staff*/
        CreativeStaff staff1 = new CreativeStaff(1, "staffNumberOne", "02/05/2018", "staffNumberOne@agate.com");
        /*Creating new creative staff*/
        CreativeStaff staff2 = new CreativeStaff(2, "staffNumberTwo", "03/05/2018", "staffNumberTwo@agate.com");
        /*Adding staff object to a listing purpose arrayList*/
        staffs.put("staff1", staff1);
        /*Adding staff object to a listing purpose arrayList*/
        staffs.put("staff2", staff2);
        /*Adding staff to campaign1*/
        campaign1.addNewStaffToCampaign(staff1);
        campaign1.addNewStaffToCampaign(staff2);
        /*Adding staff to campaign2*/
        campaign2.addNewStaffToCampaign(staff2);

        /*Creating new magazine advert*/
        MagazineAdvert magazineAdvert1 = new MagazineAdvert("Famous", "yarın", 500, 750);
        /*Adding advert object to a listing purpose arrayList*/
        adverts.put("magazineAdvert1", magazineAdvert1);
        /*Adding magazine advert to campaign*/
        campaign2.addNewAdvert(magazineAdvert1);

        /*User choice value*/
        int choice;

        /*User created client attributes*/
        String clientName;
        String companyName;
        String companyAddress;
        String contactName;

        /*User created campaign attributes*/
        String campaignName;
        String title;
        String campaignStartDate;
        String campaignFinishDate;

        /*User created staff attributes*/
        String staffName;
        int staffNo;
        String staffStartDate;
        String staffEmailAddress;
        int estimatedCost;

        /*User created advert attributes*/
        String advertName;
        int advertChoice;
        String advertType;
        String advertTitle;
        String targetCompletionDate;
        int estimatedAdvertCost;
        int actualAdvertCost;
        Advert advert = new Advert();

        Scanner input = new Scanner(System.in);

        do {
            /*Choice area*/
            System.out.println("0) Exit");
            System.out.println("1) Create new Client");
            System.out.println("2) Create new Campaign");
            System.out.println("3) List all Campaigns");
            System.out.println("4) List all Clients");
            System.out.println("5) Add Campaign to Client");
            System.out.println("6) List client campaigns");
            System.out.println("7) List staffs of campaign");
            System.out.println("8) Create new staff");
            System.out.println("9) List all Staffs");
            System.out.println("10) Create new Advert");
            System.out.println("11) List all Adverts");
            System.out.println("12) Add staff to campaign");



            /*Choice value*/
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    /*Getting client name*/
                    System.out.println("Enter Client name");
                    clientName = input.nextLine();
                    clientName = input.nextLine();
                    /*Checking if client exist if exist re-enter client name*/
                    if (clients.containsKey(clientName)) {
                        do {
                            System.out.println("There is a client with this name, please enter again");
                            clientName = input.nextLine();
                        } while (clients.containsKey(clientName));

                    }
                    /*Getting company name*/
                    System.out.println("Enter company name");
                    companyName = input.nextLine();
                    /*Getting company name*/
                    System.out.println("Enter company address");
                    companyAddress = input.nextLine();
                    /*Getting contact name*/
                    System.out.println("Enter contact name");
                    contactName = input.nextLine();
                    /*Putting new client object to clients map*/
                    clients.put(clientName, new Client(companyName, companyAddress, contactName));
                    break;
                case 2:
                    /*Getting campaign name*/
                    System.out.println("Enter Campaign name");
                    campaignName = input.nextLine();
                    campaignName = input.nextLine();
                    /*Checking if campaign exist, if exist re-enter campaign name*/
                    if (campaigns.containsKey(campaignName)) {
                        do {
                            System.out.println("There is a campaign with this name, please enter again");
                            campaignName = input.nextLine();
                        } while (!campaigns.containsKey(campaignName));

                    }
                    /*Getting title*/
                    System.out.println("Enter title");
                    title = input.nextLine();
                    /*Getting campaign start date*/
                    System.out.println("Enter campaign start date");
                    campaignStartDate = input.nextLine();
                    /*Geting campaign finish date*/
                    System.out.println("Enter campaign finish date");
                    campaignFinishDate = input.nextLine();
                    /*Getting estimated cost*/
                    System.out.println("Enter estimated cost");
                    estimatedCost = input.nextInt();
                    /*Putting new campaign object to campaigns map*/
                    campaigns.put(campaignName, new Campaign(title, campaignStartDate, campaignFinishDate, estimatedCost));
                    break;
                case 3:
                    /*Listing all the campaigns*/
                    for (String key : campaigns.keySet()) {
                        System.out.print("Campaign name : " + key);
                        System.out.println(" | Campaign title : " + campaigns.get(key).getTitle() + " | Campaign start date : " + campaigns.get(key).getCampaignStartDate() + " | Campaign finish date : " + campaigns.get(key).getCampaignFinishDate() + " | Campaign estimated cost : " + campaigns.get(key).getEstimatedCost());
                    }
                    break;
                case 4:
                    /*Listing all the clients*/
                    for (String key : clients.keySet()) {
                        System.out.print("Client name : " + key);
                        System.out.println(" | Client company name : " + clients.get(key).getCompanyName() + " | Client company address : " + clients.get(key).getCompanyAddress() + " | Client contact name : " + clients.get(key).getContactName());
                    }
                    break;
                case 5:
                    /*Getting client name*/
                    System.out.println("Enter a client name that you want to add campaign");
                    clientName = input.nextLine();
                    clientName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter client name*/
                    if (!clients.containsKey(clientName)) {
                        do {
                            System.out.println("There is not a client with this name, please choose one of these");
                            for (String key : clients.keySet()) {
                                System.out.println("Client name : " + key);
                            }
                            System.out.println("Enter a client name that you want to add campaign");
                            clientName = input.nextLine();
                        } while (!clients.containsKey(clientName));

                    }
                    /*Getting campaign name*/
                    System.out.println("Enter a campaign name to add the client");
                    campaignName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter campaign name*/
                    if (!campaigns.containsKey(campaignName)) {
                        do {
                            System.out.println("There is not a campaign with this name, please choose one of these");
                            for (String key : campaigns.keySet()) {
                                System.out.println("Campaign name : " + key);
                            }
                            System.out.println("Enter a campaign name to add the client");
                            campaignName = input.nextLine();
                        } while (!campaigns.containsKey(campaignName));

                    }
                    /*Getting the campaign that entered*/
                    Campaign campaign = campaigns.get(campaignName);
                    /*Getting the client that entered*/
                    Client client = clients.get(clientName);
                    /*Adding the campaign to client*/
                    client.addNewCampaign(campaign);
                    break;
                case 6:
                    /*Getting client name*/
                    System.out.println("Enter a client name");
                    clientName = input.nextLine();
                    clientName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter client name*/
                    if (!clients.containsKey(clientName)) {
                        do {
                            System.out.println("There is not a client with this name, please choose one of these");
                            for (String key : clients.keySet()) {
                                System.out.println("Client name : " + key);
                            }
                            System.out.println("Enter a client name");
                            clientName = input.nextLine();
                        } while (!clients.containsKey(clientName));

                    }
                    /*Getting the client that entered*/
                    Client client2 = clients.get(clientName);
                    /*Checking if client has campaign, if not return a message*/
                    if (client2.getClientCampaigns().size() > 0) {
                        for (int key = 0; key < client2.getClientCampaigns().size(); key++) {
                            System.out.print("Campaign name : " + clientName);
                            System.out.println(" |  Campaign title : " + client2.getClientCampaigns().get(key).getTitle() + " |  Campaign start date : " + client2.getClientCampaigns().get(key).getCampaignStartDate() + " | Campaign finish date : " + client2.getClientCampaigns().get(key).getCampaignFinishDate() + " |  Campaign estimated cost : " + client2.getClientCampaigns().get(key).getEstimatedCost());
                        }
                    } else {
                        System.out.println("This client doesn't have any campaign");
                    }

                    break;
                case 7:
                    /*Getting client name*/
                    System.out.println("Enter a campaign name");
                    for (String key : campaigns.keySet()) {
                        System.out.println("Campaign name : " + key);
                    }
                    campaignName = input.nextLine();
                    campaignName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter client name*/
                    if (!campaigns.containsKey(campaignName)) {
                        do {
                            System.out.println("There is not a campaign with this name, please choose one of these");
                            for (String key : campaigns.keySet()) {
                                System.out.println("Campaign name : " + key);
                            }
                            System.out.println("Enter a campaign name");
                            campaignName = input.nextLine();
                        } while (!campaigns.containsKey(campaignName));

                    }
                    /*Getting the client that entered*/
                    Campaign campaign3 = campaigns.get(campaignName);
                    /*Checking if client has campaign, if not return a message*/
                    if (campaign3.getCreativeStaffOfCampaign().size() > 0) {
                        for (int key = 0; key < campaign3.getCreativeStaffOfCampaign().size(); key++) {
                            System.out.print("Campaign name : " + campaignName);
                            System.out.println(" |  Staff No : " + campaign3.getCreativeStaffOfCampaign().get(key).getStaffNo() + " |  Staff Name : " + campaign3.getCreativeStaffOfCampaign().get(key).getStaffName() + " | Staff Start Date : " + campaign3.getCreativeStaffOfCampaign().get(key).getStaffStartDate() + " |  Staff Email Address : " + campaign3.getCreativeStaffOfCampaign().get(key).getStaffEmailAddress());
                        }
                    } else {
                        System.out.println("This client doesn't have any campaign");
                    }
                    break;
                case 8:
                    /*Getting Staff name*/
                    System.out.println("Enter Staff name");
                    staffName = input.nextLine();
                    staffName = input.nextLine();
                    /*Checking if client exist if exist re-enter client name*/
                    if (staffs.containsKey(staffName)) {
                        do {
                            System.out.println("There is a staff with this name, please enter again");
                            staffName = input.nextLine();
                        } while (staffs.containsKey(staffName));

                    }
                    /*Getting staff no*/
                    System.out.println("Enter staff no");
                    staffNo = input.nextInt();
                    /*Getting staff start date*/
                    System.out.println("Enter staff start date");
                    staffStartDate = input.nextLine();
                    staffStartDate = input.nextLine();
                    /*Getting staff email address*/
                    System.out.println("Enter staff email address");
                    staffEmailAddress = input.nextLine();
                    /*Putting new staff object to staffs map*/
                    staffs.put(staffName, new CreativeStaff(staffNo, staffName, staffStartDate, staffEmailAddress));
                    break;
                case 9:
                    /*Listing all the staff*/
                    for (String key : staffs.keySet()) {
                        System.out.print("Staff name : " + key);
                        System.out.println(" |  Staff No : " + staffs.get(key).getStaffNo() + " |  Staff Name : " + staffs.get(key).getStaffName() + " | Staff Start Date : " + staffs.get(key).getStaffStartDate() + " |  Staff Email Address : " + staffs.get(key).getStaffEmailAddress());
                    }
                    break;
                case 10:
                    /*Getting Advert name*/
                    System.out.println("Enter Advert name");
                    advertName = input.nextLine();
                    advertName = input.nextLine();
                    /*Checking if client exist if exist re-enter advert name*/
                    if (adverts.containsKey(advertName)) {
                        do {
                            System.out.println("There is a advert with this name, please enter again");
                            staffName = input.nextLine();
                        } while (adverts.containsKey(advertName));

                    }

                    /*Getting advert title*/
                    System.out.println("Enter advert title");
                    advertTitle = input.nextLine();
                    /*Getting advert title*/
                    System.out.println("Enter advert target completion date");
                    targetCompletionDate = input.nextLine();
                    /*Getting contact name*/
                    System.out.println("Enter estimated advert cost");
                    estimatedAdvertCost = input.nextInt();
                    System.out.println("Enter actual advert cost");
                    actualAdvertCost = input.nextInt();

                    /*Getting advert type*/
                    System.out.println("Select advert type");
                    System.out.println("1) Magazine");
                    System.out.println("2) Leaflet");
                    System.out.println("3) Newspaper");
                    System.out.println("4) Poser");
                    System.out.println("5) Radio");

                    advertChoice = input.nextInt();
                    switch (advertChoice) {
                        case 1:
                            advert = new MagazineAdvert(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
                            break;
                        case 2:
                            advert = new LeafletAdvert(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
                            break;
                        case 3:
                            advert = new NewspaperAdvert(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
                            break;
                        case 4:
                            advert = new PosterAdvert(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
                            break;
                        case 5:
                            advert = new RadioAdvert(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
                            break;
                    }

                    /*Putting new advert object to adverts map*/
                    adverts.put(advertName, advert);
                    break;
                case 11:
                    /*Listing all the adverts*/
                    for (String key : adverts.keySet()) {
                        System.out.print("Advert name : " + key);
                        System.out.println(" | Advert type : " + adverts.get(key).getAdvertType() + " | Advert Title : " + adverts.get(key).getAdvertTitle() + " | Advert target completion date : " + adverts.get(key).getTargetCompletionDate() + " | Advert estimated cost : " + adverts.get(key).getEstimatedAdvertCost() + " | Advert actual cost : " + adverts.get(key).getActualAdvertCost());
                    }
                    break;
                case 12:
                    /*Getting client name*/
                    System.out.println("Enter a staff name that you want to add campaign");
                    for (String key : staffs.keySet()) {
                        System.out.println("Staff name : " + key);
                    }
                    staffName = input.nextLine();
                    staffName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter client name*/
                    if (!staffs.containsKey(staffName)) {
                        do {
                            System.out.println("There is not a staff with this name, please choose one of these");
                            for (String key : staffs.keySet()) {
                                System.out.println("Staff name : " + key);
                            }
                            System.out.println("Enter a staff name that you want to add campaign");
                            staffName = input.nextLine();
                        } while (!staffs.containsKey(staffName));

                    }
                    /*Getting campaign name*/
                    System.out.println("Enter a campaign name to add the staff");
                    for (String key : campaigns.keySet()) {
                        System.out.println("Campaign name : " + key);
                    }
                    campaignName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter campaign name*/
                    if (!campaigns.containsKey(campaignName)) {
                        do {
                            System.out.println("There is not a campaign with this name, please choose one of these");
                            for (String key : campaigns.keySet()) {
                                System.out.println("Campaign name : " + key);
                            }
                            System.out.println("Enter a campaign name to add the staff");
                            campaignName = input.nextLine();
                        } while (!campaigns.containsKey(campaignName));

                    }
                    /*Getting the campaign that entered*/
                    Campaign campaign4 = campaigns.get(campaignName);
                    /*Getting the client that entered*/
                    CreativeStaff staff3 = staffs.get(staffName);
                    /*Adding the campaign to client*/
                    campaign4.addNewStaffToCampaign(staff3);
                    break;
                default:
                    /*Exit message*/
                    System.out.println("Good bye!");
            }
            /*Exit*/
        } while (choice != 0);


    }
}