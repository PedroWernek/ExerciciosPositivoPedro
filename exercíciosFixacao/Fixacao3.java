import java.util.Scanner;

public class Fixacao3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        /*Exercício de fixação 3
        ▪ Criar um programa para processar as seguintes informações de um aluno:

        matrícula, nome , nota 1, nota 2, nota 3, nota 4 e nota 5;

        ▪ O sistema deverá ler as notas do aluno em um vetor e a entrada de dados
        pelo usuário só poderá ser nos valores de 0 a 10;▪ No final da execução 
        imprimir o seguinte relatório:
        Matrícula: xxxxx
        Nome: xxxxx xxxxx
        Nota (x) : xxxxx
        Nota (y) : yyyyy
        (...) */

        System.out.println("Número de alunos: ");
        int Nalunos = leitor.nextInt();

        int[] matriculas = new int[Nalunos];
        String[] Nomes = new String[Nalunos];
        int[][] Notas = new int[Nalunos][5];

        for(int i = 0; i < Nalunos; i++){
            System.out.println("\n\nAluno " + (i + 1));
            System.out.println("Matricula: ");
            matriculas[i] = leitor.nextInt();
            System.out.println("Nome: ");
            leitor.nextLine();
            Nomes[i] = leitor.nextLine();
            System.out.println("Notas:");
            for(int j = 0 ; j < 5; j++){
                System.out.println("    Nota [" + (j + 1) + "]: ");
                Notas[i][j] = leitor.nextInt();
            }
        }
        leitor.close();


        for(int i = 0; i < Nalunos; i++){
            System.out.println("\n----------------------------\nAluno " + (i + 1));
            System.out.println("Matricula: " + matriculas[i] + "\nNome: " + Nomes[i] +"\nNotas:");
            for(int j = 0 ; j < 5; j++){
                System.out.println("    Nota [" + (j + 1) + "]: " + Notas[i][j]);
            }
        }
        
    
    }
}
