//import des fonctionalité pour récupération de la date et l'heure
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//import des fonctionalité pour la mise en place d'un timer
import java.util.TimerTask;
import java.util.Timer;

class Centrale{
  private double[] temperature;
  private CP[] cp;
  private String[] date;
  private int longtemp;
  private TB[] tb;
  private int longtb;

  public Centrale(){
    temperature = new double[1000];
    cp = new CP[1000];
    tb = new TB[1000];
    date = new String[1000];
    longtemp = 0;
    longtb = 0;
  }

  public String date(){
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    return df.format(dateobj);
  }

  public void demandeValeur(CP cap){
    cap.mesureValeur();
    cap.transfertTemp();
  }

  public void transfertTB(TB tb){
    CP caprecup = tb.returnCapteur();
    double temp = 0;
    String dateheure = "0";
    int l = longtemp-1;
    for(int i=0; i<longtemp; i++){
      CP captabl = cp[i];
      if (caprecup == captabl){
        temp = temperature[i];
        dateheure = date[i];
      }
      if (i == l){
        tb.recupValeurPourAffichage(temp, dateheure);
      }
    }
  }

  public void stockageValeur(CP cap, double temp){
    temperature[longtemp] = temp;
    cp[longtemp] = cap;
    String dateheure = this.date();
    date[longtemp] = dateheure;
    longtemp++;
    this.verifVal(cap, temp, dateheure);
  }

  public void verifVal(CP cap, double temp, String dateheure){
    int nb = 0;
    int a = 0;
    TB tdb = null;
    while(nb == 0){
      TB tbtab = tb[a];
      CP capteur = tbtab.returnCapteur();
      a++;
      if (capteur == cap) {
        tdb = tbtab;
        nb = 1;
      }
    }
    double Vmin = cap.returnVmin();
    double Vmax = cap.returnVmax();
    if (temp < Vmin || temp > Vmax){
      tdb.recupValeurPourAffichage(temp, dateheure);
    }
  }

  public void addTB(TB tdb){
    tb[longtb] = tdb;
    longtb++;
  }
}
