
package com.mycompany.tarefaswitch;

import java.util.Scanner;

public class TarefaSwitch {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    //Primeiro exercício
try{
    System.out.print("Por favor, digite um número de 1 a 4: ");
    int Passagem = scanner.nextInt();
    
    String tipoPassagem = "";
    double valor = 0;
    
    switch (Passagem) {
        case 1:
        tipoPassagem = "Ônibus Urbano";
        valor = 4.40;
        System.out.println("Você deseja comprar a passagem para o Ônibus Urbano?");
        break;

        case 2:
        tipoPassagem = "Metrô";
        valor = 5.00;
        System.out.println("Você deseja comprar a passagem para o Metrô?");
        break;

        case 3:
        tipoPassagem = "Trem Intermunicipal";
        valor = 6.50;
        System.out.println("Você deseja comprar a passagem para o Trem Intermunicipal?");
        break;

        case 4:
        tipoPassagem = "Ônibus Rodoviário";
        valor = 12.00;
        System.out.println("Você deseja comprar a passagem para o Ônibus Rodoviário?");
        break;
        
        default:
        System.out.println("Esse número é inválido.");
        break;
        }
    
        System.out.print("Quantas passagens você precisa?: ");
        int quantidade = scanner.nextInt();
  
        System.out.println("Você deseja "+ quantidade +" passagem(ns) de "+ tipoPassagem + "?");
    
        double valorFinal = quantidade*valor;
        System.out.println("Você precisa pagar R$"+ valorFinal);
    
    }catch(Exception e) {
    System.out.println("Esse valor não é válido, tente novamente com outro valor.");
        
    }finally{
    System.out.println("Obrigado pela prefêrencia!.");
    }
    
//Fim do primeiro exercício

System.out.println();

//Segundo exercício

    double saldo = 500;
try{
    System.out.print("Qual serviço você deseja? Digite de 1 a 4: ");
    int Serviço = scanner.nextInt();
    
    switch (Serviço) {
        case 1:
        System.out.println("Você deseja consultar seu saldo atual?");
        System.out.println("Seu saldo atual é de R$"+ saldo); 
        break;

        case 2:
        System.out.println("Você deseja sacar quanto dinheiro?");

        double saque = scanner.nextDouble();

        if (saque > saldo) {
        System.out.println("Não foi possível sacar esse dinheiro, verifique seu saldo novamente.");
        }else {
        System.out.println("Seu saldo após o saque é de R$"+ (saldo-saque));
        }
        break;

        case 3:
        System.out.println("Você deseja depositar quanto dinheiro?");

        double deposito = scanner.nextDouble();

        if (deposito <= 0) {
        System.out.println("Não foi possível realizar seu depósito, tente novamente com um valor maior que zero.");
        }else {
        System.out.println("Seu novo saldo é de R$"+ (saldo+deposito));
        }
        break;

        case 4:
        System.out.println("Você deseja encerrar com o atendimento?");
        break;
        
        default:
        System.out.println("Não possuímos esse serviço, digite um número de 1 a 4.");
        break;
        }
    
    }catch(Exception e) {
    System.out.println("Esse número não é válido, apenas números inteiros são aceitos.");
        
    }finally{
    System.out.println("Obrigado ppela preferência!");
    }

    //Fim do segundo exercício

    System.out.println();

    //Terceiro exercício
    
try{
    System.out.println("Escolha uma das faixas etárias:"); 
    System.out.println("1: Criança (0 a 12)");
    System.out.println("2: Adolescente (13 a 17)");
    System.out.println("3: Adulto (18 a 59)");
    System.out.println("4: Idoso (60+)");
    
    int opcao = scanner.nextInt();
    
    System.out.println();

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    
    System.out.println();

switch (opcao) {
        case 1:
        if (idade <= 12) {
        System.out.println("Você é uma criança. Você está na faixa etária infantil.");
        }else {
        System.out.println("A idade digitada não faz parte da faixa etária escolhida.");
        }
        break;

        case 2:
        if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente. Você está na faixa etária juvenil.");
        }else {
            System.out.println("A idade digitada não faz parte da faixa escolhida.");
        }
        break;

        case 3:
        if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto. Você está na faixa etária adulta.");
        }else {
            System.out.println("A idade digitada não faz parte da faixa escolhida.");
        }
        break;

        case 4:
        if (idade >= 60) {
            System.out.println("Você é um idoso. Você está na faixa etária idosa.");
        }else {
            System.out.println("A idade digitada não faz parte da faixa escolhida.");
        }
        break;

        default:
        System.out.println("Essa opção não existe. Digite de 1 a 4.");
        break;
        }

    }catch(Exception e) {
    System.out.println("Valor inválido.");
        
    }finally{
    scanner.close();
    System.out.println("Obrigado pela preferência!");
    }

    //Fim do terceiro exercício
        
        }
    }