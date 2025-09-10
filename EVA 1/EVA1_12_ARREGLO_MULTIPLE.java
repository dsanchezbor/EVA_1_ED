/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_arreglo_multiple;

/**
 *
 * @author sanch
 */
public class EVA1_12_ARREGLO_MULTIPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] arreglo = new int [5][3];
        arreglo [0][0] = 100;
        System.out.println(arreglo);
        System.out.println(arreglo [0].length);
        System.out.println(arreglo [1].length);
        System.out.println(arreglo [2].length);
        System.out.println(arreglo [3].length);
        System.out.println(arreglo [4].length);
        
        int [][] datos = new int [3][];
        datos[0]= new int [10];
        datos[0]= new int [1];
        datos[0]= new int [5];
        for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < datos[i].length; j++) {
                datos [i][j] = (int)(Math.random()*100);
            }
                for (int j = 0; j < datos.length; j++) {
                }
                    for (int j = 0; j < datos[i].length; j++) {
                        System.out.println("{"+ datos [i][j]+"}" );
                    }
            }
        }
    }
    

