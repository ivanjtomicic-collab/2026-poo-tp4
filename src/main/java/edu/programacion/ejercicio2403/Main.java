package edu.programacion.ejercicio2403;

public class Main {
    public static void main(String[] args) {
        Temperatura t = new Temperatura();
        System.out.println(t.convertTemperature(100, "Celsius", "Fahrenheit")); // 212.0
        System.out.println(t.convertTemperature(0, "Celsius", "Kelvin"));       // 273.15
        System.out.println(t.convertTemperature(491.67, "Rankine", "Celsius")); // 0.0
    }
}