public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        

        System.out.println("A tv esta ? " + smartTv.ligada);
        System.out.println("A tv está no canal: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv agora esta ligada?" + smartTv.ligada);

        smartTv.desliga();
        System.out.println("Tv agora esta ligada?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual:" +smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual:" +smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Canal Atual:" +smartTv.canal);

        smartTv.descerCanal();
        System.out.println("Canal Atual:" +smartTv.canal);

        smartTv.escolherCanal(22);
        System.out.println("Canal Atual:" +smartTv.canal);

    }
}
