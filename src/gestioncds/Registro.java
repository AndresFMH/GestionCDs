/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncds;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Registro {
    
    private String nomArtista,nomAlbum,Genero,Canciones;

    public Registro(String nomArtista, String nomAlbum, String Genero, String Canciones) {
        this.nomArtista = nomArtista;
        this.nomAlbum = nomAlbum;
        this.Genero = Genero;
        this.Canciones = Canciones;
    }

    public String getNomArtista() {
        return nomArtista;
    }

    public void setNomArtista(String nomArtista) {
        this.nomArtista = nomArtista;
    }

    public String getNomAlbum() {
        return nomAlbum;
    }

    public void setNomAlbum(String nomAlbum) {
        this.nomAlbum = nomAlbum;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCanciones() {
        return Canciones;
    }

    public void setCanciones(String Canciones) {
        this.Canciones = Canciones;
    }

    
    
}
