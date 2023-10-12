package Pattern;

public class NumberPattern {
    public static void numberpyramid(int n){
        for(int i = 1;i<=n ;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i == 1|| i == n|| j == 1 || j == i)
                    System.out.print(i+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void numbersquare(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void decreasingRightangleTriangle(int n){
        for(int i = n;i>=1;i--){
            for(int j = 5;j>=i;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void reverseNumTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = (n*2)-1;j>=i*2;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j = i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void patternNumberRight(int n){

        for(int i = 1 ;i<=n ;i++){
            int count = i;
            for(int j = 1; j <=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
