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
public class Substituto extends Docente{
    private int cargaHoraria;
    private DecimalFormat formatador = new DecimalFormat("0.00");
    
    public Substituto(){
        super();
    }
    
    public Substituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria){
        super(codigo, nome, salario, nivel, titulacao);
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public void calcularSalario(){
        if (nivel.equals("S1")){
            salario = salario*Constantes.S1;
        }
        else{
            salario = salario*Constantes.S2;
        }     
    }
    
    @Override
    public String dadosFuncionario(){
        String dados = "Nome: " + nome +"\nCódigo: "+ codigo +"\nSalário: " + formatador.format(salario) + "\nNível: " + nivel
                + "\nTitulação: "+ titulacao + "\nCarga horário: "+ cargaHoraria+"\n\n";   
        return dados;
    }

    

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



}
