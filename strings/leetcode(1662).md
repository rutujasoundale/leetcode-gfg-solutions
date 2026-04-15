
```java

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String word3=String.join("", word1);
        // String word4=String.join("", word2);

        // return word3.equals(word4);
         //Use two pinters instead of creating new strings 
        int i=0,j=0;
        int p1=0,p2=0;
        while(i<word1.length && j<word2.length){ 
        if(word1[i].charAt(p1)!=word2[j].charAt(p2)){
            return false;
        }
        p1++;
        p2++;
        if(p1==word1[i].length()){
            i++;
            p1=0;
        }
        if(p2==word2[j].length()){
            j++;
            p2=0;
        }
        }
       
        return i == word1.length && j == word2.length;


    }
}
```
