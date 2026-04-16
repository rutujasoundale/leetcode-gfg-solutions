
Brute force
Use contacatenation+each checking
```java
class Solution {
    public int repeatedStringMatch(String a, String b) {
        //The idea is simple to concate and check everytime 
         String temp="";
         int count=0;
         while(temp.length()<b.length()){
             temp+=a;
             count++;
             if(temp.contains(b)){
                 return count;
             }
         }
         //Checking again(edge case)
        temp+=a;
        count++;
         if(temp.contains(b)){
            return count;
        }
         return -1;

     }
 }
```
Optimal solution 
O(n*m)--time complexity  as Stringbuilder uses or checks O(m) and we used two time contains which adds 
O(n*m) each time
```java
class Solution {
    public int repeatedStringMatch(String a, String b) {
    StringBuilder sb=new StringBuilder();
    int count=0;
    while(sb.length()<b.length()){
        sb.append(a);
        count++;
        
    }
    if(sb.toString().contains(b)){
        return count;
        
    }
    sb.append(a);
    count++;
    if(sb.toString().contains(b)){
        return count;
    }


    
    return -1;

    

    }
}
```
Further more optimized using KMP
🧠 What is KMP?

KMP (Knuth–Morris–Pratt) is a string matching algorithm used to find:

“Does pattern B exist inside string A?”

🔥 Core idea:

Instead of re-checking characters again and again,
👉 KMP remembers previous matches and skips unnecessary comparisons.

⚡ Why normal approach is slow?

Normal contains() (brute force):

A = "aaaaab"
B = "aaab"
It keeps restarting comparisons → repeated work
Time = O(n * m) ❌
🚀 What KMP does differently

KMP builds something called:

👉 LPS (Longest Prefix = Suffix)

This tells:

“If mismatch happens, where should I restart in pattern?”

Example:

Pattern = "aaab"

LPS array:

Index:   0 1 2 3
Chars:   a a a b
LPS:     0 1 2 0

👉 Meaning:

If mismatch at index 3 (b)
Don’t go back to 0
Jump to index 2

💥 This avoids rechecking characters

⏱️ Complexity
Time: O(n + m) ✅
Space: O(m)
