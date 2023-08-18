import java.util.Scanner;
public class S12{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int n;
        System.out.print("Digite um número de 1 a 12:");
        n=leia.nextInt();
        switch (n){

            case 1:
            System.out.println("O dia da semana é janeiro");
            break;

            case 2:
            System.out.println("O dia da semana é favereiro");
            break;

            case 3:
            System.out.println("O dia da semana é março");
            break;

            case 4:
            System.out.println("O dia da semana é abril");
            break;

            case 5:
            System.out.println("O dia da semana é maio");
            break;

            case 6:
            System.out.println("O dia da semana é junho");
            break;

            case 7:
            System.out.println("O dia da semana é julho");
            break;

            case 8:
            System.out.println("O dia da semana é agosto");
            break;

            case 9:
            System.out.println("O dia da semana é setembro");
            break;

            case 10:
            System.out.println("O dia da semana é outubro");
            break;

            case 11:
            System.out.println("O dia da semana é novembro");
            break;

            case 12:
            System.out.println("O dia da semana é dezembro");
            break;

            default:
            System.out.println("O valor é inválido");

            }

}
}            
