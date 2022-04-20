package models;

import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    protected double profit;
    protected  double tax;
    protected  double netIncome;

    // Налоговоу ставку объявите в виде константы
    // здесь ...
    final double taxRate = 5.0;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxRate() {
        return taxRate;
    }


    // Переопределите методы реализуемых интерфейсов.

    // Расчёт суммы налога с продаж.
    // здесь ...
    @Override
    public void IncomeTaxCalculation() {
        tax = profit * taxRate;
        System.out.println("Сумма налога (грн.): " + tax);
    }

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    @Override
    public void IncomeCalculations() {
        profit = quantity * price;
        System.out.println("Общий доход (грн.): " + profit);
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    @Override
    public void NetIncomeCalculation() {
        netIncome = profit - tax;
        System.out.println("Чистый доход (грн.): " + netIncome);

    }





}
