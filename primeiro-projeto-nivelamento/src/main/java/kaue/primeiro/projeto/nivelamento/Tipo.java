/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaue.primeiro.projeto.nivelamento;

/**
 *
 * @author rails
 */
public class Tipo {
    public static void main(String[] args) {
        // os tipos que mais usaremos: 
        
        //01) Números inteiros -> Integer
        Integer idade = 42;
        
        // Só declarar
        Integer numeroQualquer;
        
        //Só Inicialiazar
        numeroQualquer = 10;
        
        //02) Números quebrados -> Double
        Double altura = 1.60;
        
        //03) Para palvras - String
        String nome = "Xampson";
        
        // \n para quebra de linha 
        System.out.println("Meu nome é " + nome + "\n tenho "
                + idade + " de idade e " 
                + altura + " de altura.");
        
        //Tipos primitivos e tipos Wrapper
        //Para inteiros
        
        //Primitivo sempre tem um valor se não foi inicializado
        int inteiroPrimitivo;
        Integer inteiro;
        
        boolean boleanoPrimitivo;
        Boolean boleanoWrapper;
        
       //Classes possuem métodos! e eles vão ajudar
       //Tipos primitivos não :(
       // boleanoPrimitivo.
       // boleanoWrapper.
       
       //Uma variável da lasse Interger
       Integer valorMaxInteiro = Integer.MAX_VALUE;
        System.out.println("O Máximo de integr é: " + valorMaxInteiro);
    }
}
