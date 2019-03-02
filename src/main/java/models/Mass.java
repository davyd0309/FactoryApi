package models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Judith on 22.12.2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Mass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double weight;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "name", column = @Column(name = "clayName")),
            @AttributeOverride(name = "code", column = @Column(name = "clayCode"))
    })
    private Clay clay;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "name", column = @Column(name = "quartzName")),
            @AttributeOverride(name = "code", column = @Column(name = "quartzCode"))
    })
    private Quartz quartz;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "name", column = @Column(name = "kaoliniteName")),
            @AttributeOverride(name = "code", column = @Column(name = "kaoliniteCode"))
    })
    private Kaolinite kaolinite;

}
