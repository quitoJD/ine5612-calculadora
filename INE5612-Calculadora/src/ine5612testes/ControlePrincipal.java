/*
 * ControlePrincipal.java
 *
 * Created on 10/09/2007, 19:04:14
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ine5612testes;

import ine5612testes.gui.TelaPrincipal;

/**
 *
 * @author brodock
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
