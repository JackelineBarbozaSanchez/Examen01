/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaki
 */
public class Metodos_Usuario {
    private ArrayList <Usuario> arrayListUsuario;
     String arrayInformacion[]= new String[4]; 
    
    public Metodos_Usuario()
    {
        arrayListUsuario= new  ArrayList<Usuario>();
     
    }
    
    public void agregar(String arreglo[])
    {
        Usuario usuarioTemporal= new Usuario(Integer.parseInt(arreglo[0]),arreglo[1],arreglo[2],arreglo[3]);
        arrayListUsuario.add(usuarioTemporal);
    }
    
    public void imprimirDatos()
    {
        for(int contador=0;contador<arrayListUsuario.size();contador++)
        {
           System.out.println(arrayListUsuario.get(contador).getInformacio());
        }
    
    }
    public void mendaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    public boolean mostrarInformacion(int numero)
    {
        boolean existe=false;
        for(int contador=0;contador<arrayListUsuario.size();contador++)
        {
            if(arrayListUsuario.get(contador).getNumeroPrestamo()==numero)
            {
                arrayInformacion[1]=arrayListUsuario.get(contador).getNombre();
                arrayInformacion[2]=arrayListUsuario.get(contador).getCedula();
                arrayInformacion[3]=arrayListUsuario.get(contador).getIsbnLibro();
                existe= true;
            }
        }
        return existe;
    }
    
    
    public String[] getArrayInformaciones()
    {
        return arrayInformacion;
    }
    
    public void modificar(int numero)
    {
         for(int contador=0;contador<arrayListUsuario.size();contador++)
        {
            if(arrayListUsuario.get(contador).getNumeroPrestamo()==numero)
            {
                
            }
        }
        
    }
    
    
}
