package com.hackerrank.collections;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OneDimensionalArrayHard {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int tc     = sc.nextInt();
        while( tc > 0 ) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] pos = new int[n];
            boolean[] v = new boolean[n];
            Arrays.fill(v,false);
            
            for( int i = 0; i < n; i++ ) {
                pos[i] = sc.nextInt();
            }
            
            int idx = 0;
            while( idx < n ) {
                if( idx + m >= n ) {
                    System.out.println("YES");
                    break;
                }
                else if ( pos[idx + m] == 0 && !v[idx + m] ) {
                    v[idx + m] = true;
                    idx += m;
                }
                else if ( pos[idx + 1] == 0 && !v[idx + 1] ) {
                    v[idx + 1] = true;
                    idx += 1;
                }
                else if ( idx - 1 < 0 ) {
                    System.out.println("NO");
                    break;
                }
                else if ( pos[idx - 1] == 0 && !v[idx - 1] ) {
                    v[idx - 1] = true;
                    idx -= 1;
                }
                else {
                    System.out.println("NO");
                    break;
                }
            }
            tc--;
        }
    }
}