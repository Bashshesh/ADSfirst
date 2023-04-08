public class Problem2 {
    private int m;
    private int[] N;
    public Problem2(int m,int[] n) {
        this.m = m;
        N = n;
    }

    public void setN(int[] n) {
        N = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[] getN() {
        return N;
    } // get and sets some values into main

    public int getM() {
        return m;
    }

    public void FindAVG(){
        double a = 0;
        for (int i = 0; i<m; i++){
            a+=N[i];
        }
        double b = a/m;
        System.out.println("Problem 2: "+b);
    }
}
