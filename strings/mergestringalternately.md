```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i = 0, j = 0;
        while(i<word1.length() && j<word2.length()){
//each string gets alternately added
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));

        }
//checking for remaining if any of string ends then print the remaining
        while(i<word1.length()){
            sb.append(word1.charAt(i++));

        }
        while(j<word2.length()){
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}

```
Time Complexity: O(n + m)
Space Complexity: O(n + m)
append() → best for building string step by step
concat() → avoid in loops (slow, creates new strings)
join() → for arrays/collections, not this case
