public class TP1{
  private static  double[] Tab;
  private static int N=100;
  private static double Val = 2;


  public static int ChargerTab(double[] tab){
    int size = tab.length;
    return size;
  }

  public static void EditerTab(double [] tab, int N){
    System.out.println("Voici la/les valeur(s) dans le tab : ");
    for (int i=0; i<N; i++){
    System.out.println(tab[i]);
    }
  }

  public static double SommeTab(double[] tab, int N){
    double somme = 0;
    for (int i=0; i<N; i++){
      somme = somme+tab[i];
    }
    System.out.println("La somme des valeurs du tableau est : " +somme);
    return somme;
  }

  public static double MoyenneTab(double[] tab, int N){
    double a = SommeTab(tab, N);
    double Moy = a/tab.length ;
    System.out.println("La moyenne des valeurs du tableau est : " +Moy);
    return Moy;
  }

  public static double MinTab(double[] tab, int N){
    double Min = tab[0];
    for (int i=1; i<N; i++){
      if (tab[i] < Min){
        Min = tab[i];
      }
    }
    System.out.println("La valeur minimum du tableau est : " +Min);
    return Min;
  }

  public static double MaxTab(double[] tab, int N){
    double Max = tab[0];
    for (int i=1; i<N; i++){
      if (tab[i] > Max){
        Max = tab[i];
      }
    }
    System.out.println("La valeur maximum est : " +Max);
    return Max;
  }

  public static int SupValTab(double[] tab, int N, double Val){
    int j = 0;
    for (int i=0; i<N; i++){
      if (tab[i] >= Val){
        j++;
      }
    }
    System.out.println("Le tableau présente "+j+" valeur supérieur à "+Val);
    return j;
  }

  public static void Permut(double[] tab, int A, int B){
    double C;
    C = tab[A];
    tab[A] = tab[B];
    tab[B] = C;
  }

  public static int RangMinTab(double[] tab, int N, int P){
    double Min = tab[P];
    int rangMin = P;
    for (int i=P+1; i<N; i++){
      if (tab[i] < Min){
        Min = tab[i];
        rangMin = i;
      }
    }
    return rangMin;
  }

  public static void TriSel(double[] Tab, int N){
    for (int P=0; P<N; P++){
      int rangMin = RangMinTab(Tab,N,P);
      Permut(Tab,P,rangMin);
    }
  }

  public static void TriBul(double[] Tab, int N) {
    int j=1;
    while (j > 0){
      j=0;
      for (int i=0;i<N-1;i++) {
        if (Tab[i] > Tab[i+1]) {
          Permut(Tab,i,i+1);
          j++;
        }
      }
    }
  }
}
