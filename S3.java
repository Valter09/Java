import java.util.Scanner;
public class S3{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int numero;
        int antecessor;
        int sucessor;
        System.out.print("Digite um número:");
        numero=leia.nextInt();
        antecessor=numero-1;
        sucessor=numero+1;
        System.out.println("O antecessor do número é:"+antecessor);
        System.out.println("O sucessor do número é:"+sucessor);
        }
    }