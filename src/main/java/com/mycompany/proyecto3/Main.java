package com.mycompany.proyecto3;

import java.util.Scanner;

/*It contains the data of a triangle and uses it to calculate its area*/
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("¿Cuál es la altura del triángulo?");
        Scanner scanner = new Scanner(System.in);
        triangle.setHeight(scanner.nextFloat());

        System.out.println("¿Cuál es la base del triángulo?");
        scanner = new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());

        float area = triangle.calculateArea();
        System.out.println("El área del triángulo es:  " + area);

        float fixedHeight = 5;
        float fixedBase = 3;

        Triangle fixedTriangle = new Triangle(fixedBase, fixedHeight);
        System.out.println("El área del triángulo fijado es" + fixedTriangle.calculateArea());

    }

}
