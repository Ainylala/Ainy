package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VoiceData {
    private String musicTime;
    private String orderNo;
    private String posterUrl;
    private String listenNum;
    private String author;
    private String MusicUrl;
    private String resId;
    private String musicName;
}
