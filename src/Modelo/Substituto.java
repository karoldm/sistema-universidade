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
public class Substituto extends Docente{
    private int cargaHoraria;
    
    public Substituto(){
        super();
    }
    
    public Substituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria){
        super(codigo, nome, salario, nivel, titulacao);
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public double calcularSalario(){
        if (nivel.equals("S1")){
            salario = salario*Constantes.S1;
        }
        else{
            salario = salario*Constantes.S2;
        }
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
