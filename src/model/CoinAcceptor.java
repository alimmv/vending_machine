package model;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
    }

    @Override
    public void deductMoney(int amount) {
        this.amount -= amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
