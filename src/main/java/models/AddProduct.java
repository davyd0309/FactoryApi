package models;

import lombok.Getter;
import lombok.Setter;
import models.enums.ProductType;

@Setter
@Getter
public class AddProduct {

    private int number;
    private ProductType type;
}
