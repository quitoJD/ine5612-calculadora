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

/**
 * Classe responsável pelos cálculos
 * @author Ramon
 */
public class Calculos {
    
    /*private calculadora calc;

    public calculadora getCalc() {
        return calc;
    }

    public void setCalc(calculadora calc) {
        this.calc = calc;
    }*/

    public Calculos() {
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
        return a / 100;
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