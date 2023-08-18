import java.util.Scanner;
public class Q6{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int anoatual;
        int anodenascimento;
        int idade;
        System.out.print("Digite o ano atual:");
        anoatual=leia.nextInt();
        System.out.print("Digite o seu ano de nascimento:");
        anodenascimento=leia.nextInt();
        idade=anoatual-anodenascimento;
        if(idade>=16){
        System.out.println("Poderá votar");
        }else{
        System.out.println("Não poderá votar");
        }
         }
        }