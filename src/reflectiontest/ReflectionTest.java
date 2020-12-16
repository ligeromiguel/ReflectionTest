/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ReflectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe el paquete y nombre de la clase :");
        String nombreClase = scn.nextLine();
        Class c1;
        try {
            System.out.println("");
            //Clases
            c1=Class.forName(nombreClase);
            System.out.println("- Nombre de la Clase: "+c1.getName());
            System.out.print("\n");
            
            //Constructores
            Constructor[] constructores = c1.getDeclaredConstructors();
            for(int i = 0; i<constructores.length;i++){
                System.out.println("- Nombre del Constructor: "+constructores[i]);
            }
            System.out.print("\n");
            
            //Modificadores
            Method[] metodo = c1.getDeclaredMethods();
            for(int i = 0; i<metodo.length;i++){
                System.out.println("- Método: "+metodo[i]);
            }
            System.out.print("\n");
            
            //Campos
            Field[] field = c1.getDeclaredFields();
            for(int i = 0; i<field.length;i++){
                System.out.println("- Campo: "+field[i]);
            }
            System.out.print("\n");
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE,
        null, ex);
        }
    }
}