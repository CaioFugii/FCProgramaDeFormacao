
package retangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author CAIO
 */
public class RetanguloTeste {
    public static void main (String args[]){
        
        retangulo teste = new retangulo();
        
        teste.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: ")));
        teste.setBase(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: ")));
        
        System.out.println("Comprar" +  teste.calcularArea() + " pisos");
        System.out.println("Comprar" +  teste.calcularPerimetro() + "rodapés");
        
    }
}
