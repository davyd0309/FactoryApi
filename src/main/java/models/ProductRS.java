package models;

import lombok.Getter;
import lombok.Setter;
import models.dto.ProductDto;

import java.util.List;

/**
 * Created by Judith on 06.04.2019.
 */

@Setter
@Getter
public class ProductRS {

    private List<ProductDto> productsList = List.of();


}
