/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author stjep
 */
@Entity
public class Red {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;
    private String brojreda;
    @ManyToMany
    private List<Igrac> igraci;

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getBrojreda() {
        return brojreda;
    }

    public void setBrojreda(String brojreda) {
        this.brojreda = brojreda;
    }

    public List<Igrac> getIgraci() {
        return igraci;
    }

    public void setIgraci(List<Igrac> igraci) {
        this.igraci = igraci;
    }

    

   
    

    

}
