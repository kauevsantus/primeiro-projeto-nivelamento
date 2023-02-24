/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaue.primeiro.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author rails
 */
public class EscritaLeitura {
    public static void main(String[] args) 
    {
        //Criando um Leitor
        // Essa não é uma variável comm, e sim um objeto!!!
        // Para ser objeto, precisa INSTÂNCIAR (usando new)
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();
        
        //System.out.println("O nome digitado foi: " + nomeDigitado + " :O");
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
        
       //System.out.println("A altura digitada foi: " + alturaDigitada + " :O");
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        //System.out.println("A idade digitada foi " + idade);
        
        System.out.println("Meu nome é " + nomeDigitado + " tenho " 
                + idade + " anos de idade e " 
                + alturaDigitada + " de altura." );
    }
}
