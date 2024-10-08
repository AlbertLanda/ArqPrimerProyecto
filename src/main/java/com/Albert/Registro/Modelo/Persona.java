/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Albert.Registro.Modelo;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Persona {
    private String nombre;
    private int edad;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;

    public Persona(String nombre, int edad, Date fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Fecha de Nacimiento: " + fechaNacimiento + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}
