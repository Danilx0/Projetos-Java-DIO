public class SmartTv {
    boolean ligada=false;
    int canal=10;
    int volume=14;

    public void ligar() {
      ligada = true;
    }

    public void desliga(){
      ligada = false;
    }
    public void aumentarVolume(){
      volume++;
    }
    public void diminuirVolume(){
      volume--;
    }
    public void subirCanal(){
      canal++;
    }
    public void descerCanal(){
      canal--;
    }
    public void escolherCanal(int novoCanal){
      canal = novoCanal;
    }
}
