import elements.general.Pelicula;
import process.Found;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Main {
    public static void main (String[] args) {
        Pelicula pelicula = Found.pelicula(1);
        System.out.println(pelicula);
    }
}
