public class Module{
  private String nom;
  private double hCours;
  private double hTD;
  private double hTP;

  public Module(String Nom, double HCours, double HTD, double HTP){
    nom = Nom;
    hCours = HCours;
    hTD= HTD;
    hTP = HTP;
  }

  public String getIntitule(){
    return nom;
  }

  public double getCours(){
    return hCours;
  }

  public double getTD(){
    return hTD;
  }

  public double getTP(){
    return hTP;
  }

  public double getHR(){
    double Somme;
    Somme = hCours + hTD + hTP;
    return Somme;
  }

  public double getHETD(){
    double Somme;
    Somme = hCours*1.5 + hTD + hTP*(2/3);
    return Somme;
  }
}
