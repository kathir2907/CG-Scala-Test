package capgemini.hmrctest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum FruitEnum {

    APPLE("Apple",new BigDecimal(0.60)),
    ORANGE("Orange",new BigDecimal(0.25)),
    BANANA("Banana",new BigDecimal(0.20));

    private String name;
    private BigDecimal cost;

    private FruitEnum(String name, BigDecimal cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCost() {
        return cost.setScale(2, RoundingMode.HALF_UP);
    }

}
