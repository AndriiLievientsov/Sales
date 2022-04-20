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
    // Налоговоу ставку объявите в виде константы
    // здесь ...
    final double taxRate = 5.0;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
//        this.taxRate = taxRate;
    }

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

    }
    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    @Override
    public void IncomeCalculations() {
        double Profit = quantity * price;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    @Override
    public void NetIncomeCalculation() {

    }





}
