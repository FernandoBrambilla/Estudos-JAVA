/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package atividade.mapa;

import javax.swing.JOptionPane;

public class Mapa {
    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
             
        double delta = Math.pow(b,2) - 4*a*c;
            if (delta<0) {
                throw new IllegalArgumentException ("Delta é: "+delta+"\nNão existem raízes reais.");
            }
        return delta;
    }
    public static void main(String[] args) {
        
        try{
            int a= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de 'a': "));
            int b= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de 'b': "));
            int c= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de 'c': "));
           
            double delta=calcularDelta(a, b, c);
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
            System.out.println("O valor de delta é: "+delta); 
            System.out.println("O valor de x1 é: "+x1);
            System.out.println("O valor de x2 é: "+x2);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
       }   
    }
}
            
        
        
    
   
    





