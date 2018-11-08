public class Test{
  public static void main(String[] args){
    //Creation Module 1
    String nom1 = "java";
    double hCours1 = 6;
    double hTD1 = 10;
    double hTP1 = 5;

    Module mod1;
    mod1 = new Module(nom1, hCours1, hTD1, hTP1);

    //Creation Module 2
    String nom2 = "sql";
    double hCours2 = 8;
    double hTD2 = 9;
    double hTP2 = 12;

    Module mod2;
    mod2 = new Module(nom2, hCours2, hTD2, hTP2);

    //Creation Enseignant 1
    String nom3 = "Munier";
    String prenom3 = "Manuel";
    String departemenIUT3 = "RetT";

    Prof prof1;
    prof1 = new Prof(nom3, prenom3, departemenIUT3);

    //Ajout module
    prof1.addModule(mod1)
    prof1.addModule(mod2)

    //Test
    System.out.println(prof1.getTotalHR())
    System.out.println(prof1.getTotalHETD())
  }
}
