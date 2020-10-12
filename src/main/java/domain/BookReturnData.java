package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookReturnData {
    private String returnCode;
    private String returnMsg;
    private BookData returnData;
}
