public class Main {
    public static void main(String[] args) {
        String result = "The prime numbers under 100 is 2";
        for (int n = 3; n <100; n += 2 ) {
            if (isPrimeNumber(n)) {
                result += n + " ";
            }
        }
        System.out.println(result);
    }
    public static boolean isPrimeNumber(int x) {
        for (int i = 3; i < Math.sqrt(x); i +=2) {
            if ( x % i == 0 ) return false;
        }
        return true;
    }
}

