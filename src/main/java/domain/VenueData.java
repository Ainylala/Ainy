package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VenueData {
    private String activitySize;
    private String address;
    private String ampm;
    private String appQrCodeUrl;
    private String area;
    private String canOrder;
    private String capacity;
    private String firstMedia;
    private String id;
    private String isCollect;
    private String isGuanZhu;
    private String latitude;
    private String liveList;
    private String liveSize;
    private String longitude;
    private String mediaList;
    private String mediaSize;
    private String name;
    private String openTime;
    private String orderDate;
    private String phone;
    private String poster;
    private String qrCodeUrl;
    private String tip;
    private String venueDesc;
    private ArrayList<String> venueImgs;
    private String venueMusicUrl;
    private String venueRank;
    private String venueRoam;
    private String venueRoutes;
    private String venueUse;
    private String venueViewing;
    private String vrUrl;
    private String week;
}
