package elements;

import elements.general.Pelicula;
import elements.general.Personaje;
import elements.general.Planeta;

import java.util.ArrayList;
import java.util.List;

public class PersonajeStarWars extends Personaje {
    
    public static List<Personaje> personajesSW = new ArrayList<Personaje>();
    private String colorCabello;
    private String colorRopa;
    private String colorOjos;
    private Planeta planetaNatal;
    private List<Pelicula> peliculas = new ArrayList();
    
    public PersonajeStarWars (String nombre, int edad, float altura, float peso,
                              String fechaDeNacimiento, String genero, String colorCabello,
                              String colorOjos, String colorRopa, Planeta planetaNatal,
                              List<Pelicula> peliculas) {
        super(nombre, edad, altura, peso, fechaDeNacimiento, genero);
        this.colorCabello = colorCabello;
        this.colorOjos = colorOjos;
        this.colorRopa = colorRopa;
        this.planetaNatal = planetaNatal;
        this.peliculas = peliculas;
        PersonajeStarWars.personajesSW.add(this);
    }
    
    public PersonajeStarWars (String nombre, int edad, float altura, float peso,
                              String fechaDeNacimiento, String genero,Planeta planetaNatal,
                              List<Pelicula> peliculas) {
        this(nombre,edad,altura,peso,fechaDeNacimiento,genero,null,null,null,planetaNatal,
                peliculas);
    }
    
    public PersonajeStarWars() {
        this(null,0,0,0,null,null,null,null);
    }
    
    public String getColorCabello () {
        return colorCabello;
    }
    
    public void setColorCabello (String colorCabello) {
        this.colorCabello = colorCabello;
    }
    
    public String getColorOjos () {
        return colorOjos;
    }
    
    public void setColorOjos (String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    public String getColorRopa () {
        return colorRopa;
    }
    
    public void setColorRopa (String colorRopa) {
        this.colorRopa = colorRopa;
    }
    
    public List<Pelicula> getPeliculas () {
        return peliculas;
    }
    
    public void addPeliculas (Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
    
    public static List<Personaje> getPersonajesSW () {
        return personajesSW;
    }
    
    public static int getPersonajesSWCount () {
        return PersonajeStarWars.personajesSW.size();
    }
    
    public Planeta getPlanetaNatal () {
        return planetaNatal;
    }
    
    public void setPlanetaNatal (Planeta planetaNatal) {
        this.planetaNatal = planetaNatal;
    }
}
