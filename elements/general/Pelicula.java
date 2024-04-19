package elements.general;

import builders.PeliculaBuilder;
import elements.api.PeliculaSWApi;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    
    private static List<Pelicula> peliculas = new ArrayList<Pelicula>();
    private String titulo;
    private String descripcion;
    private String director;
    private String fechaDeLanzamiento;
    private String productor;
    private List<Personaje> personajes = new ArrayList<Personaje>();
    
    public Pelicula (String titulo, String descripcion, String director, String fechaDeLanzamiento, String productor, ArrayList<Personaje> personajes) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.director = director;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.productor = productor;
        this.personajes = personajes;
    }
    
    public Pelicula (String titulo, String descripcion, String director, String fechaDeLanzamiento, String productor) {
        this(titulo,descripcion,director,fechaDeLanzamiento,productor,null);
    }
    
    public Pelicula () {
        this(null, null, null, null, null, null);
    }
    
    public Pelicula(PeliculaSWApi pelicula) {
        this(pelicula.title(), pelicula.opening_crawl(), pelicula.director(),
                pelicula.release_date(), pelicula.producer());
    }
    
    
    @Override
    public String toString () {
        return "Pelicula(titulo=" + titulo + ", descripcion=" + descripcion + ", director=" + director + ", fechaDeLanzamiento=" + fechaDeLanzamiento + ", productor=" + productor + ")";
    }
    
    public String toString(boolean presentation) {
        return "Nombre: " + titulo +"\nDescripción: " + descripcion + "\nDirector: " + director + "\nFecha de Lanzamiento: " + fechaDeLanzamiento + "\nProductor: " + productor;
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion () {
        return descripcion;
    }
    
    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDirector () {
        return director;
    }
    
    public void setDirector (String director) {
        this.director = director;
    }
    
    public String getFechaDeLanzamiento () {
        return fechaDeLanzamiento;
    }
    
    public void setFechaDeLanzamiento (String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    
    public String getProductor () {
        return productor;
    }
    
    public void setProductor (String productor) {
        this.productor = productor;
    }
    
    public List<Personaje> getPersonajes () {
        return personajes;
    }
    
    public void addPersonaje (Personaje personaje) {
        this.personajes.add(personaje);
    }
    
    public static List<Pelicula> getPeliculas () {
        return peliculas;
    }
    
    public static int getPeliculasCount () {
        return peliculas.size();
    }
}
