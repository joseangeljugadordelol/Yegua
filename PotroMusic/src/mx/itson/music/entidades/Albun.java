/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.entidades;

import java.util.List;
import mx.itson.music.enums.Genero;

/**
 *
 * @author ABCDE-SONY
 */
public class Albun {

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    private String nombre;
    private Artista artista;
    private int lanzamiento;
    private List<Cancion> cancion;
    private Genero genero;
}
