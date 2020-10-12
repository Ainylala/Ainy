package utils;


import domain.ReturnData;
import domain.SearchData;

import java.net.URLEncoder;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws Exception{
        HttpRequest httpRequest = new HttpRequest();
        JsonUtils jsonUtils = new JsonUtils();
        ArrayList<SearchData> searchDatas = httpRequest.getSearchData(URLEncoder.encode("瓷器","utf-8"));
        if (searchDatas!=null)
        for (SearchData searchData : searchDatas) {
            ArrayList<ReturnData> returnDatas = searchData.getReturnData();
            for (ReturnData returnData : returnDatas) {
                String dicType = returnData.getDicType();
                if (dicType.equals("DIC_RESOURCE_TYPE_1")) {
                    if ("0".equals(returnData.getCollectionId()))
                        System.out.println(jsonUtils.getVideoData(returnData.getId()));
                    else
                        System.out.println(jsonUtils.getVideoData(returnData.getCollectionId(), returnData.getId()));
                } else if (dicType.equals("DIC_RESOURCE_TYPE_5"))
                    System.out.println(jsonUtils.getNewsSaveData(returnData.getId()));
                else if (dicType.equals("DIC_RESOURCE_TYPE_7"))
                    System.out.println(jsonUtils.getActivityData(returnData.getId()));
                else if (dicType.equals("DIC_RESOURCE_TYPE_3"))
                    System.out.println(jsonUtils.getBookData(returnData.getId()));
                else if (dicType.equals("DIC_RESOURCE_TYPE_8"))
                    System.out.println(jsonUtils.getLiveData(returnData.getId()));
                else if (dicType.equals("DIC_RESOURCE_TYPE_9"))
                    System.out.println(jsonUtils.getVenueData(returnData.getId()));
                else if (dicType.equals("DIC_RESOURCE_TYPE_2"))
                    System.out.println(jsonUtils.getVoiceData(returnData.getId()));
                else
                    continue;
            }
        }
    }

    //        System.out.println(new JsonUtils().getNewsSaveData("44283"));
    //       new JsonUtils().getActivitySaveData("38738");
    //       System.out.println(new JsonUtils().getVideoData("20863","23787"));
    //          System.out.println(new JsonUtils().getBookData("185981"));
    //     System.out.println(new JsonUtils().getVenueData("20397"));
    //    System.out.println(new JsonUtils().getVoiceData("52057"));
    //    System.out.println(new JsonUtils().getLiveData("191434"));
}
