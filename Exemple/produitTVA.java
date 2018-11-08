class ProduitTVA extends Produit{
  private double tauxTVA;

  public ProduitTVA(String code, String libel, double prix, double tauxTva){
    super(code,libel,prix);
    tauxTVA = tauxTva;
  }

  public double prixTTC(){
    double prixTTC = prixHT*tauxTVA;
    return prixTTC;
}
