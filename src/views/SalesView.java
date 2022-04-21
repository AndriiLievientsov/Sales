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
        System.out.println(title);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество: ";
        System.out.println(title);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.println(title);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();

    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
