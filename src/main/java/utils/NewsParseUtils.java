package utils;

import domain.ImageData;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class NewsParseUtils {
    public static String parseContent(String html) {
        String s = null;
        Elements p = Jsoup.parse(html).getElementsByTag("p");
        for (Element element : p) {
            s += element.text();
        }
        return s;
    }

    public static ArrayList<ImageData> parseImage(String sourceId, String html) {
        ArrayList<ImageData> images = new ArrayList<ImageData>();
        String src = null;
        String height = null;
        String width = null;
        Elements elements = Jsoup.parse(html).getElementsByTag("img");
        for (Element element : elements) {
            ImageData image = new ImageData();
            Element tempElement = element.parent();
            while (tempElement != null) {
                tempElement = tempElement.nextElementSibling();
                if (tempElement != null &&
                        "p".equals(tempElement.tagName())) {
                    if (!"".equals(tempElement.text())) {
                        image.setDescribe(tempElement.text());
                        break;
                    }
                }

            }
            image.setUrl(element.attr("src"));
            height = element.attr("height");
            if (height != null & height != "")
                image.setHeight(height);
            width = element.attr("width");
            if (width != null & width != "")
                image.setWidth(width);
            image.setSourceId(sourceId);
            image.setSourceClass("newsData");
            images.add(image);
        }
        return images;
    }
}