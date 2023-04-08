public class Problem4 {
    public int FindFact(int n) // i bored to set and get values so i just build some methods with funcs
    {
        int res;
        if(n==1){
            return 1;
        }
        res = FindFact(n-1)* n; //multipluing to number that less to one,
                                    // so recusrion do that until that number equals to 1
        return res;
    }
}
