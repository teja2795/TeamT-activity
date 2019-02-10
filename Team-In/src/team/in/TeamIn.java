/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.in;

/**
 *
 * @author temp
 */
public class TeamIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order o=new Order();
        o.calcSubTotal();
        o.calcTax();
        o.calcTotal();
        o.calcTotalWeight();
        Orderdetail oo=new Orderdetail();
        oo.calcSubTotal();
        oo.calcTax();
        oo.calcWeight();
        Item i=new Item();
        i.Instock();
        i.getPriceForQuantity();
        i.getTax();
        Check c=new Check();
        c.authorized();
        Credit cc=new Credit();
        cc.authorized();
    }
    
}
