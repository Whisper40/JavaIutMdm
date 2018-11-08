class Centrale{
  private double[] temperature;
  private capteur[] CP;
  private heure[] time;
  private int nb;

  public Centrale(){
    temperature = new double[100];
    CP = new capteur[100];
    time = new heure[100];
    nb = 0;
  }

  public void mesureValeur(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisir Valeur : ");
    double val = sc.nextLine();
    tempreleve = val;
  }

  public double transfertTemp(){

  }

  public double returnVmin(){
    return Vmin;
  }

  public double returnVmax(){
    return Vmax;
  }
