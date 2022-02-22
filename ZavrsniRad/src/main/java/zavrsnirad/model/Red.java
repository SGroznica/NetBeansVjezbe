/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author stjep
 */
@Entity
public class Red extends Entitet {

   
    private String brojreda;
    private Igrac igrac;

    public String getBrojreda() {
        return brojreda;
    }

    public void setBrojreda(String brojreda) {
        this.brojreda = brojreda;
    }

    public Igrac getIgrac() {
        return igrac;
    }

    public void setIgrac(Igrac igrac) {
        this.igrac = igrac;
    }

    
    
   
    
}
