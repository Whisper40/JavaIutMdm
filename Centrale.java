class Centrale{
  private double[] temperature;
  private CP[] cp;
  //private heure[] time;
  private int nb;

  public Centrale(){
    temperature = new double[100];
    cp = new CP[100];
    //time = new heure[100];
    nb = 0;
  }

  public void demandeValeur(CP cap){
    cap.mesureValeur();
    cap.transfertTemp();
  }

  public double transfertTB(TB tb){
    CP caprecup = tb.returnCapteur();
    double temp;
    for(int i=0; i<nb; i++){
      CP captabl = cp[i];
      if (caprecup = captabl){
        temp = temperature[i];
      }
    }
    tb.recupValeurPourAffichage(temp);
  }

  public void stockageValeur(CP cap, double temp){
    temperature[nb] = temp;
    CP[nb] = cap;
    //heure[nb] = date;
    nb++;
  }

  //public void verifVal(double temp){

  //}
