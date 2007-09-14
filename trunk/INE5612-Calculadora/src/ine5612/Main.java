/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ine5612;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Gabriel, Ramon
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
