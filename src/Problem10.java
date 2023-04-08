public class Problem10 {
    public int FindGCD(int a, int b){
        if(a == 0){ //if a equals to 0 we just return 0
            return b;
        }
        else{
            return FindGCD(b%a, a);
            //Euclidean Algorithm
        }
    }
}
