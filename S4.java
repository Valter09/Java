import java.util.Scanner;
public class S4{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float base;
        float altura;
        float area;
        System.out.print("digite o valor da base:");
        base=leia.nextFloat();
        System.out.print("digite o valor da altura:");
        altura=leia.nextFloat();
        area=base*altura/2;
        System.out.println("A área do retângulo é:"+area);
        }
    }