import java.util.Scanner;
public class S10{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int qtdAnos, horasT, valorHora, salario;
        System.out.print("Digite o total de anos trabalhados:");
        qtdAnos=leia.nextInt();
        System.out.print("Digite as horas trabalhadas:");
        horasT=leia.nextInt();
        System.out.print("Digite o quanto você ganha por hora:");
        valorHora=leia.nextInt();
        salario=(horasT*valorHora);
        if (qtdAnos<=1){
            System.out.println("O seu salario é:"+(1500+salario));
        } else if ((qtdAnos>1)&&(qtdAnos<3)){
            System.out.println("O seu salario é:"+(2000+salario));
        } else {
            System.out.println("O seu salario é:"+(3000+salario));
        }

}
}