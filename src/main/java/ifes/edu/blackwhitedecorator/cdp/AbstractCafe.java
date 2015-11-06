/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.blackwhitedecorator.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20122bsi0387
 */
public class AbstractCafe implements Cafe {
    private double preco;

    public AbstractCafe(double valor) {
        this.preco += valor;     
    }    
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.getPreco()+"";
    }
    
    
}
