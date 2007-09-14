
package ine5612testes;

/**
 * Classe Controle da Calculadora
 * @author Gabriel, Ramon
 */
public class Calculadora {

    String reg1, reg2, memoria;
    boolean tem_ponto;

    private double comando_numerico;
    private Operacoes operacao;
    private String texto_display;
    
    

    public Calculadora() {
    }

    public void comando_numerico(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public double getComando_numerico() {
        return comando_numerico;
    }

    public void setComando_numerico(double comando_numerico) {
        this.comando_numerico = comando_numerico;
    }
    
    public void appendComando_numerico(int comando_numerico) {
        this.comando_numerico = this.comando_numerico+comando_numerico;
    }
    
    public String getTextoDisplay() {
        return this.texto_display;
    }
}
