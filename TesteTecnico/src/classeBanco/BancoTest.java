/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeBanco;

/**
 *
 * @author CAIO
 */
public class BancoTest {
    public static void main(String[] args) {
        Banco conta1 = new Banco("111.111.111-11", "Caio");
        conta1.deposito(1000);
        conta1.saque(100);
        conta1.deposito(250.25);
        conta1.saque(1200);
        
        conta1.alterarNome("Tiago");
        conta1.deposito(500);
    }
}
