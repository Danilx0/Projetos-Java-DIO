public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ? " + smartTv.ligada);
        System.out.println("A tv está no canal: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

    }
}
