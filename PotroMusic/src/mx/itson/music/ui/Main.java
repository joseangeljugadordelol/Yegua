/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Albun;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Cancion;
import mx.itson.music.enums.Genero;

/**
 *
 * @author ABCDE-SONY
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // artista
        System.out.println("escribe el nombre del artista");
        String nombreArtista = scanner.nextLine();
        
        System.out.println("escribe el sitio web del artista");
        String sitiowebb = scanner.nextLine();
        
        System.out.println("descripcion del artista");
        String descripciondelartista = scanner.nextLine();
        // albun
        System.out.println("escribe el nombre del albun");
        String nombreAlbun = scanner.nextLine();
        
        System.out.println("escribe año de lanzamiento del albun");
        int lanzamientoAlbun = Integer.parseInt(scanner.nextLine());
        
        //cancion1
        System.out.println("escribe el nombre de la cancion");
        String nombrecancion1 = scanner.nextLine();
        
        
        
        System.out.println("escribe la duracion de la cancion en segundos");
        int duracioncancion1 = Integer.parseInt(scanner.nextLine());
        
        //cancion2
        System.out.println("escribe el nombre de la cancion");
        String nombrecancion2 = scanner.nextLine();
        
        System.out.println("escribe la duracion de la cancion en segundos");
        int duracioncancion2 = Integer.parseInt(scanner.nextLine());
        
        Artista artista = new Artista();
        
        artista.setNombre(nombreArtista);
        artista.setSitioweb(sitiowebb);
        artista.setDescripcion(descripciondelartista);
        
        Albun a = new Albun();
        a.setArtista(artista);
        a.setNombre(nombreAlbun);
        a.setLanzamiento(lanzamientoAlbun);
        a.setGenero(Genero.OTRO);
        
        List<Cancion> canciones = new ArrayList<> ();
        
        Cancion canción1 = new Cancion();
        canción1.setNombre(nombrecancion1);
        canción1.setOrden(1);
        canción1.setDuracion(duracioncancion1);
        
        Cancion canción2 = new Cancion();
        canción2.setNombre(nombrecancion2);
        canción2.setOrden(2);
        canción2.setDuracion(duracioncancion2);
        
        
        canciones.add(canción1);
        canciones.add(canción2);
       
        a.setCanciones(canciones); 
        
        System.out.println("el nombre del artista es: "+nombreArtista);
        System.out.println("el sitio web del artista es: "+sitiowebb);
        System.out.println("la descripcion del artista es: "+descripciondelartista);
        System.out.println("el nombre del albun del artista es: "+nombreAlbun);
        System.out.println("el año del lanzamiento del artista es: "+lanzamientoAlbun);
        System.out.println("sus canciones son: ");
        
        for(Cancion c : a.getCanciones()){
           System.out.println(c.getNombre());
           System.out.println("la duracion en segundo es: "+c.getDuracion());
           System.out.println("el orden de la cancion es: "+c.getOrden());
           System.out.println("###########");
       }
    }
}
