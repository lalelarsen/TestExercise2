/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleexercise;

import java.awt.Dialog;
import java.util.Scanner;

/**
 *
 * @author Frederik
 */
public class TriangleExercise {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type side a: ");
        int a = reader.nextInt();
        System.out.print("Type side b: ");
        int b = reader.nextInt();
        System.out.print("Type side c: ");
        int c = reader.nextInt();
        
        System.out.println("The triangle was: " + defineTriangle(a, b, c));
    }
    
    public static String defineTriangle(int a, int b, int c){
      
        String result = "ingen ens sider";
        if(a == b && a == c){
            result = "Ligesidet";
        }
        if(a == b && a != c || a==c && a != b || b == c && b != a){
            result = "Ligebenet";
        }
        
        return result;
    }
    
}
