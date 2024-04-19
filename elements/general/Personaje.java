package elements.general;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    
    private static List<Personaje> personajes = new ArrayList<>();
    private String nombre;
    private int edad;
    private float altura;
    private float peso;
    private String fechaDeNacimiento;
    private String genero;
    
    public Personaje (String nombre, int edad, float altura, float peso, String fechaDeNacimiento, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        Personaje.personajes.add(this);
    }
    
    public Personaje () {this(null,0,0,0,null,null);}
    
    @Override
    public String toString () {
        return "Personaje{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' + ", genero='" + genero + '\'' + '}';
    }
    
    public String toString(boolean presentacion) {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nAltura: " + altura + "\nPeso: " + peso + "\nFecha de Nacimiento: " + fechaDeNacimiento + "\nGenero: " + genero;
    }
    
    public static List<Personaje> getPersonajes () {
        return personajes;
    }
    
    public static void addPersonaje (Personaje personaje) {
        personajes.add(personaje);
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad () {
        return edad;
    }
    
    public void setEdad (int edad) {
        this.edad = edad;
    }
    
    public float getAltura () {
        return altura;
    }
    
    public void setAltura (float altura) {
        this.altura = altura;
    }
    
    public float getPeso () {
        return peso;
    }
    
    public void setPeso (float peso) {
        this.peso = peso;
    }
    
    public String getFechaDeNacimiento () {
        return fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento (String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public String getGenero () {
        return genero;
    }
    
    public void setGenero (String genero) {
        this.genero = genero;
    }
}
