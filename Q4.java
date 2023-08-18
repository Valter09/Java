import java.util.Scanner;
public class Q4{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int numero;
        System.out.print("Digite o número de maçãs:");
        numero=leia.nextInt();
        if (numero>=12){
        System.out.println("O preço que você vai pagar é:"+numero*1.90);
        }else{
            System.out.println("O preço que você vai pagar é:"+numero*2.50);
            }
        }
        }