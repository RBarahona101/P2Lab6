package p2lab6_rigobertobarahona;

import java.util.ArrayList;

public class Alimento {
    protected String nombre;
    protected Categoria categoria;
    protected int costo;
    protected int calorias;

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Alimento(String nombre, Categoria categoria, int costo, int calorias) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
