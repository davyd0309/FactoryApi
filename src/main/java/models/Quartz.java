package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Judith on 29.12.2018.
 */

@Builder
public class Quartz {

    @Getter
    @Setter
    private String name = "Quartz";

    @Getter
    @Setter
    private String code = "323CCVV336";
}
