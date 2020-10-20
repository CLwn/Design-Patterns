public class Main {
    public static void main(String[] args) {
        Account account = new Account(200, 1, "pep");
        IAccount proxy = new ProxyBank();

        proxy.add(account,20);
        proxy.remove(account,100);
        proxy.checkMoney(account);

    }
}
