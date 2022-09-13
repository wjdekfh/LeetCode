class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        do {
            sum = 0;
            int r = 0;
            while(n > 0) {
                r = n % 10;
                sum += Math.pow(r, 2);
                n = n / 10;
            }

            n = sum;
        } while(sum > 9);
        
        if(sum == 1 || sum == 7) {
            return true;
        }else {
            return false;
        }
    }
}