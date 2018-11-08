public class Test{
  public static void main(String[] args) {
    double [] tab = {4,3,2,1};
    int N = TP1.ChargerTab(tab);
    double Val = 2;
    int A = 2;
    int B = 8;
    int P = 3;
    TP1.EditerTab(tab,N);
    TP1.MoyenneTab(tab, N);
    TP1.MinTab(tab, N);
    TP1.MaxTab(tab, N);
    TP1.SupValTab(tab, N, Val);
    //TP1.TriSel(tab, N);
    //TP1.EditerTab(tab, N);
    TP1.TriBul(tab, N);
    TP1.EditerTab(tab, N);
  }
}
