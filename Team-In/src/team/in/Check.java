/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.in;

/**
 *
 * @author 1894438
 */
public class Check  extends Payment{
    String name;
    String bankID;
    
      public void authorized(){
          
        System.out.println("this is autherization in Check subclass");
    }
    
}
