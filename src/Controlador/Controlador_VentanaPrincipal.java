/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Metodos_Usuario;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jaki
 */
public class Controlador_VentanaPrincipal implements ActionListener{
    FRM_VentanaPrincipal ventana;
    Metodos_Usuario metodos;
    public Controlador_VentanaPrincipal(FRM_VentanaPrincipal ventana)
    {
       this.ventana=ventana;
       metodos= new Metodos_Usuario();
    }
    public void actionPerformed (ActionEvent e )
    {
        if (e.getActionCommand().equals("Agregar"))
        {
            this.metodos.agregar(ventana.agrgarUsuario());
            this.metodos.imprimirDatos();
            this.ventana.limiar();
            this.metodos.mendaje("Se agregó un nuevo Usuario");
        }
        if (e.getActionCommand().equals("Buscar"))
        {
           buscar();
            this.ventana.camposAgregar();
        }
        if (e.getActionCommand().equals("Modifcar"))
        {
            
        }
        if (e.getActionCommand().equals("Eliminar"))
        {
            this.metodos.Eliminar(ventana.devolverNumero());
            this.ventana.limiar();
        }
    }
    
    public void buscar()
    {
        if(metodos.mostrarInformacion(ventana.devolverNumero()))
        {
            ventana.mostrarDatos(metodos.getArrayInformaciones());
        }
        else 
        {
            metodos.mendaje("No se encuntraRegistrado");
        }
    }
    
}
