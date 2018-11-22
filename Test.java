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
    int time = 10000;
    TB tb;
    tb = new TB(cp, time, centre, ref2);

    int ref3 = 10;
    double valmin1 = 10;
    double valmax1 = 20;
    CP cp2;
    cp2 = new CP(centre, ref3, valmin1, valmax1);

    int ref4 = 2;
    int time1 = 5000;
    TB tb2;
    tb2 = new TB(cp2, time1, centre, ref4);

  }
}
