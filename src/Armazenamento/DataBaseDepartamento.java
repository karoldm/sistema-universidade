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
public class DataBaseDepartamento {
    private Departamento departamentos[];
    private int MAX = 100;
    private int cont;
    
    public DataBaseDepartamento(){
        departamentos = new Departamento[MAX];
        cont =0;
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
