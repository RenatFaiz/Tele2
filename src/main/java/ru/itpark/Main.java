package ru.itpark;

import ru.itpark.model.Tariff;

public class Main {
    public static void main(String[] args) {

        Tariff myOnline = new Tariff("Мой онлайн","15 ГБ",
                400, "https://tele2.ru/shop/1");
        myOnline.setMonthlyPrice(290);
        myOnline.setSmmBadge(true);
        myOnline.setUnlimitedOnTele2(true);
        myOnline.setConfigure(true);
        myOnline.print();

        Tariff unlimited = new Tariff("Безлимит","БЕЗЛИМИТНЫЙ ИНТЕРНЕТ",
                500, "https://tele2.ru/shop/5");
        unlimited.setMonthlyPrice(400);
        unlimited.setSMS(50);
        unlimited.setUnlimitedOnTele2(true);
        unlimited.print();


    }
}
