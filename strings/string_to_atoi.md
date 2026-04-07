```java
class Solution {
    public int myAtoi(String s) {
        //First start with iteration index i
        //num will be the result and sign initialise with positive
        int i=0,n=s.length();
        int num=0,sign=1;
        //skip leading spaces untill
        while(i<n && s.charAt(i)== ' ' ){
            i++;
        }
        //If we find sign (if negative keep it) if not given put positive
        if (i < s.length() && (s.charAt(i) == '-' 
                                 || s.charAt(i) == '+')) {
            if (s.charAt(i++) == '-') {
                sign = -1;
            }
        }
        //For digits between 0 & 9 
        //check if digit is more than 2^31-1 and less than -2^31
        //"We use 214748364 because we check overflow before multiplying by 10.
//It represents MAX_INT / 10, ensuring the next digit won’t exceed 2147483647
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
                      if (num > Integer.MAX_VALUE / 10 || 
                   (num == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
          
            // Append current digit to the result
            num = 10 * num + (s.charAt(i++) - '0');
        }
    
        return num * sign;

        

    }
}
```
