/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Sintaxe {
    public static void main(String[] args) {
        
        //tipos primitivos
            //inteiros
                int numero1 = 10;
                long numero2 = 10;
            //ponto flutuantes    
                float numero3 = 10;
                double numero4 = 10;
            //booleana    
                boolean booleana = true;
            //char
                char letra = 'A';
            //outra forma;
                char[] letras = new char[10];
                //ex:
                letras[0] = 'I'; //tem que ser com aspas assim => '' para funcionar
                letras[1] = 'G';
                letras[2] = 'O';
                letras[3] = 'R';
                
                System.out.println(letras);
                
                //tipo String
                    //ex: ele é um objeto
                String nome = "Aurora";
                
                
               //estruturas de repetição
               
               /*for(int i = 1; i < 10; i++){
                   System.out.println("bola"+i);
               }*/
               
               /*
               * comentei pois ele vai gerar loop infinito
               *
               while(10 == 10){
                   
               }
               */
               
               //objeto de entrada do java, obs que ele foi importado
               Scanner entrada = new Scanner(System.in);
             
               
               System.out.println("o  escreve alguma coisa ai o cabaço");
               
                 String nome1 = entrada.nextLine();
                 
                 System.out.println(nome1);
                
                
        
    }
}
