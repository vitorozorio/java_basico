/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_git;

import java.time.LocalTime;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class Escola {

    public static void main(String[] args) {
        //função responsável pela entrada de dados Obs: ela tmb é um objeto.
        Scanner entrada = new Scanner(System.in);
        LocalTime horaAtual = LocalTime.now();

        Diretor d1 = new Diretor();
        d1.setNome("igor");
        d1.setCpf("013355577");

        d1.setLogin("a");
        d1.setSenha("a");
        
        
         if (d1.getLogin().equals("a") && d1.getSenha().equals("a")) {
            System.out.println("### Bem vindo são exatamente: { " + horaAtual + " } Horário de Brasília");
                System.out.println("Oque deseja fazer?");//fazer um case
                    
        } else {
            System.out.println("Por favor! Informe login e senha corretos!");
        }

        /*
        if(login.equals("admin") && senha.equals("admin")){
            System.out.println("Logado com sucesso!");
        }
         */
 /*
        
Uma empresa nos solicitou um programa para cadastro e verificação.

Requisitos do programa:
1- Ter o nome da escola no inicio ### Escola mãos que move o mundo ####

2- Deve conter locais para armazenamento do login, senha, nome, matrícula, idade, sexo, e quatro notas do aluno.

3- A escola demandou também, que necessita de um algorítimo para verificar se o login e senha estão corretos.

4- e também uma área onde mostra se o aluno passou de série ou não. 

5- Após testar o código e ele tiver func
        
         */
    }
}
