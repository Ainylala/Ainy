package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImageData {
    private String height;
    private String width;
    private String url;
    private String SourceId;
    private String SourceClass;
    private String describe;
}
