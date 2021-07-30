/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Departamento;
import Modelo.Funcionario;
import Modelo.Universidade;

/**
 *
 * @author Felipe de Freitas
 */
public class Controlador {
    private final Universidade universidade = new Universidade("Universidade Unesp");
    
    public void addDepartamento(String codigo, String nome){
        universidade.addDepartamento(codigo, nome);
    }
    
    public Departamento[] getDep(){
        return universidade.getDep();
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
   
    public String dadosTodosFuncionarios(){
        return universidade.dadosTodosFuncionarios();
    }
     
   public Departamento buscarDepartamento(String codigo){
        return universidade.buscarDepartamento(codigo);
    }
   
   public Departamento buscarDepartamentoNome(String nome){
        return universidade.buscarDepartamentoNome(nome);
    }
   
   public Funcionario getFuncionario(String codigoDep, String codigoFun){
       if(codigoDep != null){   
        return universidade.getFuncionario(codigoDep, codigoFun);
       }
       return null;
    }
    
    public String dadosDepartamentosFaixaSalarial(double salarioInicial, double salarioFinal){
        return universidade.dadosDepartamentosFaixaSalarial(salarioInicial, salarioFinal);
    }
    
}
