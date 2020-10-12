package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsSaveData {
    private String searchTitle;
    private String coverUrl;
    private String sourceId;
    private String SourceClass;
    private String title;
    private String address;
    private String areaName;
    private String author;
    private String content;
    private String html;
    private String createTime;
    private String venueName;
    private ArrayList<ImageData> images;
}
