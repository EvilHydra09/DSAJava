package Basic;

public class Basic{
    public static void fibonaciSeries(int n){
        int num1 = 0,num2 = 1;
        int result = 0;
        System.out.print(num1+" "+num2+" ");
        for(int i = 1;i<=n-2;i++){
           result = num1 + num2;
            System.out.print(result+" ");
            num1 = num2;
            num2 = result;

        }
    }
    public static void swapNumberwithTemp(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("the value of A is "+ a);
        System.out.println("the value of B is "+ b);
    }
    public static void Armstrong(int n){
        int result = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += Math.pow(rem,4); // sum = sum + Math.pow(rem,3);
            n /= 10;  // n = n / 10
        }
        if(sum == result){
            System.out.println("It is Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
