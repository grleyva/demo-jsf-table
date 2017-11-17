package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;


@javax.faces.bean.ManagedBean
public class ManagedBeanLista {
    private List<Cliente> lista;
    private int numeroElementos;
    
    public ManagedBeanLista() {
    }
    
    @PostConstruct
    public void inicializar(){
        lista=new ArrayList<>();
        
        lista.add(new Cliente("P","K","F",2017));
        lista.add(new Cliente("PP","HH","FF",2018));
    }
    
    public String navegar(){
        return "lista";
    }

    /**
     * @return the lista
     */
    public List<Cliente> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    /**
     * @return the numeroElementos
     */
    public int getNumeroElementos() {
        numeroElementos=lista.size();
        
        return numeroElementos;
    }

    /**
     * @param numeroElementos the numeroElementos to set
     */
    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }
    
    
}
