public class Main {

    public static void main(String[] args) {
        Singleton.getInstance().addValue();
        System.out.println(Singleton.getInstance().getValue());
        // you can do this too
        Singleton instance = Singleton.getInstance();
        instance.addValue();
        System.out.println(instance.getValue());
        instance.restValue();
        System.out.println(instance.getValue());
    }
}
