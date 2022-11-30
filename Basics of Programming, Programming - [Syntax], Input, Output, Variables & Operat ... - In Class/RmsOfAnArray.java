import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum = sum + (a[i]*a[i]);
        }
        double ans = (double)sum / n;
        ans = Math.sqrt(ans);
        System.out.printf("%.6f",ans);
    }
}