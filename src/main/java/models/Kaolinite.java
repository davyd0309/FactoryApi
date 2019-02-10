package models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Judith on 29.12.2018.
 */

@Builder
public class Kaolinite {

    @Getter
    @Setter
    private String name = "Kaolinite";

    @Getter
    @Setter
    private String code = "556FDDS123";
}
