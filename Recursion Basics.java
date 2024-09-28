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
import java.util.*;

public class Main {
    public static void main(String[] args) {
      String a=new Scanner(System.in).next();
      System.out.print(VowelsCount(a));
      }
    // public static int max(int []a){
      
    //   if(a.length==1) return 0;
    //   int l=a[a.length-1];
    //   a=copy(a);
    //   return Math.max(max(a),l);
    // }
    // public static int[] copy(int[] a){
    //   int[] b=new int[a.length-1];
    //   for(int i=0;i<a.length-1;i++){
    //     b[i] = a[i];
    //   }
    //   a=b;
    //   return a;
    // }
    public static int VowelsCount(String a){
      
      if(a.length()==1) return 0;
      int ke=contains(a.charAt(a.length()-1))?1:0;
      return VowelsCount(a.substring(0,a.length()-1))+ke;
      
    }
    public static boolean contains(char ch){
      if((int)ch<96) ch=(char)((int)ch+32);
      return (ch=='a'||ch=='e'||ch=='i'||ch=='e'||ch=='u'||ch=='o');
    }
    
}
