import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.println("Seu nome é: " + nome + " " +sobrenome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Você tem: " + altura + " de altura");
    }
}
