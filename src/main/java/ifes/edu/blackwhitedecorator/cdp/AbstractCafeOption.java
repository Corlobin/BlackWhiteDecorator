/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.blackwhitedecorator.cdp;

/**
 *
 * @author 20122bsi0387
 */
public class AbstractCafeOption extends AbstractCafe {
    protected Cafe cafeDecorator;

    public AbstractCafeOption(Cafe cafe) {
        super(cafe.getPreco());
        this.cafeDecorator = cafe;
    }
    
}
