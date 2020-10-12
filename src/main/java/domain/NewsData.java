package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsData {
    private String address;
    private String areaName;
    private String author;
    private String collectNum;
    private String content;
    private String createTime;
    private String demandSide;
    private String imgSrc;
    private String isCollect;
    private String isPraise;
    private String logicSourceId;
    private String openingHours;
    private String source;
    private String starAwardAccessNum;
    private String title;
    private String topicAccessNum;
    private String totalPraise;
    private String venueName;
    private String viewNum;
}
