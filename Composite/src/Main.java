public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory tap = new Directory("tap");
        File f1 = new File(1234);
        File f2 = new File(3445);
        File f3 = new File(6688);
        File f4 = new File(99999);
        root.add(home);
        root.add(f1);
        home.add(tap);
        home.add(f2);
        tap.add(f3);
        root.add(f4);


        System.out.println("-------------");

        System.out.println("Root SIZE:"+root.getCapacity());
        System.out.println("Home SIZE:"+home.getCapacity());
        System.out.println("TAP SIZE:"+tap.getCapacity());

    }
}
