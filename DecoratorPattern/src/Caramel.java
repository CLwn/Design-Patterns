public class Caramel extends AddonDecorator {
    private Beverage beverage;


    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+"with caramel";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
