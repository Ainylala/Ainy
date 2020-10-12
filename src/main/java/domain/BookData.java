package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookData {
    private String author;
    private String beginRead;
    private String categoryId;
    private String categoryName;
    private String collectFlag;
    private String fileRoot;
    private String id;
    private String memo;
    private String name;
}
