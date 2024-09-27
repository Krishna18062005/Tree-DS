import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println(nThFibonaaci(7));
      System.out.println(nThFibonaaci(8));
      System.out.println(nThFibonaaci(9));
      
  }
  //iterative Approach
  // public static int nThFibonaaci(int n){
  //   int a=0;
  //     int b=1;
  //     for(int i=1;i<n;i++){
  //       int c=a+b;
  //       a=b;
  //       b=c;
  //     }
  //     return b;
  // }
  // recursive Approach
  public static int nThFibonaaci(int n){
    if(n<=1){
    return n;
    }
      
      return nThFibonaaci(n-1)+nThFibonaaci(n-2);
  }
}
