import java.util.Scanner;
public class S14{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int codigo, copias;
        float valor;
        System.out.print("Digite o seu código:");
        codigo=leia.nextInt();
        System.out.print("Digite a quantidade de cópias desejadas:");
        copias=leia.nextInt();
        System.out.print("Digite o valor que deseja pagar:");
        valor=leia.nextInt();

        switch (codigo) {

            case 10:
            System.out.println("A quantidade de cópias feitas foi:" + copias);
            System.out.println("O valor recebido foi:" + valor);
            System.out.println("O valor da compra é:" + (copias*1.50));
            if (valor-copias*1.50<=0){
                System.out.println("O valor recebido não é suficiente para pagar as cópias");
                }
                else{
                    System.out.println("O seu troco é:" + (valor-(copias*1.50)));
                    }
            break;

            case 20:
            System.out.println("A quantidade de cópias feitas foi:" + copias);
            System.out.println("O valor recebido foi:" + valor);
            System.out.println("O valor da compra é:" + (copias*0.80));
            if (valor-copias*0.80<=0){
                System.out.println("O valor recebido não é suficiente para pagar as cópias");
                }
                else{
                    System.out.println("O seu troco é:" + (valor-(copias*0.80)));
                    }
            break;

            case 30:
            System.out.println("A quantidade de cópias feitas foi:" + copias);
            System.out.println("O valor recebido foi:" + valor);
            System.out.println("O valor da compra é:" + (copias*0.60));
            if (valor-copias*0.60<=0){
                System.out.println("O valor recebido não é suficiente para pagar as cópias");
                }
                else{
                    System.out.println("O seu troco é:" + (valor-(copias*0.60)));
                    }
            break;

            case 40:
            System.out.println("A quantidade de cópias feitas foi:" + copias);
            System.out.println("O valor recebido foi:" + valor);
            System.out.println("O valor da compra é:" + (copias*2.00));
            if (valor-copias*2.00<=0){
                System.out.println("O valor recebido não é suficiente para pagar as cópias");
                }
                else{
                    System.out.println("O seu troco é:" + (valor-(copias*2.00)));
                    }
            break;

            default:
            System.out.println("Não foi possível realizar essa operação");

            }
            }
            }