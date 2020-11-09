
 
package com.mycompany.proyecto3;

import java.util.Scanner;
/*It contains the data of a triangle and uses it to calculate its area*/
public class Main {
    public static void main(String[]args){
        Triangle triangle = new Triangle();
        System.out.println("¿Cuál es la altura del triángulo");
        Scanner scanner=new Scanner(System.in);
        triangle.setheight(scanner.nextFloat());
        
        
        System.out.println("¿Cuál es la base del triángulo");
        Scanner scanner=new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());
 
        
    }
    
}
