/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

//MAria Jose Arias Valenzuela
public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private String matricula;
    private String carrera;
    private int edad;
    private String correo;
    
    //Crear el constructor de la clase
    public Estudiante(){} //Constructor vacio
    
    public Estudiante(String nombre, String apellido, String rut,
            String matricula, String carrera, int edad,
            String correo){
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.matricula = matricula;
        this.carrera = carrera;
        this.edad = edad;
        this.correo = correo;
    } //Constructor lleno
    public String getNombre(){return this.nombre;}    
    public String getApellido(){return this.apellido;}
    public String getRut(){return this.rut;}
    public String getMatricula(){return this.matricula;}
    public String getCarrera(){return this.carrera;}
    public int getEdad(){return this.edad;}
    public String getCorreo(){return this.correo;}
    //Metodos set
     public void setNombre(String n){this.nombre = n;}
     public void setApellido(String a){this.apellido = a;}
     public void setRut(String r){this.rut = r;}
     public void setMatricula(String m){this.matricula = m;}
     public void setCarrera(String c){this.carrera = c;}
     public void setEdad(int e){this.edad = e;}
     public void setCorreo(String co){this.correo = co;}
    @Override
    public String toString(){
        String cadena = "";
        cadena += "Nombre: " + this.nombre + " " + this.apellido +
                "\nRUT: " + this.rut +
                "\nMatricula: " + this.matricula +
                "\nCarrera: " + this.carrera +
                "\nEdad: " + this.edad +
                "\nCorreo: " + this.correo;
        return cadena;
    } 
   }
 
