package models.enums;

/**
 * Created by Judith on 06.04.2019.
 */
public enum ProductType {

    WASHBASIN("washbasin", "WAS4588568"),
    COMPACT_BOWL("compact bowl", "CB1236654"),
    URINAL("urinal", "UR5687449"
    );

    private String name;
    private String code;

    ProductType(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
