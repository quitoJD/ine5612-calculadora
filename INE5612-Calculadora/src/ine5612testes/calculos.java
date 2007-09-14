package ine5612testes;

/**
 *
 * @author wabba
 */
public class calculos {
    
    /*private calculadora calc;

    public calculadora getCalc() {
        return calc;
    }

    public void setCalc(calculadora calc) {
        this.calc = calc;
    }*/

    public calculos() {
    }

    //implementação das operações básicas
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double inverter(double a) {
        return 1/a;
    }

    public double porcento(double a) {
        //requer operação de multiplicação
        return a * 100;
    }

    public double elevar(double a, double b) {
        //verificar implementação
        return Math.pow(a, b);
    }

    public double raiz(double a) {
        //verificar implementação
        return Math.sqrt(a);
    }
}