/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula5;



/**
 *
 * @author COPEL
 */
public class Aula5 {

    public static void main(String[] args) {
        
        ContaBanco conta1=new ContaBanco("2222-2", "Conta Corrente", "Fernando Henriqe Brambilla", 0f, false);
        conta1.abrirConta();
        conta1.depositar();
        conta1.sacar();
        conta1.pagarMensalidade();
        conta1.extratoConta();
        conta1.encerrarConta();
        
        
        ContaBanco conta2=new ContaBanco("4534-2", "Conta Poupança", "Gislaine Lourenço Bambilla", 0, false);
        conta2.abrirConta();
        conta2.depositar();
        conta2.sacar();
        conta2.pagarMensalidade();
        conta2.extratoConta();
        conta2.encerrarConta();
}
} 