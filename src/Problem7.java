public class Problem7 {
    public int ReserseArray(int[] a, int b) {
        if (b == 0) {
            return a[b];
        } else {
            System.out.println(a[b-1] + " ");
            // b-1 is the last element of the array so we can just sout it
            return ReserseArray(a, b - 1);
            // and call the func but with b-1 (second element of the reversed array)
        }
    }
}
