Brute force approach
O(n^2) time complexity
We can see that In Bruteforce we are repeating elemts and work again and again insted of this we can use a sliding window approach
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);

                if (set.contains(c)) {
                    break; // invalid window
                }

                set.add(c);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
}
```

Optimal
* Use **HashMap<Character, Integer>**
* Store **last index** of each character
* Move `left` pointer when duplicate appears

Code
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int right=0;right<=s.length()-1;right++){
        char c=s.charAt(right);
        //if duplicates exist 
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
        }
        //store update index
        map.put(c,right);
        
        maxlength=Math.max(maxlength,right-left+1);
    }
        return maxlength;
    }
}
```
### Steps:

| right | char | left | map           | maxLength |
| ----- | ---- | ---- | ------------- | --------- |
| 0     | a    | 0    | {a:0}         | 1         |
| 1     | b    | 0    | {a:0,b:1}     | 2         |
| 2     | c    | 0    | {a:0,b:1,c:2} | 3         |
| 3     | a    | 1    | update a → 3  | 3         |




```
Expand window → check duplicate → shrink window → update answer
```


