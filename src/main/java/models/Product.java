package models;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created by Judith on 09.12.2018.
 */

@Builder
@Getter
public class Product {

    private Integer id;
    private String name;
    private Employee foundryEmployee;
    private LocalDateTime foundryDate;


}
