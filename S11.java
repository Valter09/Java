import java.util.Scanner;
public class S11{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int n;
        System.out.print("Digite um número de 1 a 7:");
        n=leia.nextInt();
        switch (n){

            case 1:
            System.out.println("O dia da semana é domingo");
            break;

            case 2:
            System.out.println("O dia da semana é segunda");
            break;

            case 3:
            System.out.println("O dia da semana é terça");
            break;

            case 4:
            System.out.println("O dia da semana é quarta");
            break;

            case 5:
            System.out.println("O dia da semana é quinta");
            break;

            case 6:
            System.out.println("O dia da semana é sexta");
            break;

            case 7:
            System.out.println("O dia da semana é sábado");
            break;

            default:
            System.out.println("O valor é inválido");

            }

}
}            
