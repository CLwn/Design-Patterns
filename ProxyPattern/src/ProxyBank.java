public class ProxyBank implements IAccount{
    private BankAcc realAcc;

    @Override
    public Account add(Account account, double money) {
        if (realAcc == null) realAcc = new BankAcc();
        return realAcc.add(account, money);
    }

    @Override
    public Account remove(Account account, double money) {
        if (realAcc == null) realAcc = new BankAcc();
        return realAcc.remove(account, money);
    }

    @Override
    public void checkMoney(Account account) {
        if (realAcc == null) realAcc = new BankAcc();
        realAcc.checkMoney(account);

    }
}
