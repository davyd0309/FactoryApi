package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.enums.ProductType;

@Setter
@Getter
@Builder
public class AddProduct {

    private int number;
    private ProductType type;
}
