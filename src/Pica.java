import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Pica {
    private String nosaukums;
    private double cena;
    private List<String> piedevas;
    private List<String> merces;

    public Pica(String nosaukums, double cena) {
        this.nosaukums = nosaukums;
        this.cena = cena;
        this.piedevas = new ArrayList<>();
        this.merces = new ArrayList<>();
    }

    public void pievienotPiedevu(String piedeva) {
        piedevas.add(piedeva);
    }

    public void pievienotMerce(String merce) {
        merces.add(merce);
    }

    public double getCena() {
        return cena;
    }

    public String toString() {
        return nosaukums;
    }
}