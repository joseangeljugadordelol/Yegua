/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
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
        Artista artista = new Artista();
        artista.setNombre("bad buny");
        artista.setSitioweb("www.badbunny.com");
        
        Albun a = new Albun();
        a.setArtista(artista);
        a.setNombre("Debi tirar mas fotos");
        a.setLanzamiento(2025);
        a.setGenero(Genero.OTRO);
        
        List<Cancion> canciones = new ArrayList<> ();
        
        
    }
}
