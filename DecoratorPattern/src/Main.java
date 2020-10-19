public class Main {

    public static void main(String[] args) {

        Beverage coffe = new Espresso();
        coffe = new Caramel(coffe);

        Beverage coffe2 = new Moca();
        coffe2 = new Chocolate(new Caramel(coffe2));

        System.out.println(coffe.getDesc());
        System.out.println(coffe.cost());

        System.out.println(coffe2.getDesc());
        System.out.println(coffe2.cost());
    }
}
