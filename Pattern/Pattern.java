package Pattern;

public class Pattern {

    public static void rightAngleTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void leftRightAngleTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void square(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rectangle(int row,int col){
        for(int i= 1;i<=row;i++){
            for(int j = 1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowSquare(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i == 1 || i==n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowRectangle(int row,int col){
        for (int i = 1;i<=row;i++){
            for(int j = 1;j<=col;j++){
                if(i==row || i == 1||j==1||j==col){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
