package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {
    String title;
    String name;
    int quantity;
    double price;
    Product model;
    Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {
        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        name = Validator.validateName(scanner);

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        quantity = Validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        price = Validator.validatePriceInput(scanner);

        scanner.close();

    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
