/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Perro {
    //Atributos
    private String Nombre;
    private String Raza;
    //Constructor no parametrizado
    
    public Perro() {
    }
    
    //Constructor paraametrizado

    public Perro(String Nombre, String Raza) {
        this.Nombre = Nombre;
        this.Raza = Raza;
    }
    
    //Setters y Getters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

   
}
