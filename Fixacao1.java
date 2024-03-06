import java.util.Scanner;

public class Fixacao1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        /*
         * Exercício de fixação 1
         * ▪ Criar um programa para processar as seguintes informações de um aluno:
         * matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
         * 
         * ▪ Durante a execução calcular a nota final do aluno utilizando a seguinte
         *   regra: 
         *      1. notaFinal = (nota1 + nota2) / 
         *      2. Se a nota final for igual ou superior a 6 o aluno está aprovado, 
         *      caso contrário estará reprovado;▪ O programa deverá imprimir o seguinte 
         *      relatório:
         * 
         *      Matrícula: xxxxx
         *      Nome: xxxxx xxxxx
         *      Aprovado: ( x ) Sim ( ) Não
         *      Nota final: xxxxx
         */
        String nome;
        Boolean aprovado;

        System.out.println("Digite a Matrícula do aluno: ");
        int matricula = leitor.nextInt();

        leitor.nextLine();
        System.out.println("Digite o Nome do Aluno: ");
        nome = leitor.nextLine();

            System.out.println("Digite a nota 1:");
            int nota1 = leitor.nextInt();
            
            System.out.println("Digite a nota 2:");
            int nota2 = leitor.nextInt();

        int media = (nota1 + nota2)/2;

        if(media >= 6){
            aprovado = true;
        }else{
            aprovado = false;
        }

        System.out.printf("\n-----------------------------------\nMatrícula: %d\nNome: %s", matricula, nome);

        if(aprovado == true){
            System.out.printf("\nAprovado: (x) Sim ( ) Não");
        }else{
            System.out.printf("\nAprovado: ( ) Sim (x) Não");
        }

        System.out.printf("\nNota final: %d", media);
        
        leitor.close();
    }
}
