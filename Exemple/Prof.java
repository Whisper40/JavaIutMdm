public class Prof{
  private String nom;
  private String prenom;
  private String departemenIUT;
  private Module[] mod;
  private int nb;

  public Prof(String Nom, String Prenom, String DepartemenIUT){
    nom = Nom;
    prenom = Prenom;
    departemenIUT = DepartemenIUT;
    mod = new Module[100];
    nb = 0;
  }

  public String getNom(){
    return nom;
  }

  public String getPrenom(){
    return prenom;
  }

  public String getDpt(){
    return departemenIUT;
  }

  public void addModule(Module module){
    mod[nb] = module;
    nb++;
  }

  public double getTotalHR(){
    double Add = 0;
    for(int i=0; i<nb, i++){
      Module module = mod[i];
      Add = Add + module.getHR();
    }
    return Add;
  }

  public double getTotalHETD(){
    double Add = 0;
    for(int i=0; i<nb, i++){
      Module module = mod[i];
      Add = Add + module.getHETD();
    }
    return Add;
  }
}
