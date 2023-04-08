public class Problem6 {
    public int FindPowerOf(int a, int b){
        if (b == 1){
            return a;
        }
        else{
            return a*FindPowerOf(a, b-1);
            //multiple a n times, for every call n is minusing by 1, so func called until n is equals to 1
        }
    }
}
