package utils;

import com.alibaba.fastjson.JSON;
import domain.*;

import java.util.ArrayList;

public class JsonUtils {
    public ActivityData getActivityData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String activity = httpRequest.getResourceById("api_get_getActivityByDetail", "activityId=" + resourceId);
        ActivityReturnData activityReturnData = JSON.parseObject(activity, ActivityReturnData.class);
        ActivityData returnData = activityReturnData.getReturnData();
        return returnData;
    }

    public BookData getBookData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String book = httpRequest.getResourceById("api_get_resBookDetail", "resId=" + resourceId);
        BookReturnData bookReturnData = JSON.parseObject(book, BookReturnData.class);
        BookData bookData = bookReturnData.getReturnData();
        if (bookData == null)
            return null;
        String beginRead = bookData.getBeginRead();
        bookData.setBeginRead("https://haidian2.hanyastar.com.cn/" + beginRead);
        return bookData;
    }

    public LiveData getLiveData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String live = httpRequest.getResourceById("api_post_getLiveDetailBySourceId", "logicSourceId=" + resourceId);
        LiveReturnData liveReturnData = JSON.parseObject(live, LiveReturnData.class);
        LiveData liveData = liveReturnData.getReturnData();
        return liveData;
    }

    public VenueData getVenueData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String venue = httpRequest.getResourceById("api_get_getVenueDetail", "venueId=" + resourceId);
        VenueReturnData venueReturnData = JSON.parseObject(venue, VenueReturnData.class);
        VenueData returnData = venueReturnData.getReturnData();
        return returnData;
    }
    public VideoData getVideoData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String video = httpRequest.getResourceById("api_get_getBizPubCategoryDetail", "collectionId=" + resourceId);
        VideoReturnData videoReturnData = JSON.parseObject(video, VideoReturnData.class);
        ArrayList<VideoData> returnData = videoReturnData.getReturnData();
        return returnData.get(0);
    }

    public VideoData getVideoData(String collectionId, String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String video = httpRequest.getResourceById("api_get_getBizPubCategoryDetail", "collectionId=" + collectionId);
        VideoReturnData videoReturnData = JSON.parseObject(video, VideoReturnData.class);
        ArrayList<VideoData> returnData = videoReturnData.getReturnData();
        for (VideoData returnDatum : returnData) {
            if (returnDatum.getMDetailId().equals(resourceId))
                return returnDatum;
        }
        return null;
    }

    public ArrayList<VoiceData> getVoiceData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String voice = httpRequest.getResourceById("api_get_getMusicDetailVideo", "logicSourceId=" + resourceId);
        VoiceReturnData voiceReturnData = JSON.parseObject(voice, VoiceReturnData.class);
        ArrayList<VoiceData> returnData = voiceReturnData.getReturnData();
        return returnData;
    }

    public NewsSaveData getNewsSaveData(String resourceId) {
        HttpRequest httpRequest = new HttpRequest();
        String news = httpRequest.getResourceById("api_post_getLiveNewsDetail", "logicSourceId=" + resourceId);
        NewsReturnData newsReturnData = JSON.parseObject(news, NewsReturnData.class);
        ArrayList<NewsData> returnDatas = newsReturnData.getReturnData();
        NewsData newsData = returnDatas.get(0);
        NewsSaveData newsSaveData = null;
        if (newsData != null) {
            newsSaveData = new NewsSaveData();
            newsSaveData.setAddress(newsData.getAddress());
            newsSaveData.setAreaName(newsData.getAreaName());
            newsSaveData.setAuthor(newsData.getAuthor());
            newsSaveData.setCreateTime(newsData.getCreateTime());
            newsSaveData.setHtml(newsData.getContent());
            newsSaveData.setSourceId(newsData.getLogicSourceId());
            newsSaveData.setSourceClass("newsData");
            newsSaveData.setVenueName(newsSaveData.getVenueName());
            newsSaveData.setContent((new NewsParseUtils().parseContent(newsData.getContent())));
            newsSaveData.setImages(new NewsParseUtils().parseImage(resourceId, newsData.getContent()));
        }
        return newsSaveData;
    }
}
