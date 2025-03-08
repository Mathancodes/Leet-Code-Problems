class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) &&  // Check left side
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { // Check right side
                
                // Plant a flower here
                flowerbed[i] = 1;
                count++;

                // If we've already planted enough flowers, return true
                if (count >= n) return true;
            }
        }
        
        return count >= n;
    }
}

