/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe de Freitas
 */
public abstract class Docente extends Funcionario{
    protected String titulacao;
    
    public Docente(){
        super();
    }
    
    public Docente(String codigo, String nome, double salario, String nivel, String titulacao){
        super(codigo, nome, salario, nivel);
        this.titulacao = titulacao;
    }   
    
    @Override
    public abstract double calcularSalario();

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
}
