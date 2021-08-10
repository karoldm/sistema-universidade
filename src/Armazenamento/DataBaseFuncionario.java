/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armazenamento;

import Modelo.Funcionario;
import Modelo.Docente;
import Modelo.Efetivo;
import Modelo.Substituto;   
import Modelo.Tecnico;

/**
 *
 * @author Felipe de Freitas
 */
public final class DataBaseFuncionario {
    private Funcionario funcionarios[];
    private int MAX = 100;
    private int cont;
    private static DataBaseFuncionario instance;
    
    public DataBaseFuncionario(){
        funcionarios = new Funcionario[MAX];
        cont = 0;
        this.instance = null;
    }
    
    public static DataBaseFuncionario getInstance(){
        if (instance == null){
            instance = new DataBaseFuncionario();
        }
        return instance;
    }
    
    public Funcionario[] getFuncionarios(){
        return this.funcionarios;
    }
    
    public int getNumFuncionarios(){
        return this.cont;
    }
    
    public void addFuncionario(Funcionario f){
        if(cont < MAX){
            funcionarios[cont] = f;
            cont++;
        }
        f.calcularSalario();
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
    
    public Funcionario[] buscarFuncionariosFaixaSalarial( double salarioInicial,double salarioFinal){
        Funcionario funcionariosArray[] = new Funcionario[cont];
        int k = 0;
        for(int i = 0; i < cont; i++){
            if(funcionarios[i].getSalario() > salarioInicial){
                if(funcionarios[i].getSalario()< salarioFinal){
                    funcionariosArray[k] = funcionarios[i];
                    k++;
                }
            }        
        }
        if(funcionariosArray[0] != null) return funcionariosArray;
        return null;    
    }
    
    public double calcularSalarioTotal(){
        double total = 0;
        for (int i = 0; i < cont; i++) {
            total += funcionarios[i].getSalario();
        }
        return total;
    }
   
    public String exibirDocentes() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i] instanceof Docente) {
                relatorio = relatorio + funcionarios[i].dadosFuncionario();
            }
        }
        return relatorio;
    }
        
    public String exibirEfetivo() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i] instanceof Efetivo) {
                relatorio = relatorio + funcionarios[i].dadosFuncionario();
            }
        }
        return relatorio;
    }
    
    public String exibirSubstituto() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i] instanceof Substituto) {
                relatorio = relatorio + funcionarios[i].dadosFuncionario();
            }
        }
        return relatorio;
    }
    
    public String exibirTecnicos() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i] instanceof Tecnico) {
                relatorio = relatorio + funcionarios[i].dadosFuncionario();
            }
        }
        return relatorio;
    }
    
    
}
