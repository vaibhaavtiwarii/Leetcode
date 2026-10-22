class Solution {
    public int countOdds(int low, int high) {
        int f = 0;
        if(low%2==0)
        low++;
        for(long i = low ; i<=high;i+=2)
        {
            if(i%2!=0)
            f++;
        }
        return f;
    }
}