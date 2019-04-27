package models;

import lombok.Getter;
import lombok.Setter;
import models.enums.ProductType;

/**
 * Created by Judith on 06.04.2019.
 */
@Getter
@Setter
public class CreateProductRQ {

    private int number;
    private ProductType type;
}
