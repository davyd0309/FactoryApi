package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by Judith on 22.12.2018.
 */
@Builder
@Getter
public class Mass {

    private Integer id;
    @Setter
    private double weight;
    private Clay clay;
    private Quartz quartz;
    private Kaolinite kaolinite;


}
