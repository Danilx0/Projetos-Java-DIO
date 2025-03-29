public class App {
    public static void main(String[] args){

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        Double altura = Double.valueOf(args[3]);

        System.out.println("Seu nome é: " + nome + " " +sobrenome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Você tem: " + altura + " de altura");
    }
}
