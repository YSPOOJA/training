import java.util.Scanner;
    public class numbers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String res="";
            if(n%2==1){
              res = "Weird";
            }
            else {
                if (n >= 2 && n <= 5) {
                    res = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    res = "Weird";
                } else {
                    res = "Not Weird";
                }
            }
            System.out.println(res);
        }
    }