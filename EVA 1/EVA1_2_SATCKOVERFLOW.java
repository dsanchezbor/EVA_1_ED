/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_satckoverflow;

/**
 *
 * @author sanch
 */
public class EVA1_2_SATCKOVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A();
    }
    public static void A() {
        B();
    }
    public static void B(){
        A();
    }
}
