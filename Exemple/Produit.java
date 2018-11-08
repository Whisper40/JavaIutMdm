class Produit{
  private String codeArt;
  private String libelle;
  private double prixHT;

  public Produit(String code, String libel, double prix){
    codeArt = code;
    libelle = libel;
    prixHT = prix;
  }

  public String afficherCodeArt(){
    return codeArt;
  }

  public String afficherLibel(){
    return libelle;
  }

  public double prixHT(){
    return prixHT;
  }

  public double prixTTC(){
    double prixTTC = prixHT*1.20;
    return prixTTC;
  }
}
