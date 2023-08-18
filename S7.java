import java.util.Scanner;
public class S7{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int v1;
        int v2;
        int v3;
        int maior;
        System.out.print("digite o primeiro valor:");
        v1=leia.nextInt();
        System.out.print("digite o segundo valor:");
        v2=leia.nextInt();
        System.out.print("digite o terceiro valor:");
        v3=leia.nextInt();
        if(v1>=v2){
        if(v1>=v3){
            maior=v1;
         }
        else{
              maior=v3;
                }
                }
                else{
                    if(v2>=v3){
                        maior=v2;
                        }
                        else{
                            maior=v3;
                    }
                    }
                System.out.println("O maior valor é:"+maior);
                }
                }
                