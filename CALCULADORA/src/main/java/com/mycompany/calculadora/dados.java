/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author COPEL
 */
public class dados {
    int num1;
    int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int somar(){
        int result=num1+num2;
        return result;
       
} 
    public int subtrair(){
        int result=num1-num2;
        return result;
    }
    
    public int multiplicar(){
        int result=num1*num2;
        return result;
    }
    public float dividir(){
        float result=(float) num1/(float)num2;
        return result;
        
    }
    public int exponenciar(){
        int result=num1*num1;
        return result;
    }
}
