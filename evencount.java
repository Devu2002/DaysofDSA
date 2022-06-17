class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i :nums)
        {
            int len = String.valueOf(i).length();
            System.out.println(len);
            if(len % 2 ==0)
            {
                    count++;   
            }
        }
        return count;
    }
}