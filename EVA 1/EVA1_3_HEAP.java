/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_heap;

/**
 *
 * @author sanch
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        Prueba prueba1 = new Prueba();
        Prueba prueba2 = new Prueba();
        System.out.println("x =" + x);
        System.out.println("prueba 1 = " + prueba1);
        System.out.println("prueba 2 = " + prueba2);
        System.out.println("prueba.valor = " +prueba1.valor);
        System.out.println("prueba.valor = " +prueba2.valor);
        prueba1 = null;
        prueba2 = null;
        
    }
    
}
class Prueba {
    int valor = 100;
}