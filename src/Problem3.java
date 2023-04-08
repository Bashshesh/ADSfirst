public class Problem3 {
    private int number;

    public Problem3(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    } // get and set it is so boooring

    public void setNumber(int number) {
        this.number = number;
    }

    public String isPrime(int n){
        if(number < 2) return "Not Prime"; //returning answer of this problem with string
        if(number == 2) return "Is Prime"; // cheking default things
        if(number % 2 == 0) return "Not Prime";
        for(int i=3; (i*i)<=number; i+=2){ //checking isprime of number
            if(number % i == 0 ) return "Not Prime";
        }
        return "Is Prime";
    }
}
