class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Shift the result to the left to make space for the next bit
            result <<= 1;
            
            // Get the least significant bit of n and add it to result
            result |= (n & 1);
            
            // Shift n to the right to get the next bit
            n >>= 1;
        }
        return result;
    }
}
