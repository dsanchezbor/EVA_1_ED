/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mcd;

/**
 *
 * @author sanch
 */
public class Eva1_15_mcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El mcd de 180 y 48 es: " + mcd(180,48));
    }
        public static int mcd(int dividendo, int divisor){ 
         int residuo = dividendo % divisor;
         if(residuo == 0)
             return divisor;
         else
         return mcd(divisor, residuo);
            
            
       
     }
        
}

