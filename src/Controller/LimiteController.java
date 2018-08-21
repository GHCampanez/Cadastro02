/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Cliente;

/**
 *
 * @author braga
 */
public class LimiteController {

    public static Double testaLimite(Cliente cliente) {
        Double limite = 0.0;
        if (cliente.getIdade() < 18) {
            limite = 100.0;
        }
        if (cliente.getIdade() >= 18 && cliente.getIdade() < 35) {
            limite = 300.0;
        }
        if(cliente.getIdade() >= 35){
            limite = 500.0;
        }
        if (cliente.getPais().getNome().equals("Brasil")) {
            limite = limite + 100;
        }
        return limite;
    }
}
