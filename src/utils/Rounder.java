package utils;

import views.SalesView;

public class Rounder {
    //Rounder, содержащий статический
    //метод округления значений.
    static double getValue (double number) {
        number = Math.round(number * 100); //затычка
        number = number/100;
        return number;
    }
}
