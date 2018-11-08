class Centrale{
  private double[] temperature;
  private capteur[] CP;
  private heure[] time;
  private int nb;

  public Centrale(){
    temperature = new double[100];
    CP = new capteur[100];
    time = new heure[100];
    nb = 0;
  }

  public void demandeValeur(capteur CP){

  }

  public double transfertTB(TB ){

  }

  public void stockageValeur(double temp, capteur cp, heure date){
    temperature[nb] = temp;
    CP[nb] = cp;
    heure[nb] = date;
    nb++;
  }

  public void verifVal(double temp){
    
  }
