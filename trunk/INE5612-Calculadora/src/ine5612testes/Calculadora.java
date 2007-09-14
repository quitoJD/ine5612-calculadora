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

    public void comando_Backspace() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_C() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_CE() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_igual() {
        if (!this.reg2.equals("")) {
            executa_calculo();
        }
        this.texto_display = reg1;
    }

    /**
     * Faz uma inversão matemática com o número ( 1/x )
     */
    public void comando_inversao() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_MC() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_MP() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_MR() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void comando_MS() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Transforma o sinal do número para o sinal oposto
     * Se estiver positivo, fica negativo e vice versa
     */
    public void comando_sinal_oposto() {
        if (!this.reg1.equals("") && this.operacao == null) {

            // realiza a inversão de sinal
            if (this.reg1.startsWith("-")) {
                this.reg1 = this.reg1.replaceFirst("-", "");
            } else {
                this.reg1 = "-" + this.reg1;
            }
            this.texto_display = this.reg1;
        } else if (!this.reg2.equals("")) {

            // realiza a inversão de sinal
            if (this.reg2.startsWith("-")) {
                this.reg2 = this.reg2.replaceFirst("-", "");
            } else {
                this.reg2 = "-" + this.reg2;
            }
            this.texto_display = this.reg2;
        }
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

    /**
     * Define qual operação vai ser realizada entre os dois registradores
     * @param operacao Operação
     */
    public void comando_operacao(Operacoes operacao) {
        if (this.operacao == null) {
            this.operacao = operacao;
        } else if (!this.reg2.equals("")) {
            this.executa_calculo();
            this.operacao = operacao;
            this.texto_display = reg1;
        } else {
            this.operacao = operacao;
        }
    }

    public void comando_porcento() {
        double valor1 = Double.parseDouble(reg1);
        double resultado = 0;
        if (operacao != null && !reg2.equals("")) {
            executa_calculo();
            valor1 = Double.parseDouble(reg1);
            resultado = calculos.porcento(valor1);
        }
        reg1 = String.valueOf(resultado);
        this.texto_display = reg1;
    }

    public void comando_raiz() {
        double resultado = 0.0;
        double valor1 = Double.parseDouble(reg1);
        if (operacao != null && !reg2.equals("")) {
            executa_calculo();
            resultado = calculos.raiz(valor1);
        } else if (!reg1.equals("")) {
            if (operacao != null) {
                this.operacao = null;
            }
            resultado = calculos.raiz(valor1);
            reg1 = String.valueOf(resultado);
            this.texto_display = reg1;
        }
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

    /**
     * Faz os calculos pendentes, levando em conta os 2 registradores
     * e a operação salva na memória. O resultado é salvo no reg1 e
     * o reg2 é limpo, e o tipo de operação se torna null
     */
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