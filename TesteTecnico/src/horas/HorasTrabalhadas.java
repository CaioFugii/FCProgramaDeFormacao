

package horas;

import javax.swing.JOptionPane;
/**
 *
 * @author CAIO
 */
public class HorasTrabalhadas {
    
    public static void main(String [] args){
    long salarioMinimo;
    double valorHora, salarioBruto, imposto;
    int horas;
    
    salarioMinimo = Long.parseLong(JOptionPane.showInputDialog("Digite o salario minimo: "));
    horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
    
    valorHora = salarioMinimo * 0.1;
    
    salarioBruto = valorHora * horas;
    
    imposto = salarioBruto * 0.3;
    
    salarioBruto -= imposto;
    
    System.out.print("Salário à receber: " + salarioBruto);
    
}
}
