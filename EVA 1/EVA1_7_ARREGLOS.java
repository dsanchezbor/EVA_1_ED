/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos;

/**
 *
 * @author sanch
 */
public class EVA1_7_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        imprimir(arreglo);
        System.out.println(arreglo);
            arreglo = new int[2];
        System.out.println("arreglo");
    }
    public static void imprimir(int [] datos){
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
        }
        System.out.println("");
    
    }
}
