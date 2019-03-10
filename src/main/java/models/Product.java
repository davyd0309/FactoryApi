package models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Judith on 09.12.2018.
 */

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Transient
    private Employee foundryEmployee;

    private LocalDateTime foundryDate;


}
