package models.enums;

/**
 * Created by Konrad on 06.04.2019.
 */
public enum ProductType {

    WASHBASIN("washbasin", "WAS4588568",123),
    COMPACT_BOWL("compact bowl", "CB1236654",200),
    URINAL("urinal", "UR5687449",98);

    private String name;
    private String code;
    private double amountOfMass;

    ProductType(String name, String code,int amountOfMass) {
        this.name = name;
        this.code = code;
        this.amountOfMass = amountOfMass;
    }

    public double getAmountOfMass() {
        return amountOfMass;
    }
}
