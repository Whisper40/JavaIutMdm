class Stock{
  private Produit[] produit;
  private String[] nomFour;
  private int[] quantite;
  private int nb;

  public Stock(){
    produit = new Produit[100];
    nomFour = new String[100];
    quantite = new int[100];
    nb = 0;
  }

  public void enregistrer(Produit p, String nomfour, int qte){
    produit[nb] = p;
    nomFour[nb] = nomfour;
    quantite[nb] = qte;
    nb++;
  }

  public void afficher(){
    for(int i=0; i<nb;i++){
      Produit prod = produit[i];
      String libelle = prod.afficherLibel();
      String NomFour = nomFour[i];
      int Qte = quantite[i];
      System.out.println("Le produit "+libelle+" fournie par la société "+NomFour+" est présent dans les stock "+Qte+" fois");
    }
  }
  public double calculerValeurHT(){
    double Somme = 0;
    for(int i=0; i<nb;i++){
      Produit prod = produit[i];
      double prixHT = prod.prixHT();
      int Qte = quantite[i];
      Somme = Somme+prixHT*Qte;
    }
    return Somme;
  }

  /*public double calculerValeurHT(String nomFour1){
    double Somme = 0;
    for(int i=0; i<nb;i++){
      String nomFour2 = nomFour[i];
      boolean bool = nomFour2.equals(nomFour1);
      if (bool = true){
        Produit prod = produit[i];
        double prixHT = prod.prixHT();
        int Qte = quantite[i];
        Somme = prixHT*Qte;
      }
    }
	return Somme;
  }*/

  public double calculerValeurTTC() {
    double Somme = 0;
    for(int i=0; i<nb;i++){
      Produit prod = produit[i];
      double prixTTC = prod.prixTTC();
      int Qte = quantite[i];
      Somme = Somme+prixTTC*Qte;
    }
    return Somme;
  }
}
