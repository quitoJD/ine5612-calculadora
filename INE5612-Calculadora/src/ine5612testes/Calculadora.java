
package ine5612testes;

/**
 * Classe Controle da Calculadora
 * @author Gabriel, Ramon
 */
public class Calculadora {

    // Memória da Calculadora
    private String reg1;
    private String reg2;
    private String memoria;
    
    boolean tem_ponto;

    private double comando_numerico;
    private Operacoes operacao;
    private String texto_display;
    
    

    public Calculadora() {
        this.reg1 = "";
        this.reg2 = "";
        this.memoria = "";
    }

    public void comando_numerico(int i) {
        
        if (this.reg1.equals("") && this.operacao == null || this.operacao == null) { // saber qual registrador usar - útil pro inicio da aplicação
            this.reg1 = this.reg1+(Integer.toString(i));
            this.texto_display = reg1;
        } else {
            reg2.concat(Integer.toString(i));
            this.texto_display = reg2;
        }
    }
    
    public void comando_operacao(Operacoes operacao) {
        this.operacao = operacao;
    }

    
    public String getTextoDisplay() {
        return this.texto_display;
    }

    public String getReg1() {
        return reg1;
    }

    public void setReg1(String reg1) {
        this.reg1 = reg1;
    }

    public String getReg2() {
        return reg2;
    }

    public void setReg2(String reg2) {
        this.reg2 = reg2;
    }
    
    
}
