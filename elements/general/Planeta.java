package elements.general;

import builders.PlanetaBuilder;

import java.util.ArrayList;
import java.util.List;

public class Planeta {
    
    private static List<Planeta> planetas = new ArrayList<Planeta>();
    private String nombre;
    private String clima;
    private float gravedad;
    private String tipoGravedad;
    private List<String> gravedades = new ArrayList<>();
    private int poblacion;
    private List<Personaje> residentesRelevantes = new ArrayList<>();
    
    public Planeta (String nombre, String clima, float gravedad, String tipoGravedad, ArrayList<String> gravedades, int poblacion, ArrayList<Personaje> residentesRelevantes) {
        this.nombre = nombre;
        this.clima = clima;
        this.gravedad = gravedad;
        this.tipoGravedad = tipoGravedad;
        this.gravedades = gravedades;
        this.poblacion = poblacion;
        this.residentesRelevantes = residentesRelevantes;
        Planeta.planetas.add(this);
    }
    
    public Planeta (String nombre, String clima, float gravedad,
                    String tipoGravedad, int poblacion) {
        this(nombre,clima,gravedad,tipoGravedad,null,poblacion, null);
    }
    
    public Planeta (String nombre, String clima, float gravedad, String tipoGravedad,
                    int poblacion, ArrayList<Personaje> residentesRelevantes) {
        this(nombre,clima,gravedad,tipoGravedad,null,poblacion, residentesRelevantes);
    }
    
    public Planeta () {
        this(null,null,0,null,null,0,null);
    }
    
    @Override
    public String toString () {
        return "Planeta{" + "nombre=" + nombre + ", clima=" + clima + ", gravedad=" + gravedad +
                ", tipoGravedad=" + tipoGravedad + ((gravedades != null) ?
                ", gravedades=" + gravedades :"") + ", poblacion=" + poblacion + ", residentesRelevantes=" + residentesRelevantes + '}';
    }
    
    public String toString(boolean presentacion) {
        return "Nombre: " + nombre + "\nClima: " + clima + "\nGravedad: " + gravedad + "\nTipo de" +
                " Gravedad: " + tipoGravedad + ((gravedades != null)?
                "\nGravedades:" + gravedades: "") + "\nPoblación: " + poblacion + "\nResidentes Relevantes: " + residentesRelevantes;
    }
    
    public static List<Planeta> getPlanetas () {
        return planetas;
    }
    
    public static int getPlanetasCount () {
        return planetas.size();
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public String getClima () {
        return clima;
    }
    
    public void setClima (String clima) {
        this.clima = clima;
    }
    
    public float getGravedad () {
        return gravedad;
    }
    
    public void setGravedad (float gravedad) {
        this.gravedad = gravedad;
    }
    
    public String getTipoGravedad () {
        return tipoGravedad;
    }
    
    public void setTipoGravedad (String tipoGravedad) {
        this.tipoGravedad = tipoGravedad;
    }
    
    public List<String> getGravedades () {
        return gravedades;
    }
    
    public void setGravedades (ArrayList<String> gravedades) {
        this.gravedades = gravedades;
    }
    
    public int getPoblacion () {
        return poblacion;
    }
    
    public void setPoblacion (int poblacion) {
        this.poblacion = poblacion;
    }
    
    public List<Personaje> getResidentesRelevantes () {
        return residentesRelevantes;
    }
    
    public void setResidentesRelevantes (ArrayList<Personaje> residentesRelevantes) {
        this.residentesRelevantes = residentesRelevantes;
    }
}
