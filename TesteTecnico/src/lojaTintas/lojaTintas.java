
package lojaTintas;

import javax.swing.JOptionPane;
/**
 *
 * @author CAIO
 */
public class lojaTintas {
    public static void main(String args[]){
        int metros, litrosComprar, litrosTotal;
        long preco, latas;
        metros = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da área a ser pintada (m²): "));
        
        litrosTotal = 0;
        litrosComprar = 0;
        preco = 0;
        latas = 0;
       
        for(int i=1; i <= metros; i+=3){
            if (litrosComprar <= 18){
                litrosComprar++;
            }else{
                preco += 80;
                latas++;
                litrosComprar = 0;
            }
            litrosTotal++;
        }
        
        if(litrosComprar > 0){
            latas++;
            preco+=80;
        }
        
        
        System.out.print(latas + " "+ litrosTotal + " " + preco);
        }
}
        
       
        
     
