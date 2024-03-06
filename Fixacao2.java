import java.util.Scanner;

public class Fixacao2 {
    public static void main(String[] args){
        /*
         * Exercício de fixação 2
         * ▪ Transformar o programa do exercício 1 para um sistema que permita ler a
         * entrada de dados pelo usuário em um vetor durante execução;
         * ▪ Permitir que o usuário informe, primeiro, os dados de 5 (cinco) alunos e depois
         * de capturados os dados, imprimir o relatório final com todos os dados:
         * Matrícula: xxxxx
         * Nome: xxxxx xxxxx
         * Aprovado: ( x ) Sim ( ) Não
         * Nota final: xxxxx
         */
        Scanner leitor = new Scanner(System.in);
        int i;

        System.out.println("Numero de Alunos Registrados: ");
        int n = leitor.nextInt();


        int[] matricula = new int[n];
        String[] nome = new String[n];
        Boolean[] aprovado = new Boolean[n];
        int[] nota1 = new int[n];
        int[] nota2 = new int[n];
        int[] media = new int[n];

    for(i = 0; i < n; i++){
   
        System.out.println("\n\n--Aluno " + (i + 1)+ "--");
        System.out.println("Digite a Matrícula do aluno: ");
        matricula[i] = leitor.nextInt();

        leitor.nextLine();
        System.out.println("Digite o Nome do Aluno: ");
        nome[i] = leitor.nextLine();

            System.out.println("Digite a nota 1:");
            nota1[i] = leitor.nextInt();
            
            System.out.println("Digite a nota 2:");
            nota2[i] = leitor.nextInt();

        media[i] = (nota1[i] + nota2[i])/2;

        if(media[i] >= 6){
            aprovado[i] = true;
        }else{
            aprovado[i] = false;
        }

    }

    for(i = 0; i < n; i++){
        System.out.printf("\n-----------------------------------\nMatrícula: %d\nNome: %s", matricula[i], nome[i]);

        if(aprovado[i] == true){
            System.out.printf("\nAprovado: (x) Sim ( ) Não");
        }else{
            System.out.printf("\nAprovado: ( ) Sim (x) Não");
        }

            System.out.printf("\nNota final: %d", media[i]);
    }
        leitor.close();
    } 
    
}

