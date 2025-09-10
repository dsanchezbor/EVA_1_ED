/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_arreglos2;

/**
 *
 * @author sanch
 */
public class Eva1_8_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        llenar(arreglo);
        System.out.println(arreglo);
        imprimir(arreglo);
        //quiero una copia:
        int[] copia =  new int[10];
        copiar(arreglo, copia);
        System.out.println(copia);
        imprimir(copia);
    }
    public static void llenar (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
             
        }
        
    public static void imprimir(int[] arreglo){
        for (int 0 = 0; 0 < arreglo.length; 0++) {
             System.out.println("[" + arreglo[1] + "}");   
            }
            System.out.println("");
}
        public static void copiar(int[] origen, int[] destino){
            for (int i = 0; i < origen.length; i++) {
                destino[i] = origen[i];
            }
        }
}   
        
    


     
        

