import java.util.*;

public class Jogo {
    
    static Scanner scan = new Scanner(System.in);
    static Random rnd = new Random();
    
    public static void menu(){
        System.out.println("==== Menu Principal =====\n");
        System.out.println("1. Iniciar jogo\n2. Como jogar\n3. Sair");
        System.out.println("================");
    }
    
    public static void comoJogar(){
        String comoJogar = "Como funciona: \n\nO jogo funciona da segunte forma, os jogadores devem escolher um naipe de carta diferente do outro jogador,\n"
                + "e após isso serão colocados 16 cartas de diferentes naipes e valores, o jogador 1 irá coletar as cartas de mesmo \nnaipe escolhido"
                + " anteriormente, o mesmo acontece para o jogador 2, se não houver nenhuma carta do naipe selecionado \npelo jogador, será "
                + "disponibilizado outro deck com 16 cartas com outros valores. \nApós as cartas serem coletadas será ferita uma somatória dos"
                + "valores das cartas coletadas, \ne o jogador que tiver a maior somatória ganha.\n\nCartas não disponíveis: \nRei, Dama, Valete.\nO A equivale ao número 1.";
        System.out.println(comoJogar);
        System.out.println("============================");
        
        System.out.println("\n1. Sair do jogo\n2. Voltar ao Menu");
        System.out.print("Selecione um opção: ");
        int opc = scan.nextInt();
        if(opc > 2){
            do{
                System.out.println("===============");
                System.out.println("Opção inválida.");
                System.out.print("Digite uma opção: ");
                opc = scan.nextInt();
            }while(opc > 2);
        }
        System.out.println("=====================");
        
        switch(opc){
            case 1: return;
            case 2: escolher();
        }
    }
    
    public static int jogador(String nome){
        int soma = jogar(nome);
        
        return soma;
    }
    
    public static int jogar(String nome){
        int soma = 0, numCarta;
        String[] naipesCarta = {"Paus", "Ouro", "Espada", "Copas"};
        System.out.println("\n\n===== Naipes =====\n Paus\n Espada\n Copas\n Ouro");
        System.out.println("=======================");
        System.out.print("Escolha um naipe: ");
        String naipe = scan.next();
        
        //validando naipe
        if(!naipe.equalsIgnoreCase("paus")&&!naipe.equalsIgnoreCase("espada")&&!naipe.equalsIgnoreCase("ouro")&&!naipe.equalsIgnoreCase("copas")){
            do{
                System.out.println("====================");
                System.out.println("Naipe inválido.");
                System.out.print("Escolha um naipe: ");
                naipe = scan.next();
            }while(!naipe.equalsIgnoreCase("paus")&&!naipe.equalsIgnoreCase("espada")&&!naipe.equalsIgnoreCase("ouro")&&!naipe.equalsIgnoreCase("copas"));
        }
        
        System.out.println("------------------------------");
        
        //Criando o deck
        for(int i = 0; i < 16; i++){
            numCarta = rnd.nextInt(1, 10);
            String naipes = naipesCarta[rnd.nextInt(0, 4)];
            System.out.println(numCarta+" "+naipes);
            if(naipe.equalsIgnoreCase(naipes)){
                soma += numCarta;
            }  
        }
        System.out.println("--------------------------------");
        System.out.printf("Jogador %s: %d%n%n%n", nome, soma);
        
        return soma;
    }
    
    public static void escolher(){
        menu();
        System.out.print("Selecione uma opção: ");
        int opc = scan.nextInt();
        if(opc > 3){
            do{
                System.out.println("===============");
                System.out.println("Opção inválida.");
                System.out.print("Digite uma opção: ");
                opc = scan.nextInt();
            }while(opc > 3);
        }
        System.out.println("====================");
        
        switch(opc){
            case 1: 
                //Jogador 1
                int soma1 = jogador("Jogador 1"); 
                //Jogador 2
                int soma2 = jogador("Jogador 2");
                
                //verificando o vencedor
                if(soma1 > soma2){
                    System.out.println("Vencedor jogador 1!");
                }else if(soma2 > soma1){
                    System.out.println("Vencedor jogador 2!");
                }else if(soma1 == soma2){
                    System.out.println("Empate!");
                }
                    
            break;
            case 2: comoJogar();
            break;
            case 3: return;
        }
    }
    
    public static void main(String[] args) {
        
        escolher(); 
    }
}
