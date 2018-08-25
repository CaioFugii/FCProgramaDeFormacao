/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author CAIO
 */
public class salarios {
    public static void main(String[] args) {
        double salarioAtual, salario; 
        double pctAtual;

       salarioAtual = 1000;
       pctAtual = 1.015;    

       for(int i = 6; i<=18;i++){
           salario = salarioAtual * pctAtual;
           System.out.printf("%d - Salário %.2f %n ", 2000 + i , salario);

           pctAtual *= 2;
       }
    
    }
}
