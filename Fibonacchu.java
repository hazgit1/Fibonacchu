/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacchu;

import java.util.Scanner;

/**
 *
 * @author Asisten
 */
public class Fibonacchu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=1, b=1, c=1, n=0, sum=0;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan angka ajaib : ");
        n = s.nextInt();
        
        int h[] = new int[n];
        
        //System.out.print("\n\n1 1 ");
        for (int i=2; i<n; ++i){
            c = a+b;
            
            h[i] = c;
            
            a=b; b=c;
            
            sum+=c;
        }
        while (n > 2){
            System.out.print(h[n-1]+" ");
            
            n--;
        }
        
        System.out.print("1 1");
        System.out.println("\nTotal = "+(sum+2));
        System.out.println("\nchuu~");
        
    }
    
}
