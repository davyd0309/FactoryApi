package models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

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

    public static Product defaultInstance(){
        return Product.builder()
                .id(UUID.randomUUID().variant())
                .name("Some name")
                .foundryDate(LocalDateTime.now())
                .build();
    }

}
