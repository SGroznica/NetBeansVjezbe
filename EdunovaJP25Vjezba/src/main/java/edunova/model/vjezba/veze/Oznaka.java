/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model.vjezba.veze;

import edunova.model.vjezba.nasljedivanje.Dokument;
import javax.persistence.Entity;

/**
 *
 * @author CP
 */
@Entity
public class Oznaka extends Dokument{
    
    private String vrijednost;

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }
    
    
}
