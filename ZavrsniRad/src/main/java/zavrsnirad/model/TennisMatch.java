/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author stjep
 */
@Entity
public class TennisMatch extends Entitet {

    
    private Igrac igrac1;
    private Igrac igrac2;
    private Date datumigranja;
    private String teren;
    private String rezultat;
    private Igrac pobjednik;

    public Igrac getIgrac1() {
        return igrac1;
    }

    public void setIgrac1(Igrac igrac1) {
        this.igrac1 = igrac1;
    }

    public Igrac getIgrac2() {
        return igrac2;
    }

    public void setIgrac2(Igrac igrac2) {
        this.igrac2 = igrac2;
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

    public Igrac getPobjednik() {
        return pobjednik;
    }

    public void setPobjednik(Igrac pobjednik) {
        this.pobjednik = pobjednik;
    }

}
