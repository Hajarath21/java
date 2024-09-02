import java.util.*;

class Solution {
    static boolean isAnagram(String s, String t) {
       int count p=0;
        for(int i=0; i<s.length();i++){
            char ch=charAt(i);
        for(int j=i+1;j<s.length();j++){
            char ch2=charAt(j);
            if(ch.equals(ch2)){
                count++;
            }
        }
            
    }
    int count m=0;
        for(int i=0; i<t.length();i++){
            char ch=charAt(i);
        for(int j=i+1;j<t.length();j++){
            char ch2=charAt(j);
            if(ch.equals(ch2)){
                count++;
            }
        }
            
    }
    if(t==m){
        return true;
    }
    return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(isAnagram(s, t));

    }
}