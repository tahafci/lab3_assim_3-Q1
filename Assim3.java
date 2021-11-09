/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assim3;

/**
 *
 * @author HP
 */
public class Assim3 {

    
    public static void main(String[] args)
    {
      Football f1=new Football("Juma");
       System.out.println("The ball's brand of Football is "+f1.getbrand());
       Football f2=new Football("Nike");
       System.out.println("The ball's brand of Football is "+f2.getbrand());
        System.out.println("-----------------------------------");
       Baseball b1=new Baseball("Umbro");
       System.out.println("The ball's brand of Baseball is "+b1.getbrand());
       Baseball b2=new Baseball("Puma");
       System.out.println("The ball's brand of Baseball is "+b2.getbrand());
    }
    
}
