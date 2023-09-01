class Solution {
    boolean isprime (int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= x/2;i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int setbit = 0;
        int prime = 0;
        while (left <= right) {
            int temp = left;
            while(temp > 0) {
                temp &= temp - 1;
                setbit++;
            }
            if (isprime(setbit)) {
                prime++;
            }
            setbit = 0;
            left++;
        }
        return prime;
    }
}