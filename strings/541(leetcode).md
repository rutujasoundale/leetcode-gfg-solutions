```java

class Solution {
    public String reverseStr(String s, int k) {
        //We will reverse 2k for every block 
        //keep rest as it is
        //Convert to char Array
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length()-1;i+=k*2){
            //jump directly by 2k to play safe two pointers
            int left=i;
            int right=Math.min(i+k-1,s.length()-1);//when characters are smaller than k then it cant remain i+k-1
            //here min is used for condition if characters<k
            while(left<right){
                //reverse
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }

        }
        return new String(arr);
    }

}
```
![Approach+Dry Run](images/541.png)
