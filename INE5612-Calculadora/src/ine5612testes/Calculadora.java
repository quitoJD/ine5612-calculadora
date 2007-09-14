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

    private Operacoes operacao;
    private String texto_display;

    public Calculadora() {
        this.reg1 = "";
        this.reg2 = "";
        this.memoria = "";
    }

    public void comando_igual() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_inversao() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_mc() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_mp() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_mr() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_ms() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_numerico(int i) {

        if (this.reg1.equals("") && this.operacao == null || this.operacao == null) {
            // saber qual registrador usar - útil pro inicio da aplicação
            this.reg1 = this.reg1 + (Integer.toString(i));
            this.texto_display = reg1;
        } else {
            this.reg2 = this.reg2 + (Integer.toString(i));
            this.texto_display = reg2;
        }
    }

    public void comando_operacao(Operacoes operacao) {
        this.operacao = operacao;
    }

    public void comando_porcento() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_raiz() {
    }

    public void comando_virgula() {
        if (this.reg1.equals("") && this.operacao == null || this.operacao == null) {
            // saber qual registrador usar - útil pro inicio da aplicação
            if (!temPonto(reg1)) {
                this.reg1 = this.reg1 + ".";
                this.texto_display = reg1;
            }
        } else {
            if (!temPonto(reg2)) {
                this.reg1 = this.reg1 + ".";
                this.texto_display = reg2;
            }
        }
    }
    
    /*realiza a operação da memoria, armazenando resultado no reg1 feito isso,
    o reg2 eh limpado, e o atributo operacao eh setado como null*/
    private void executa_calculo() {
        double valor1 = Double.parseDouble(reg1);
        double valor2 = Double.parseDouble(reg2);
        double resultado = 0.0;
                
        if (operacao == Operacoes.SOMA) {
            resultado = calculos.somar(valor1, valor2);
        }
        if (operacao == Operacoes.SUBTRACAO) {
            resultado = calculos.subtrair(valor1, valor2);
        }
        if (operacao == Operacoes.MULTIPLICACAO) {
            resultado = calculos.multiplicar(valor1, valor2);
        }
        if (operacao == Operacoes.DIVISAO) {
            resultado = calculos.dividir(valor1, valor2);
        }
        this.reg1 = String.valueOf(resultado);
        this.reg2 = "";
        this.operacao = null;
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

    /**
     * Verifica a existência ou não de ponto em uma string
     * @param analisar string a ser analisada
     * @return true se tiver ponto ou false se não tiver
     */
    private boolean temPonto(String analisar) {
        //throw new UnsupportedOperationException("Not yet implemented");
        return analisar.contains(".");
    }
}