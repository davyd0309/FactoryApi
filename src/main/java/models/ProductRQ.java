package models;

import lombok.*;
import models.enums.ProductType;

/**
 * Created by Konrad on 06.04.2019.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRQ {

    private int number;
    private ProductType type;
}
