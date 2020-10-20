public class BankAcc implements IAccount {
    @Override
    public Account add(Account account, double money) {
        account.setCash(account.getCash()+money);
        System.out.println(account.getCash());
        return account;

    }

    @Override
    public Account remove(Account account, double money) {
        account.setCash(account.getCash()-money);
        System.out.println(account.getCash());
        return account;
    }

    @Override
    public void checkMoney(Account account) {
        System.out.println(account.getCash());
    }
}
