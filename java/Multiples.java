import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiples {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        int sum;
        
        for(int i = 1; i <= 10; i++){
            sum = n * i;
            System.out.println(n + " x " + i + " = " + sum);
        }
    }
}
