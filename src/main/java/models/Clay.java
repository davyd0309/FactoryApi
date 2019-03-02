package models;

import lombok.*;

import javax.persistence.Embeddable;

/**
 * Created by Judith on 29.12.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Clay {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String code;


}
