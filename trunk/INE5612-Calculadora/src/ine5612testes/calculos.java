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
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double inverter(double a) {
        return 1/a;
    }

    public static double porcento(double a) {
        //requer operação de multiplicação
        return a * 100;
    }

    public static double elevar(double a, double b) {
        //verificar implementação
        return Math.pow(a, b);
    }

    public static double raiz(double a) {
        //verificar implementação
        return Math.sqrt(a);
    }
}