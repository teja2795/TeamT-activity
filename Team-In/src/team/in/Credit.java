/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.in;

import java.util.Date;

/**
 *
 * @author 1894438
 */
public class Credit extends Payment {
    
    String name, type;
    Date expectedDate;
    
    public void authorized(){
       
        System.out.println("this is autherization in Credit subclass");
    }
            
}
