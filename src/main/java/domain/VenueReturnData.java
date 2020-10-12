package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VenueReturnData {
    private String returnCode;
    private String returnMsg;
    private VenueData returnData;
}
