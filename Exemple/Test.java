class Test{
  public static void main(String[] args){
    Stock stock;
    stock = new Stock();

    String code1 = "adffd58";
    String libel1 = "Bois";
    double prix1 = 52;
    String nomfour1 = "HP";
    int qte1 = 600;
    Produit p1;
    p1 = new Produit(code1,libel1,prix1);

    String code2 = "zfz58";
    String libel2 = "Charbo,";
    double prix2 = 63;
    String nomfour2 = "KL";
    int qte2 = 800;
    Produit p2;
    p2 = new Produit(code2,libel2,prix2);

    String code3 = "qffq62";
    String libel3 = "Plumes";
    double prix3 = 89;
    String nomfour3 = "TH";
    int qte3 = 300;
    Produit p3;
    p3 = new Produit(code3,libel3,prix3);

    stock.enregistrer(p1,nomfour1,qte1);
    stock.enregistrer(p2,nomfour2,qte2);
    stock.enregistrer(p3,nomfour3,qte3);

    System.out.println("Valeur du stock HT : "+stock.calculerValeurHT()+" €");
    System.out.println("Valeur du stock TTC : "+stock.calculerValeurTTC()+" €");
  }
}
