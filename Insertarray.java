
package insertarray;
public class Insertarray {
    public static void main(String[] args) {
        int studmarks[]={0,70,30,60,50,70,90,30,0,0};
        int size;
        
        size=studmarks.length;
        studmarks[size+2]=80;
       System.out.println(size);
      System.out.println(studmarks[size+2]);
    }
    
}
