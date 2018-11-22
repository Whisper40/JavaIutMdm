class Test{
  public static void main(String[] args){
    Centrale centre;
    centre = new Centrale();

    int ref = 1;
    double valmin = 10;
    double valmax = 20;
    CP cp;
    cp = new CP(centre, ref, valmin, valmax);

    int ref2 = 2;
    TB tb;
    tb = new TB(cp, centre, ref2);

    centre.addTB(tb);

    centre.timer();
    //centre.demandeValeur(cp);
    //tb.demandeMesure();
    tb.demandeLastValeur();
  }
}
