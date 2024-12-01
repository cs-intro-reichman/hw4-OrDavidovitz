public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[N + 1];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int j = 4; j < prime.length; j++) {
            if (j % 2 == 0 || j % 3 == 0) {
                prime[j] = false;
            }
        }

        for (int l = 6; l < prime.length; l++) {
            if (l % 5 == 0)
                prime[l] = false;
        }

        int p = 7;
        int pointer = 7;
        while (p < Math.sqrt(N)) {
            while (pointer < prime.length) {
                if (pointer % p == 0 && p != pointer) {
                    prime[pointer] = false;
                }
                pointer++;
            }
            p++;
        }

        double counter = 0;
        for (int m = 0; m < prime.length; m++) {
            if (prime[m]) {
                System.out.println(m);
                counter++;
            }
        }

        double percentage = (counter * 100) / (N - 1);  
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n", (int) counter, N, percentage);
    }
}
