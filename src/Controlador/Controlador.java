/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Departamento;
import Modelo.Universidade;

/**
 *
 * @author Felipe de Freitas
 */
public class Controlador {
    private Universidade universidade = new Universidade("Universidade Unesp");
    
    public void addDepartamento(String codigo, String nome){
        universidade.addDepartamento(codigo, nome);
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String funcao, String codigoDepartamento){
        Departamento depto = universidade.buscarDepartamento(codigoDepartamento);
        depto.addTecnico(codigo, nome, salario, nivel, funcao);
    }
    
    public void addSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria, String codigoDepartamento){
        Departamento depto = universidade.buscarDepartamento(codigoDepartamento);
        depto.addSubstituto(codigo, nome, salario, nivel, titulacao, cargaHoraria);
    }
    
    public void addEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, String codigoDepartamento){
        Departamento depto = universidade.buscarDepartamento(codigoDepartamento);
        depto.addEfetivo(codigo, nome, salario, nivel, titulacao, area);
    }
    
    public String dadosTodosDepartamentos(){
        return universidade.dadosTodosDepartamentos();
    }
   
     
   public boolean hasDepartamento(String codigo){
        return universidade.hasDepartamento(codigo);
    }
    
    public String dadosDepartamentosFaixaSalarial(double salarioInicial, double salarioFinal){
        return universidade.dadosDepartamentosFaixaSalarial(salarioInicial, salarioFinal);
    }
    
}
