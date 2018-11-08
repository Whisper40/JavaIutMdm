class TB{
  private capteur[] capteurAssocie;
  private int nb;
  private int ref;

  public TB(int reference){
    capteurAssocie = new capteur[100];
    ref = reference;
    nb = 0;
  }

  public void demandeMesure(){
    //Communique
  }


  public void recupValeurAffichage(double Val){
    System.out.println("La température est "+Val+ "°C");
  }

  public void ajoutCapteur(capteur CP){
    capteurAssocie[nb] = CP;
    nb++;
  }

  public int returnRefTB(){
    return ref;
  }
}
