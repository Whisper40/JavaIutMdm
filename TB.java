class TB{
  private CP[] capteurAssocie;
  private int nb;
  private int ref;
  private Centrale raccordcentre;

  public TB(Centrale centre, int reference){
    capteurAssocie = new CP[100];
    raccordcentre = centre;
    ref = reference;

    nb = 0;
  }

  public void demandeMesure(){
    //Communique
  }

  public void recupValeurAffichage(double Val){
    System.out.println("La température est "+Val+ "°C");
  }

  public void ajoutCapteur(CP cp){
    capteurAssocie[nb] = cp;
    nb++;
  }

  public int returnRefTB(){
    return ref;
  }
}
