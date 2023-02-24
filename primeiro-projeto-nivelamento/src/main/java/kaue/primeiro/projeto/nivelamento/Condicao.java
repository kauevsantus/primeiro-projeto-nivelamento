/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaue.primeiro.projeto.nivelamento;

/**
 *
 * @author rails
 */
public class Condicao {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        if (numero01 > numero02) {
            System.out.println("É maior!");
            
        }else if(numero01 < numero02){
            System.out.println("É menor");
            
        }else{
            System.out.println("É igual");
        }
        
        String nome1 = "Xampson";
        String nome2 = "xampson";
        
        //SENsitive case
        if (nome1.equals(nome2)) {
            System.out.println("O nome é igual");
            
        } else {
            System.out.println("O nome não é igual");
        }
        
        //INsensitive case
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("O nome é igual");
            
        } else {
            System.out.println("O nome não é igual");
        }
        
        //Comparação de booleanos
        
        Boolean bloqueado = false;
        
        if (bloqueado) {
            System.out.println("Tá Bloqueado");
            
        } else {
            System.out.println("Tá Desbloquedo");
        }
    }
}
