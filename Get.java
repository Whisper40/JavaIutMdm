//import des fonctionalité pour la mise en place d'un timer
import java.util.TimerTask;
import java.util.Timer;

class Get extends TimerTask{
  private CP capteur;
  private Centrale centrale;

  public Get(Centrale centre,CP cap){
    super();
    capteur = cap;
    centrale = centre;
  }

  public void run(){
    centrale.demandeValeur(capteur);
  }
}
