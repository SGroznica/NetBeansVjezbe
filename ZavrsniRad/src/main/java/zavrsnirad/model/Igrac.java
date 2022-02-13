/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Igrač")
public class Igrac {

    @Id

    private int sifra;
    private String ime;
    private String prezime;
    private String oib;
    private String brojmobitela;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getBrojmobitela() {
        return brojmobitela;
    }

    public void setBrojmobitela(String brojmobitela) {
        this.brojmobitela = brojmobitela;
    }

}
