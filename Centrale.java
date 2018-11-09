class Centrale{
  private double[] temperature;
  private CP[] CP;
  private heure[] time;
  private int nb;

  public Centrale(){
    temperature = new double[100];
    CP = new CP[100];
    time = new heure[100];
    nb = 0;
  }

  public void demandeValeur(CP cp){
    cp.mesureValeur();
    cp.transfertTemp();
  }

  public double transfertTB(TB ){

  }

  public void stockageValeur(CP cp, double temp, heure date){
    temperature[nb] = temp;
    CP[nb] = cp;
    heure[nb] = date;
    nb++;
  }

  public void verifVal(double temp){

  }
