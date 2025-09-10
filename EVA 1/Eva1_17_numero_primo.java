/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_numero_primo;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Eva1_17_numero_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1997;
        System.out.println(num + " es primo (ineficiente)");
        System.out.println(num + " es primo eficiente");
    }
    public static boolean esPrimoNoEficiente(int num){
        int resi = 1;
        boolean resu = true;
        for (int i = 2; i < num; i++) {
            resi = num % i;
            if(resi == 0){
                resu = false;
                break;
    }
        }        
        return false;
    
    public static boolean esPrimoEficiente(int num){
        int resi = 1;
        int raiz = (int)Math.sqrt(num);
        boolean resu = true;
        for (int i = 2; i < raiz; i++) {
            resi = num % i;
            if(resi == 0){
                resu = false;
                break;
            }
        }
        return false;
    }


