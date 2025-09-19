package model;

import java.util.Scanner;

public class CardAcceptor implements MoneyAcceptor {
    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void addMoney(int amount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер карты:");
        String card = sc.nextLine();
        System.out.println("Введите одноразовый пароль:");
        String otp = sc.nextLine();
        this.amount += amount;
        System.out.println("Карта " + mask(card) + " успешно списала " + amount);
    }

    @Override
    public void deductMoney(int amount) {
        this.amount -= amount;
    }

    private String mask(String card) {
        if (card == null || card.length() < 4) {
            return "****";
        }
        String last = card.substring(card.length() - 4);
        return "****" + last;
    }
}
