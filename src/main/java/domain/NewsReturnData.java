package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsReturnData {
    private String returnCode;
    private String returnMsg;
    private ArrayList<NewsData> returnData;
}
