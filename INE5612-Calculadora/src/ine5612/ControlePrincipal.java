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

import ine5612.gui.TelaPrincipal;

/**
 *
 * @author Gabriel, Ramon
 */
public class ControlePrincipal {

    private TelaPrincipal telaPrincipal;
    private Calculadora calculadora;

    public ControlePrincipal() {
        this.calculadora = new Calculadora();
        this.telaPrincipal = new TelaPrincipal(this);
    }

    /**
     * Mostra a tela principal do programa
     */
    public void MostraTelaPrincipal() {
        this.telaPrincipal.setVisible(true);
    }

    public Calculadora getCalculadora() {
        return this.calculadora;
    }
}
