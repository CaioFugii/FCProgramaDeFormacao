package primos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author CAIO
 */
public class primos {  
    public static void main (String [] args){
    
        int inicial, end;
    
        inicial = Integer.parseInt(JOptionPane.showInputDialog("Favor entrar com o valor inicial: "));
        end = Integer.parseInt(JOptionPane.showInputDialog("Favor entrar com o valor final : "));

        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = inicial; i <= end; i++){
           numeros.add(i);
       }

        int contador;   
        int numero = 0;
	for (Integer i : numeros) {
            contador = 0;
            for (int u = 1; u <= i; u++) {
                if (i % u == 0) {
                    contador++;
                    numero = u;
                }
            }
            if (contador == 2) {
                System.out.print(numero + " "); 
            }		
        
        }
    }
}

