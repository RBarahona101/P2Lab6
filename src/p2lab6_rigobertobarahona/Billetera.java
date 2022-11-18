package p2lab6_rigobertobarahona;

import java.util.ArrayList;

public class Billetera {
    protected int consumo;
    protected int costo;

    public Billetera() {
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    public Billetera(int consumo, int costo) {
        this.consumo = consumo;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Billetera";
    }
    
}
