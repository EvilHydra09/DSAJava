package Array.Sorting;

public class Sort {
    public static void bubbleSort(int arr[],boolean ascending){
        if(ascending){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }}
        else {
            for(int i = 0;i<arr.length-1;i++){
                for(int j = 0;j<arr.length-i-1;j++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        }
    }

    public static void selectionSort(int arr[],boolean ascending){
        if(ascending) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minindex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minindex] > arr[j]) {
                        minindex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }else {
            for (int i = 0; i < arr.length - 1; i++) {
                int maxindex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[maxindex] < arr[j]) {
                        maxindex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[maxindex];
                arr[maxindex] = temp;
            }
        }
    }


    public static void insertionSort(int arr[],boolean ascending){
        if(ascending){
            for(int i = 1;i<arr.length;i++){
                int current = arr[i];
                int j = i-1;
                while (j>= 0 && current<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]=current;
            }
        }
        else {
            for(int i = 1;i<arr.length;i++){
                int current = arr[i];
                int j = i-1;
                while (j>= 0 && current>arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]=current;
            }
        }

    }

}
