import java.util.Scanner;
public class W5{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float tc;
        float tf;
        System.out.print("Digite a temperatura em C:");
        tc=leia.nextInt();
        tf=tc*9/5+32;
        System.out.println("A temperatura em F é:" + tf);
        }
        }
