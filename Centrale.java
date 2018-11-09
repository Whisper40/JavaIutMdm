class Centrale{
  private double[] temperature;
  private CP[] cp;
  //private heure[] time;
  private int longtemp;
  private TB[] tb;
  private int longtb;

  public Centrale(){
    temperature = new double[100];
    cp = new CP[100];
    //time = new heure[100];
    longtemp = 0;
  }

  public void demandeValeur(CP cap){
    cap.mesureValeur();
    cap.transfertTemp();
  }

  public void transfertTB(TB tb){
    CP caprecup = tb.returnCapteur();
    double temp = 0;
    for(int i=0; i<longtemp; i++){
      CP captabl = cp[i];
      if (caprecup == captabl){
        temp = temperature[i];
      }
    }
    tb.recupValeurPourAffichage(temp);
  }

  public void stockageValeur(CP cap, double temp){
    temperature[longtemp] = temp;
    cp[longtemp] = cap;
    //heure[longtemp] = date;
    longtemp++;
    this.verifVal();
  }

  public void verifVal(CP cap, double temp){
    int nb = 0;
    while(nb = 0){
      TB tbtab = tb[i];
      CP capteur = tbtab.returnCapteur();
      if (capteur == cap){
        nb = 1;
      }
    }
    double Vmin = cap.returnVmin();
    double Vmax = cap.returnVmax();
    if (temp < Vmin || temp > Vmax){
      tbtab.recupValeurPourAffichage(temp);
    }
  }

}
