class TB{
  //private CP[] capteurAssocie;
  private CP capteurassocie;
  //private int nb;
  private int ref;
  private Centrale raccordcentre;

  public TB(CP capt, Centrale centre, int reference){
    //capteurAssocie = new CP[100];
    capteurassocie = capt;
    raccordcentre = centre;
    ref = reference;
    //nb = 0;
  }

  public void demandeMesure(){
    raccordcentre.demandeValeur(capteurassocie);
    raccordcentre.transfertTB(this);
  }

  public void demandeLastValeur(){
    raccordcentre.transfertTB(this);
  }

  public void recupValeurPourAffichage(double Val, String date){
    System.out.println("La température relevée le "+date+" est de "+Val+ "°C");
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
