public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[N + 1];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int j = 2; j * j <= N; j++) {
            if (prime[j]) {
                for (int k = j * j; k <= N; k += j) {
                    prime[k] = false;
                }
            }
        }

        int counter = 0;
        
        System.out.println("Prime numbers up to " + N + ":");
        
        for (int m = 2; m <= N; m++) {
            if (prime[m]) {
                System.out.println(m);
                counter++;
            }
        }

        
        double percentage = (counter * 100.0) / (N);
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n", counter, N, percentage);
    }
}
