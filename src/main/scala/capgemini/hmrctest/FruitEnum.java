package capgemini.hmrctest;

public enum FruitEnum {

    APPLE("Apple",60),
    ORANGE("Orange",25);

    private String name;
    private int cost;

    private FruitEnum(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

}
