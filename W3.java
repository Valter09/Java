import java.util.Scanner;
public class W3{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int n, n2; 
        String operacao;
        System.out.print("Digite a primeira variável:");
        n=leia.nextInt();
        System.out.print("Digite a segunda variável:");
        n2=leia.nextInt();
        System.out.print("Escolha a operação desejada:");
        operacao=leia.next();
        switch(operacao){
            case ("soma"):
            System.out.println(n+n2);
            break;

            case ("subtração"):
            System.out.println(n-n2);
            break;

            case ("multiplicação"):
            System.out.println(n*n2);
            break;

            case ("divisão"):
            System.out.println(n/n2);
            break;

            default:
            System.out.println("Não foi possível realizar essa operação");

            }
            }
            }