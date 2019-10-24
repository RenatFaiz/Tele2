package ru.itpark.model;

public class Tariff {
    private int id;
    private int monthlyPrice;
    private int dailyPrice;
    private boolean withoutPayment;
    private String name;
    private String internet;
    boolean SMMbadge;
    private int minutes;
    private boolean unlimitedOnTele2;
    private int SMS;
    private String buyButton;
    private boolean configure;

    public Tariff(String name, String internet, int minutes, String buyButton) {
        this.name = name;
        this.internet = internet;
        this.minutes = minutes;
        this.buyButton = buyButton;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public void setWithoutPayment(boolean withoutPayment) {
        this.withoutPayment = withoutPayment;
    }

    public void setSMMbadge(boolean SMMbadge) {
        this.SMMbadge = SMMbadge;
    }

    public void setUnlimitedOnTele2(boolean unlimitedOnTele2) {
        this.unlimitedOnTele2 = unlimitedOnTele2;
    }

    public void setSMS(int SMS) {
        this.SMS = SMS;
    }

    public void setConfigure(boolean configure) {
        this.configure = configure;
    }

    public void print() {
        System.out.println(name + " " + internet + " " + minutes + " мин. "
                + buyButton + "\nБезлимитные соцсети: " + SMMbadge
                + "; безлимит на Tele2 России: " + unlimitedOnTele2);
        if (monthlyPrice > 0) {
            System.out.println(monthlyPrice + " Р/месяц\n");
        }
        if (dailyPrice > 0) {
            System.out.println(dailyPrice + " Р/день\n");
        }
        if (withoutPayment == true) {
            System.out.println("Без абонентской платы\n");
        }
    }
}