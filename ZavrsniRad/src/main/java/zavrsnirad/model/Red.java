/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author stjep
 */
@Entity
public class Red {

    @Id
    private int sifra;
    private String brojreda;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getBrojreda() {
        return brojreda;
    }

    public void setBrojreda(String brojreda) {
        this.brojreda = brojreda;
    }

}
