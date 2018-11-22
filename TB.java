class TB{
  private CP capteurassocie;
  private int ref;
  private Centrale raccordcentre;
  private int timer;

  public TB(CP capt, int time, Centrale centre, int reference){
    capteurassocie = capt;
    timer = time;
    ref = reference;
    raccordcentre = centre;
    raccordcentre.addTB(this);
    raccordcentre.timer(capteurassocie, timer);
  }

  public void demandeMesure(){
    raccordcentre.demandeValeur(capteurassocie);
    raccordcentre.transfertTB(this);
  }

  public void demandeLastValeur(){
    raccordcentre.transfertTB(this);
  }

  public void recupValeurPourAffichage(double Val, String date){
    System.out.println("La température relevée le "+date+"par le capteur "+ref+" est de "+Val+ "°C");
  }

  //public void ajoutCapteur(CP cp){
    //capteurAssocie[nb] = cp;
    //nb++;
  //}

  public int returnRefTB(){
    return ref;
  }

  public CP returnCapteur(){
    return capteurassocie;
  }
}
