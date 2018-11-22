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
    int time = 30000;
    TB tb;
    tb = new TB(cp, time, centre, ref2);

    tb.demandeLastValeur();
  }
}
