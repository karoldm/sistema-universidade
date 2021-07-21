/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armazenamento;

import Modelo.Departamento;

/**
 *
 * @author Felipe de Freitas
 */
public final class DataBaseDepartamento {
    private Departamento departamentos[];
    private int MAX = 100;
    private int cont;
    private static DataBaseDepartamento instance;
    
    public DataBaseDepartamento(){
        departamentos = new Departamento[MAX];
        cont = 0;
        this.instance = null;
    }
    
    public static DataBaseDepartamento getInstance(){
        if (instance == null){
            instance = new DataBaseDepartamento();
        }
        return instance;
    }
    
    public Departamento[] getDepartamentos(){
        return this.departamentos;
    }
    
    public int getNumDepartamentos(){
        return this.cont;
    }
    
    public void addDepartamento(Departamento d){
        if(cont < MAX){
            departamentos[cont] = d;
            cont++;
        }
    }
    
    public Departamento buscarDepartamento(String codigo) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].getCodigo().equals(codigo)) {
                return departamentos[i];
            }
        }
        return null;
    }
}
