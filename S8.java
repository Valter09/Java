import java.util.Scanner;
public class S8{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int n1;
        int n2;
         System.out.print("digite o primeiro número:");
        n1=leia.nextInt();
        System.out.print("digite o segundo número:");
        n2=leia.nextInt(); 
        if(n1>n2){
            System.out.println(n1);
        }else if(n2>n1){
            System.out.println(n2);
            }else{
                System.out.println("São iguais.");
                }
         }
        }

                 