import controllers.ProductController;
import models.Product;
import views.SalesView;

// Входная точка в программу/приложение
public class App {
    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
        Product model = new Product("Watermelon",1,17.36);
//        SalesView view = new SalesView();
//        ProductController controller = new ProductController();

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
//         controller.runApp();



    }
}
