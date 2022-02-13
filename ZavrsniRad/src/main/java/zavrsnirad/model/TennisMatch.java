/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author stjep
 */
@Entity
public class TennisMatch {

    @Id
    private int sifra;
    private Date datumigranja;
    private String teren;
    private String rezultat;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public Date getDatumigranja() {
        return datumigranja;
    }

    public void setDatumigranja(Date datumigranja) {
        this.datumigranja = datumigranja;
    }

    public String getTeren() {
        return teren;
    }

    public void setTeren(String teren) {
        this.teren = teren;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

}
