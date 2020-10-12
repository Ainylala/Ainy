package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReturnData {
    private String total;
    private String areaId;
    private String num;
    private String name;       //标题
    private String updateTime;
    private String id;         //资源标题
    private String collectionId;//集合ID
    private String url;        //图片地址
    private String dicType;    //资源类型
    private String dic;
}
