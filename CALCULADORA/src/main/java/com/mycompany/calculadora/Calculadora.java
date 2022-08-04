/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author COPEL
 */
public class Calculadora {

   
    public static void main(String[] args) {
        dados operando=new dados();
        int operacao;
        do{
            operacao= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a operação desejada: \n"+
                "[1] Adição\n"+"[2] Subtração\n"+"[3] Multiplicação\n"+"[4] Divisão\n"+"[5] Exponenciação\n"+"[0] "
                + "Sair", "CALCULADORA",1));
                if(operacao>5){
                    JOptionPane.showMessageDialog(null, "Opção inválida, por favor digite outra opção.", "ATENÇÃO", 2);
                }
                switch (operacao) {
                    case 0:
                        System.exit(0);
                    case 1:
                        operando.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: \n", "SOMAR", 1));
                        operando.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: " , "SOMAR", 1));
                        JOptionPane.showMessageDialog(null,"A soma de "+operando.num1+ " e "+operando.num2+" é: "
                        +operando.somar(), "RESULTADO", 2);
                        break;
                    case 2:
                        operando.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: " , "SUBTRAIR", 1));
                        operando.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: " , "SUBTRAIR", 1));
                        JOptionPane.showMessageDialog(null,"A subtração de " +operando.num1+ " e "+operando.num2+" é: "
                        +operando.subtrair(),"RESULTADO",2 );
                        break;
                    case 3:
                        operando.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: " , "MULTIPLICAR", 1));
                        operando.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: " , "MULTIPLICAR", 1));
                        JOptionPane.showMessageDialog(null,"A multiplicação de " +operando.num1+ " e "+operando.num2+" é: "
                        +operando.multiplicar(),"RESULTADO",2);
                        break;
                    case 4:
                        operando.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: " , "DIVIDIR", 1));
                        operando.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: " , "DIVIDIR", 1));
                        JOptionPane.showMessageDialog(null,"A divisão de " +operando.num1+ " por "+operando.num2+" é: "
                        +operando.dividir(),"RESULTADO",2);
                        break;
                    case 5:
                        operando.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: " , "EXPONECIAR", 1));
                        JOptionPane.showMessageDialog(null,"O número " +operando.num1+ " elevado do quadrado é: "
                        +operando.exponenciar(),"RESULTADO",2);
                        break;
                    default:
                    break;
                }
        }while(operacao!=0);
    }
}

        
        
        
  
    
             

      

