/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armazenamento;

import Modelo.Funcionario;

/**
 *
 * @author Felipe de Freitas
 */
public class DataBaseFuncionario {
    private Funcionario funcionarios[];
    private int MAX = 100;
    private int cont;
    
    public DataBaseFuncionario(){
        funcionarios = new Funcionario[MAX];
        cont = 0;
    }
    
    public Funcionario[] getFuncionarios(){
        return this.funcionarios;
    }
    
    public int getNumFuncionarios(){
        return this.cont;
    }
    
    public void addFuncionario(Funcionario d){
        if(cont < MAX){
            funcionarios[cont] = d;
            cont++;
        }
    }
    
    public Funcionario buscarFuncionarioCodigo(String codigo){
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getCodigo().equals(codigo)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public Funcionario buscarFuncionarioNome(String nome){
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public double calcularSalarioTotal(){
        double total = 0;
        for (int i = 0; i < cont; i++) {
            total = funcionarios[i].calcularSalario();
        }
        return total;
    }
}
