public interface IAccount {
    Account add(Account account, double money);
    Account remove(Account account, double money);
    void checkMoney(Account account);
}
