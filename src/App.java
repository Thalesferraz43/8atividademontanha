import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double vh,salario; 
        int hm;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite o valor da sua hora: ");
        vh = sc.nextDouble();
        System.out.print("Digite o valor das horas trabalhadas por mês: ");
        hm = sc.nextInt();
        salario = vh*hm;
        System.out.printf("O total do salário no referido mês é: R$ %.2f", salario);
    }
}
