package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LiveReturnData {
    private String returnCode;
    private String returnMsg;
    private LiveData returnData;
}
