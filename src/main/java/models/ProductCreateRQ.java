package models;

import lombok.*;
import models.enums.ProductType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konrad on 06.04.2019.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCreateRQ {

    List<AddProduct> productList = new ArrayList<>();
}
