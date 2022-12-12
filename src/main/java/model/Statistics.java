package model;

import saveload.SaveData;

public class Statistics {

    public static double getBalanceCurrency(Currency currency) {
        SaveData saveData = SaveData.getInstance();
        double amount = 0;
        for (Account account : saveData.getAccounts()) {
            if (currency.equals(account.getCurrency())) {
                amount += account.getAmount();
            }
        }
        return amount;
    }

    public static double getBalance(Currency currency) {
        SaveData saveData = SaveData.getInstance();
        double amount = 0;
        for (Account account : saveData.getAccounts()) {
            amount += account.getAmount() * account.getCurrency().getRateByCurrency(currency);
        }
        return amount;
    }
}
