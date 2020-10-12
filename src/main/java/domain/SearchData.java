package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchData {
    private String totalRow;
    private String returnCode;
    private String returnMsg;
    private String pageNumber;
    private String totalPage;
    private String pageSize;
    private ArrayList<ReturnData> returnData;
}
