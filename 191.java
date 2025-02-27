class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // Increment the count if the least significant bit is 1
            count += n & 1;
            // Right shift n by 1 to check the next bit
            n >>>= 1;
        }
        return count;
    }
}
