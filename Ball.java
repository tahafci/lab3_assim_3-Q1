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
public abstract class Ball implements Tossable
{
    private String brandname;
    
    public Ball(String b)
    {
        brandname=b;
    }
    public String getbrand()
    {
      return "The brand : "+ brandname;
    }
    public abstract void bounce();
    
     public abstract void toss();
    
}
