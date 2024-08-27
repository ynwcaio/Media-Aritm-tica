

package main.media_aritmetica;

import java.util.Scanner;

public class Media_Aritmetica {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        Double x,y, média;
        
        System.out.println("Digite o primeiro número");
        x = grava.nextDouble();
        
        System.out.println("Digite o segundo número");
        y = grava.nextDouble();
        
        média = (x+y) / 2.0;
        
        System.out.println("A média aritmética dos números é: " + média);
            
    }
}
