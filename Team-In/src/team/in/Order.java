/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.in;

import java.util.Date;

/**
 *
 * @author temp
 */
public class Order {
    Date date;
    String status;
    public void calcSubTotal()
    {
        System.out.println("this is calcSubTotal method in Order class");
    }
    public void calcTax()
    {
        System.out.println("this is calcTax method in Order class");
    }
    public void calcTotal()
    {
        System.out.println("this is calcTotal method in Order class");
    }
    public void calcTotalWeight()
    {
        System.out.println("this is calcTotalweight method in Order class");
    }
    Customer c=new Customer();
    
}
