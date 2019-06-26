package www.com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,0,6,7,8};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]<a[j+1]){
                    int flag = a[j];
                    a[j]=a[j+1];
                    a[j+1]=flag;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
