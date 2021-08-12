/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.text.DecimalFormat;

/**
 *
 * @author Felipe de Freitas
 */
public class Tecnico extends Funcionario{
    private String funcao;
    private DecimalFormat formatador = new DecimalFormat("0.00");
    
    public Tecnico(){
        super();
    }
    
    public Tecnico(String codigo, String nome, double salario, String nivel, String funcao) {
        super(codigo, nome, salario, nivel);
        this.funcao = funcao;
    }
    
    @Override
    public void calcularSalario(){
        if (nivel.equals("T1")){
            salario = salario*Constantes.T1;
        }
        else{
            salario = salario*Constantes.T2;
        }
    }
    
    @Override
    public String dadosFuncionario(){
        String dados = "Nome: " + nome +"\nCódigo: "+ codigo +"\nSalário: " + formatador.format(salario) + "\nNível: " + nivel
                + "\nFunção: " + funcao+"\n\n";
        
        return dados;
    }
   
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
     
}
