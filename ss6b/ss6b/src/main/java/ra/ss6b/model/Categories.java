package ra.ss6b.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Categories {
    private int catalogId;
    private String catalogName;
    private String description;
    private boolean status;
}