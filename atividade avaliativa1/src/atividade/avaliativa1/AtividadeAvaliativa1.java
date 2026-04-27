package atividade.avaliativa1;

import java.util.Scanner;

public class AtividadeAvaliativa1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] sala = new int[6][8];
        int opçao = 0;

        while(opçao != 5){

            System.out.println("\n1-Reservar");
            System.out.println("\n2-Cancelar");
            System.out.println("\n3-Mapa");
            System.out.println("\n4-Status");
            System.out.println("\n5-Sair");
            opçao = sc.nextInt();

            if(opçao == 1){

                int f = sc.nextInt();
                int a = sc.nextInt();

                if(sala[f-1][a-1] == 0){
                    sala[f-1][a-1] = 1;
                    System.out.println("Reservado");
                }else{
                    System.out.println("Ocupado");
                }

            }else if(opçao == 2){

                int f = sc.nextInt();
                int a = sc.nextInt();

                if(sala[f-1][a-1] == 1){
                    sala[f-1][a-1] = 0;
                    System.out.println("Cancelado");
                }else{
                    System.out.println("Livre");
                }

            }else if(opçao == 3){

                for(int i = 0; i < 6; i++){
                    for(int j = 0; j < 8; j++){
                        System.out.print(sala[i][j] + " ");
                    }
                    System.out.println();
                }

            }else if(opçao == 4){

                int l = 0, o = 0;

                for(int i = 0; i < 6; i++){
                    for(int j = 0; j < 8; j++){
                        if(sala[i][j] == 0){
                            l++;
                        }else{
                            o++;
                        }
                    }
                }

                System.out.println("Livres: " + l);
                System.out.println("Ocupados: " + o);
                System.out.println("Ocupaçao: " + (o * 100.0 / 48) + "%");

            }else if(opçao == 5){

                System.out.println("Encerrado");

            }else{

                System.out.println("Inválido");

            }
        }
    }
}