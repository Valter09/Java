import java.util.Scanner;
public class Q5{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float n1;
        float n2;
        float media;
         System.out.print("digite a primeira nota:");
        n1=leia.nextFloat();
        System.out.print("digite a segunda nota:");
        n2=leia.nextFloat();
        media=n1+n2/2;
        System.out.print("A sua média é:"+media);
        if(media>=7){
        System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
            }
        }
        }
        
