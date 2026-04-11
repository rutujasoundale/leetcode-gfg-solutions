Anagram means same letters same frequency just different arrangement
Naive (Use sorting)
char array then sort two arrays equate them if equal return true
But space increased due to too much copies of strings

```java
//using freq array of size 26
//traverse on the first string count the freq (increment)
//calculate like character ascii value - ascii value(a) which is 97
//keep the value as index on that index increment by 1
/Same calculation for count but decrement for second string
//then for second string decrease the count it should become zero
//if all counts zero it is anagram
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // int[] charcount=new int[26];
        // for(int i=0;i<s.length();i++){
        //     charcount[s.charAt(i)-'a']++;
        //     charcount[t.charAt(i)-'a']--;
        // }
        // for(int c:charcount){
        //     if(c!=0)
        //         return false;
            
        // }
        
        // return true;
//Using Hashmap
//Similar but use hashmap insted of freq array
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
            
        }
        for(var pair:map.entrySet()){
            if(pair.getValue()!=0){
                return false;
            }
        }
        return true;

    }
}
```
