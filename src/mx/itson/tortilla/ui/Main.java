/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.ui;

import java.util.Scanner;
import mx.itson.tortilla.negocio.Operacion;

/**
 *
 * @author jesus
*/

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el texto a separar");
         
        Scanner scanner = new Scanner(System.in);
 
        String enunciado = scanner.nextLine();
        
        String[] resultado = new Operacion().separar(enunciado);
        for(String r : resultado){  
            System.out.println(r);
        }
        
        
    }
}
