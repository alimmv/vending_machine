package model;

public interface MoneyAcceptor {
    int getAmount();
    void addMoney(int amount);
    void deductMoney(int amount);
}
