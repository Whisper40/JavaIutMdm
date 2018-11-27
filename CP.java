import java.util.Scanner;
import java.util.*;

import java.util.Random;

class CP{
  private double tempreleve;
  private int ref;
  private double Vmin;
  private double Vmax;
  private Centrale raccordcentre;

  public CP(Centrale centre, int Ref, double ValMin, double ValMax){
    raccordcentre = centre;
    ref = Ref;
    Vmin = ValMin;
    Vmax = ValMax;
    tempreleve = 0;
  }

  public void timer(int tim){
    Timer timer = new Timer();
    TimerTask task = new Get(this);
    timer.schedule(task, 0, tim);
  }

  public void mesureValeur(){
    Random rand = new Random();
    int val = rand.nextInt(40) - 10; //Valeur comprise entre -10 et 30
    tempreleve = val;
  }

  //public void mesureValeur(){
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Saisir Valeur : ");
    //double val = sc.nextDouble ();
    //tempreleve = val;
  //}

  public void transfertTemp(int ver){
    raccordcentre.stockageValeur(this, tempreleve, ver);
  }

  public double returnVmin(){
    return Vmin;
  }

  public double returnVmax(){
    return Vmax;
  }

  public int returnRef(){
    return ref;
  }
}
