public class Problem5 {

    public int FindFibon(int n){
        if(n==0 || n ==1){
            return n;
        }
        else{
            return FindFibon(n-1)+FindFibon(n-2); // taking Fib numbers
        }
    }
}
