/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

import javax.swing.JOptionPane;




/**
 *
 * @author COPEL
 */
public class ContaBanco {
    private String numConta;
    private String tipoConta;
    private String nomeTitular;
    private float saldoConta;
    private boolean statusConta;

    public ContaBanco(String numConta, String tipoConta, String nomeTitular, float saldoConta, boolean statusConta) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
        this.statusConta = statusConta;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
  
    public void abrirConta(){
        this.setStatusConta(true);
        if(this.getTipoConta().equals("Conta Corrente")){
            this.setSaldoConta(50.00f);
            JOptionPane.showMessageDialog(null, "Conta Corrente aberta com sucesso!");
        }
        else{
            this.setSaldoConta(100.00f);
            JOptionPane.showMessageDialog(null, "Conta Poupança aberta com sucesso!");
        }    
    }
     
    public void encerrarConta(){
        if (this.getSaldoConta()>0 && this.getStatusConta()==false){
            JOptionPane.showMessageDialog(null, """
                                                Imposs\u00edvel encerrar a conta, o Saldo precisa ser Zero
                                                Seu saldo atual é R$ """+ this.getSaldoConta());
        }
        else{
            this.setStatusConta(true);
            JOptionPane.showMessageDialog(null, "Conta encerrada com Sucesso");
        }
    }
    
    public void depositar(){
        if(this.getStatusConta()==true){
            float valorDeposito=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o Valor a ser depositado: "));
            this.setSaldoConta(this.getSaldoConta()+valorDeposito);
            JOptionPane.showMessageDialog(null, "Valor R$ "+valorDeposito+ " depositado com Sucesso!\n"+"Seu saldo atual é R$ "+
            this.getSaldoConta());                
        }
        else{
            JOptionPane.showMessageDialog(null, "Não é possível depositar, conta fechada!");
        }
    }
    
    public void sacar(){
        float valorSaque=Float.parseFloat(JOptionPane.showInputDialog(null,"Qual valor você quer sacar?"));
        if(this.getSaldoConta()>=valorSaque ){
            this.setSaldoConta(this.getSaldoConta()-valorSaque);
            JOptionPane.showMessageDialog(null, "Valor R$ "+valorSaque+ " sacado com Sucesso!\n"+"Seu saldo atual é R$ "+
            this.getSaldoConta());
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar este saque!");
        }
    }
    
    public void pagarMensalidade(){
        String pagarMensalidade=JOptionPane.showInputDialog(null, "Quer pagar sua mensalidade? [S]SIM [N]NAO");
        if("s".equals(pagarMensalidade)||"S".equals(pagarMensalidade)){
            if(this.getSaldoConta()>=12&&"Conta Corrente".equals(this.getTipoConta())){
                this.setSaldoConta(saldoConta-12);
                JOptionPane.showMessageDialog(null, """
                                                    Pagamento efetuado com sucesso! 
                                                    Seu saldo atual é R$ """+this.getSaldoConta());
                
            }else if(this.getSaldoConta()>=6&&"Conta Poupança".equals(this.getTipoConta())){
                this.setSaldoConta(saldoConta-6);
                JOptionPane.showMessageDialog(null, """
                                                    Pagamento efetuado com sucesso!
                                                    Seu saldo atual é R$ """+this.getSaldoConta());
                          
            }
            else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para pagar a mensalidade!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não pagou sua mensalidade!");
        } 
    }
    
    public void extratoConta(){
        JOptionPane.showMessageDialog(null,"Titular: "+ getNomeTitular()+
        "\nConta Nº: "+ getNumConta()+
        "\nTipo de Conta: "+getTipoConta()+
        "\nSaldo em Conta: "+getSaldoConta());
    }
}



