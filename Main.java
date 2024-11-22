import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("**** Média notas ****");

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        int nota1 = s.nextInt();

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite a segunda nota");
        int nota2 = s.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite a terceira nota");
        int nota3 = s.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Digite a quarta nota");
        int nota4 = s.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) /4;
            System.out.println("Sua média é :" + media);

            if (media>=70){
                System.out.println("Aprovado");
            }
            else if (media>=50){
                System.out.println("Recuperação");
            } else{
                System.out.println("Reprovado");
        }

    }
}
