/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Armazenamento.DataBaseDepartamento;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe de Freitas
 */
public class Universidade {
    private String nome;
    private static DataBaseDepartamento dbd = new DataBaseDepartamento();

    
    public Universidade(String nome){
        this.dbd = DataBaseDepartamento.getInstance();
        this.nome = nome;
    }
    
    public void addDepartamento(String codigo, String nome){
        Departamento d = new Departamento(codigo, nome);
        dbd.addDepartamento(d);
    }
            
    public String dadosTodosDepartamentos(){
        String relatorio = "";
        Departamento departamentos[] = dbd.getDepartamentos();
        int cont = dbd.getNumDepartamentos();
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + departamentos[i].dados();
        }
        return relatorio;
    }
   
    public Funcionario getFuncionario(String codigoDep, String codigoFun){
        Departamento dep = dbd.buscarDepartamento(codigoDep);
        return dep.getFuncionarioCod(codigoFun);
    }
    
    public Departamento[] getDep(){
        return dbd.getDepartamentos();
    }
    
    public String dadosDepartamentosFaixaSalarial(double salarioInicial, double salarioFinal){
        String relatorio = "";
        Departamento departamentos[] = dbd.getDepartamentos();
        int cont = dbd.getNumDepartamentos();
        for(int i = 0; i < cont; i++){
            if(departamentos[i].gastoTotal() > salarioInicial){
                if(departamentos[i].gastoTotal() < salarioFinal){
                    relatorio = relatorio + departamentos[i].dados();
                }
            }
        }
        return relatorio;
    }
    
    public Departamento buscarDepartamento(String codigo){
        Departamento depto = dbd.buscarDepartamento(codigo);
        if (depto != null) {
            return depto;
        }
        return null;
    }
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
