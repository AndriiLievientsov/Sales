package utils;

public class Rounder {
    //Rounder, содержащий статический
    //метод округления значений.
    public static double getValue (double number) {
        number = Math.round(number * 100);
        number = number/100;
        return number;
    }


}
