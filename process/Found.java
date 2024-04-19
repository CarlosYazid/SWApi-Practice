package process;

import com.google.gson.Gson;
import elements.PersonajeStarWars;
import elements.api.PeliculaSWApi;
import elements.general.Pelicula;
import elements.general.Personaje;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Found {
    
    private static final String urlApi = "https://swapi.dev/api/";
    static final String PELICULA = urlApi+"films/";
    static final String PERSONAJE = urlApi+"people/";
    static final String PLANETA = urlApi+"planets/";
    
    
    static HttpClient client = HttpClient.newHttpClient();
    
    public static Pelicula pelicula(int id){
        HttpRequest request =
                HttpRequest.newBuilder().uri(URI.create(PELICULA+id+"/")).build();
        return new Pelicula(Found.response(request, PeliculaSWApi.class));
    }
    
    public static Pelicula pelicula(String titulo){
        HttpRequest request =
                HttpRequest.newBuilder().uri(URI.create(URLEncoder.encode(PELICULA+"?search="+titulo,StandardCharsets.UTF_8))).build();
        return new Pelicula(Found.response(request, PeliculaSWApi.class));
    }
    
    public static Personaje personaje(int id){
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URLEncoder.encode(PERSONAJE+id+"/", StandardCharsets.UTF_8))).build();
        return Found.response(request,Personaje.class);
    }
    
    public static PersonajeStarWars personaje(String titulo) {
        HttpRequest request =
                HttpRequest.newBuilder().uri(URI.create(URLEncoder.encode(PERSONAJE+"?search="+titulo,
                        StandardCharsets.UTF_8))).build();
        return Found.response(request,PersonajeStarWars.class);
    }
    
    private static <T> T response (HttpRequest request, Class<T> clase)  {
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        return new Gson().fromJson(response.body(),clase);
    }
}
