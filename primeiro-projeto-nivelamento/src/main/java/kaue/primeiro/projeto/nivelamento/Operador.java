/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaue.primeiro.projeto.nivelamento;

/**
 *
 * @author rails
 */
public class Operador {
    public static void main(String[] args) {
        
        Integer numero01 = 10;
        Integer numero02 = 10;
        
        //01) Soma
        //Exibindo com uma variável
        Integer soma = numero01 + numero02;        
        System.out.println("Soma: " + soma);
        
        //Somando direto no print
        System.out.println("Soma: " + (numero01 + numero02));
        
        //02) Multiplicação
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
        //03) Divisão
        System.out.println("Divisão: " + (numero01 / numero02));
        
        //04) Subtração
        System.out.println("Subtração: " + (numero01 - numero02));
        
        //05) Resto
        System.out.println("Resto: " + (numero01 % numero02));
        
        //06) Somando e Subtraindo 1
        System.out.println("Valor + 1: " + (++numero01));
        System.out.println("Valor - 1: " + (--numero02));
        
        //O operador ** usado para potencia no JS NÃO tem no Java!!!
        // Mas temos uma classe com um método que faz isso :)
        
        Double potencia = Math.pow(2, 5);
        
        System.out.println("Potência no Java " + (Math.pow(2, 5)));
        
        //Essa classe, além de métodos tem variáveis que ajudam!
        System.out.println("Valor de PI: " + Math.PI);
        
        //07) Soma de variáveis
        
        numero01 += 20;
       
    }
}
