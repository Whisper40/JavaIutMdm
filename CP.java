import java.util.Scanner;
import java.util.*;
class CP{
  private double tempreleve;
  private int ref;
  private double Vmin;
  private double Vmax;

  public CP(int Ref, double ValMin, double ValMax){
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
    
  }

  public double returnVmin(){
    return Vmin;
  }

  public double returnVmax(){
    return Vmax;
  }
