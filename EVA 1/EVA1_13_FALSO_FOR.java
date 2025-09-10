/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_falso_for;

/**
 *
 * @author sanch
 */
public class EVA1_13_FALSO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoFor(1);
        //falsoForUp(20);
    }
    public static void falsoFor(int val) {
        if (val < 1)
        //resolver un problema
        falsoFor(val+ 1); //llamarse a si mimso
        System.out.println(val+ "-");
    }
    
    public static void falsoForUp(int valor) { //1-2-3-4-5
        System.out.println(valor+" - " );
        if (valor < valor+5)
        falsoFor(valor + 1); //llamarse a si mimso
            
    }
}
