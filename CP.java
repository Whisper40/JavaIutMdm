import java.util.Scanner;
import java.util.*;
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

  public void mesureValeur(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisir Valeur : ");
    double val = sc.nextLine();
    tempreleve = val;
  }

  public double transfertTemp(){
    raccordcentre.stockageValeur(this, tempreleve, !!!date);
  }

  public double returnVmin(){
    return Vmin;
  }

  public double returnVmax(){
    return Vmax;
  }
