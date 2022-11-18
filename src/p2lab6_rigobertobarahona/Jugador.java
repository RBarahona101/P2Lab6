package p2lab6_rigobertobarahona;

import java.util.ArrayList;

public class Jugador {
    protected String nombre;
    protected String username;
    protected String gordura;
    protected int consumo;
    protected Billetera billetera;
    protected Alimento alimento;
    protected ArrayList<Jugador> amigos;
    protected ArrayList<Jugador> solicitudes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGordura() {
        return gordura;
    }

    public void setGordura(String gordura) {
        this.gordura = gordura;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Jugador> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Jugador> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Jugador> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Jugador> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    public Jugador(String nombre, String username, String gordura, int consumo, Billetera billetera, Alimento alimento, ArrayList<Jugador> amigos, ArrayList<Jugador> solicitudes) {
        this.nombre = nombre;
        this.username = username;
        this.gordura = gordura;
        this.consumo = consumo;
        this.billetera = billetera;
        this.alimento = alimento;
        this.amigos = amigos;
        this.solicitudes = solicitudes;
    }

    @Override
    public String toString() {
        return username;
    }
    
}
