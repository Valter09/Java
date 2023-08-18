import java.util.Scanner;
public class S6{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float n1;
        float n2;
        float n3;
        float mediafinal;
        System.out.print("digite a primeira nota:");
        n1=leia.nextFloat();
        System.out.print("digite a segunda nota:");
        n2=leia.nextFloat();
        System.out.print("digite a terceira nota:");
        n3=leia.nextFloat();
        mediafinal=n1*2+n2*3+n3*5/10;
       System.out.println("Sua média final é:"+mediafinal);
        }
    }