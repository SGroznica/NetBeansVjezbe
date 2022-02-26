/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad;

import org.hibernate.Session;
import zavrsnirad.util.HibernateUtil;
import zavrsnirad.util.PocetniInsert;


public class Start {
    
    private Session session;
    
    public Start(){
        this.session = HibernateUtil.getSession();
        //PocetniInsert.izvedi();
    }
    
    public static void main(String[] args) {
        new Start();
    }

}
