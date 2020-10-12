package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActivityData {
    private String activityDesc;
    private String address;
    private String assistSponsor;
    private String bookingFlag;
    private String bookingStatus;
    private String canAppleFlag;
    private String collectFlag;
    private String endDate;
    private String endTime;
    private String handleSponsor;
    private String id;
    private String isAllowThirdOrder;
    private String isExpire;
    private String labelId;
    private String latitude;
    private String longitude;
    private String maxNum;
    private String name;
    private String orderNotice;
    private String phone;
    private String poster;
    private String prompt;
    private String reserveNum;
    private String sponsor;
    private String startDate;
    private String startTime;
    private String status;
    private String surplusNum;
    private String thirdAppOrderUrl;
    private String thirdOrderUrl;
    private String totalNum;
    private String venueId;
    private String venueName;
    private String venueRank;
    private String venueRankName;
}
