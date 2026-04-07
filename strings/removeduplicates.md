Remove duplicates from a string
1.using Hashset
```java
class Solution {
//Create a set of characters check if char (from char array of string) already exist in set if donesnt add and append 
    public String removeDuplicateLetters(String s) {
        StringBuilder result=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                result.append(c);
        
            }
        }
        return result.toString();

    }
}
```
2.using Naive approach(O(n^2))(time)
(space complexity-O(1))
```java
\\simple iterate through the string check if the particular char occured or not in string
\\if not add
public String removeduplicates(String s){
StringBuilder res=new StringBuilder();
Boolean[] seen=new Boolean[256];
for(int i=0;i<s.length();i++){
char c=s.charAt(i);
if(!seen[c]){
res.append();
seen[c]=true;
}
     }
return res.toString();
  }
}
```
3.Using Freq array
```java
\\create an integer array
\\O(n) time complexity andO(1) space complecity
StringBuilder res=new StringBuilder();
int[] freq=new freq[256];
for(char c:s.toCharArray()){
if(frq[c]==0}{
res.append(c);
freq[c]++;
         }
      }
     return res.toString();
     }
}




