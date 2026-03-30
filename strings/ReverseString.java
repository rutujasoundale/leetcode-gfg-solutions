//Using Stack (Not optimum as it creates O(n) space and O(n) time complexity As every element is n times traversed
class Solution {
    public void reverseString(char[] s) {
        //Idea based on first in last out 
        //This is exactly what we want 

        Stack<Character> st=new Stack<>();
         //Push everything to stack
        for(int i=0;i<s.length;i++){
            st.push(s[i]);
            
        }
        //pop using stack such that first element last out and last element first out
        for(int i=0;i<s.length;i++){
            s[i]=st.pop();
        }
        
    }
}
//Using Backward traversal 
// 
class Solution {
    public void reverseString(char[] s) {
     StringBuilder res=new StringBuilder();
      for(int i=0;i<s.length;i++){
        res.append(s[i]);
    }
    res.reverse();
    for(int i=0;i<s.length;i++){
        s[i]=res.charAt(i);
    }
}
}
//Using Optimal O(1 ) space complexity
//Two pointers
//Use two pointers left and right treaverse both (left starts with 0 and right (n-1)
//swap left and right 
//then left ++ and right-- (traverse untill they reach mid)
class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
//USing recursion O(n) space and time coplexity
class Solution {
  static void recursive(char[] s, int l, int r){
    while(l<r){
      char temp=s[l];
      s[l]=s[r];
      s[r]=temp;
      recursive(s,l+1,r-1);
  }
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
         recursive(s,left,right);
    }
}
//Also be done using Inbuilt function reverse()
