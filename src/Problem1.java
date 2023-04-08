import static java.lang.Math.min;
public class Problem1 {
    private int n;
    private int[] N;
    public Problem1(int n, int[] arr) {
        this.n = n; //takes some values from main
    }
    public void Problem_1(int n, int[] arr){
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1]; //default alghortihm to find the min values of array
                    arr[j+1] = temp;
                }
        System.out.println("Problem 1: "+ arr[0]);
    }

}
