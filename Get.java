//import des fonctionalité pour la mise en place d'un timer
import java.util.TimerTask;
import java.util.Timer;

class Get extends TimerTask{
  private CP capteur;
  private int ver;

  public Get(CP cap){
    super();
    capteur = cap;
    ver = 1;
  }

  public void run(){
    capteur.mesureValeur();
    capteur.transfertTemp(ver);
  }
}
