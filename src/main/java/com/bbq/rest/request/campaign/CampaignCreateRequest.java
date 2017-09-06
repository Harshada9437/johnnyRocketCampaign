package com.bbq.rest.request.campaign;

import java.util.List;

public class CampaignCreateRequest {
   private int id;
   private int smsAcc;
   private int campaignAdmin;
   private int noOfPerson;
   private int isAllow;
   private String name;
   private String desc;
   private String fromDate;
   private String shortCode;
   private String apiKey;
   private String toDate;
   private String confirmSms;
   private String confirmEmail;
   private String notifyEmail;
   private String campaignOverTxt;
   private String slotFullSms;
   private List<SlotDetails> slots;


}
