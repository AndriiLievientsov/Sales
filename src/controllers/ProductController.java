package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController {
    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getInputs();

        String name = model.getName();

        model.IncomeCalculations();
        model.IncomeTaxCalculation();
        model.NetIncomeCalculation();

        double profit = Rounder.getValue(model.getProfit());
        double netIncome = Rounder.getValue(model.getNetIncome());
        double tax = Rounder.getValue(model.getTax());

        String output =  name + '\n' +
                "Общий доход (грн.): " + profit + '\n' +
                "Сумма налога (грн.): " + tax + '\n' +
                "Чистый доход (грн.): " + netIncome;

        view.getOutput(output);

    }
}
