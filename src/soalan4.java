/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc 09
 */
public class soalan4 {
 public static void main(String[] args) {
     
 double mm, cm,calcius,fahrenheit,km,batu;
 mm = 35.5;
 calcius = 87.67;
 km = 56.99;
 
 cm = mm / 10;
 fahrenheit = (calcius * 1.8) + 32;
 batu = km * 0.62137;
 
 System.out.println(" 35.5 Milimeter = " + cm + " Centimeter");
 
 System.out.println(" 87.67 Calcius = " + fahrenheit + " Fahrenheit");
 
 System.out.println(" 56.99 Kilometer = " + batu + " Batu");
 }
}
