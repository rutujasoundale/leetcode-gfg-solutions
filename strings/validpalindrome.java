class validpalindrome {
    public boolean isPalindrome(String s) {
        //
    //     int left=0;
    //     int right=s.length()-1;
    //     if(s.length()==0 ){
    //         return true;
    //     }
    //     while(left<right){
    //         if(s.charAt(left)!=s.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
            
    //     }
    //    return true;
    //Why above failed beacuse we need to check for alphanumeric (which means alphabet+numeric ) if yes use it otherwise skip
    //move left forwrd if its not alphanumeric and right backward if not alphanumeric 

        int left=0;
    int right=s.length()-1;

    while(left<right){
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }  
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        //compare for case sensative if lowercase character equal if not return false
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
        //Again if it has checked for alphanumeric character afte result move forward left and backward right
        left++;
        right--;
          }
          //At the end if it is also satisfying everything and not returning false ruturn true 
          return true;

    }
}
//Another Brute force method is to create a array 
//traverse using i and j 
//int[] freq=new int[26];
//generate all substrings
//for each substring count character that appears only once

