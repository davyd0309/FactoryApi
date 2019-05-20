package models;

import lombok.*;

import javax.persistence.Embeddable;

/**
 * Created by Konrad on 29.12.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Quartz {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String code;
}
