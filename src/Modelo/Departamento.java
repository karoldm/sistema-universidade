/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Armazenamento.DataBaseFuncionario;

/**
 *
 * @author Felipe de Freitas
 */
public class Departamento {
    private String codigo;
    private String nome;
    private DataBaseFuncionario dbf = new DataBaseFuncionario();
            
    public Departamento(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.dbf = DataBaseFuncionario.getInstance();
    }
    
    public Funcionario getFuncionarioCod(String codigo){
        Funcionario F = dbf.buscarFuncionarioCodigo(codigo);
        return F;
    }
    
    public String dados(){
        int numFuncionario = dbf.getNumFuncionarios();
        double totalGasto = dbf.calcularSalarioTotal();
        String dados = "\nNome: " + nome + "\nNúmero de Funcionário: " + numFuncionario
                    + "\nGasto total com funcionários: " + totalGasto + "\n";
        return dados;
    }
    
    public String dadosTodosFuncionarios(){
        String relatorio = "";
        Funcionario funcionarios[] = dbf.getFuncionarios();
        int cont = dbf.getNumFuncionarios();
        for(int i = 0; i < cont; i++){
            relatorio = relatorio + funcionarios[i].dadosFuncionario();
        }
        return relatorio;
    }
   
    
    public double gastoTotal() {
        return dbf.calcularSalarioTotal();
    }
    
    //Fazer um para cada: Tecnico, Efetivo, Substituto
    public void addTecnico(String codigo, String nome, double salario, String nivel, String funcao){
        Tecnico t = new Tecnico(codigo, nome, salario, nivel, funcao);
        dbf.addFuncionario(t);
    }
    
    public void addEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area){
        Efetivo e = new Efetivo(codigo, nome, salario, nivel, titulacao, area);
        dbf.addFuncionario(e);
    }
    
    public void addSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria){
        Substituto s = new Substituto(codigo, nome, salario, nivel, titulacao, cargaHoraria);
        dbf.addFuncionario(s);
    }
    
    @Override
    public Departamento clone() throws CloneNotSupportedException{
        return (Departamento) super.clone();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
