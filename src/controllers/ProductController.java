package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {
    Product model;
    SalesView view;


    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        model.getName();
        // 2) вызов методов расчетов доходов и налога;
        model.IncomeCalculations();
        model.IncomeTaxCalculation();
        model.NetIncomeCalculation();

        // 3) округление расчетных значений;
        double profit = Rounder.getValue(model.getProfit());
        double netIncome = Rounder.getValue(model.getNetIncome());
        double tax = Rounder.getValue(model.getTax());

        // 4) вывод расчетов по заданному формату.
        System.out.println("Сумма налога (грн.): " + tax);
        System.out.println("Общий доход (грн.): " + profit);
        System.out.println("Чистый доход (грн.): " + netIncome);

        String output = "[здесь должен быть вывод по формату]";

        view.getOutput(output);
    }
}
