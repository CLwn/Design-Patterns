public class Chocolate extends AddonDecorator {
   private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+"with chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.75;
    }
}
