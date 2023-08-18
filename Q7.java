import java.util.Scanner;
public class Q7{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float v1;
        float v2;
         System.out.print("digite o primeiro valor:");
        v1=leia.nextFloat();
        System.out.print("digite o segundo valor:");
        v2=leia.nextFloat();
        if(v1>v2){
        System.out.println("O maior valor é:"+v1);
        }else{
        System.out.println("O maior valor é:"+v2);
        }
        }
        }