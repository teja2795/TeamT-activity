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
public class Orderdetail {
    int quantity;
    String taxstatus;
    public void calcSubTotal ()
    {
        System.out.println("this is calcSubTotal in Orderdetail class");
    }
    public void calcWeight ()
    {
        System.out.println("this is calcWeight in Orderdetail class");
    }
    public void calcTax ()
    {
        System.out.println("this is calTax in Orderdetail class");
    }
    Order oo = new Order();
    Item i= new Item();
    
}
