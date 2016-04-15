/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jaki
 */
public class Usuario {
    
    private int numeroPrestamo;
    private String nombre;
    private String cedula;
    private String isbnLibro;

    public Usuario(int numeroPrestamo, String nombre, String cedula, String isbnLibro) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.isbnLibro = isbnLibro;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }
    
    
    public String getInformacio()
    {
        return "El numero de prestamo es "+numeroPrestamo+"El nombre es "+nombre+"La cedula es "+cedula+"el ISBN del Libro es "+isbnLibro;
    }
    
}
