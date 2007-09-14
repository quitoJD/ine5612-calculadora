/*
 * Main.java
 *
 * Created on 30/08/2007, 19:09:12
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ine5612testes;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author brodock
 */
public class Main {
    
    //TODO: ENTREGAR PRA DIA 10/Setembro
    /** Creates a new instance of Main */
    public Main() {
        
        ControlePrincipal ctr = new ControlePrincipal();
        ctr.MostraTelaPrincipal();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        Main main = new Main();
    }
    
}
