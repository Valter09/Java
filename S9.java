import java.util.Scanner;
public class S9{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int n;
         System.out.print("digite o número:");
        n=leia.nextInt();
        if(n>0){ 
        System.out.println("É maior que 0.");
        }else if(n<0){
            System.out.println("É menor que 0.");
            }else{
                System.out.println("Tem valor 0.");
                }
                }
                }