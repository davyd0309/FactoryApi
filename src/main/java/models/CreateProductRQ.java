package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.enums.ProductType;

/**
 * Created by Konrad on 06.04.2019.
 */
@Getter
@Setter
@Builder
public class CreateProductRQ {

    private int number;
    private ProductType type;
}
