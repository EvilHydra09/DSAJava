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

    public static void hollowPyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i == 1 || i == n|| j==1 || j==i){
                System.out.print("* ");
                }
                else {
                    System.out.print("  ");  // add double space
                }
            }
            System.out.println();
        }
    }
    public static void hollowDiamond(int n){
        for(int i = 1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i == 1 || j==1 || j==i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");  // add double space
                }
            }
            System.out.println();

        }
        for(int i = n-1;i>=1;i--){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++ ){
                if(i == 1 || j==1 || j==i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");  // add double space
                }
            }
            System.out.println();
        }
    }

    public static void heart(int n){
        for(int i = 2;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j = n*2;j>=i*2;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1;i<=n*2;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = n*2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowheart(int n){
        for(int i = 2;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i == 1 || j==1 || j==i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");  // add double space
                }
            }
            for(int j = n*2;j>=i*2;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i == 1 || j==1 || j==i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");  // add double space
                }
            }
            System.out.println();
        }
        for(int i = 1;i<=n*2;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = n*2;j>=i;j--){
                if( j == n*2||j==1 || j==i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");  // add double space
                }
            }
            System.out.println();
        }
    }

    public static void hollowParrellogram(int row , int col){
        for(int i = 1;i<=row;i++){
            for(int j = col;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=col;j++){
                if(i == 1|| i == row|| j == 1|| j== col) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
