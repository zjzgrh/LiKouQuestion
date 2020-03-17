package com.company.mianshi;

public class mianshi17_11 {
    public static void main(String[] args) {
    }

    public static int findClosest(String[] words, String word1, String word2) {
        int ans = 100000;
        int m = -1,n = -1;
        for(int i = 0; i < words.length; i++){

            if(m != -1){
                if(words[i].equals(word2)){
                    n = i;
                    ans = Math.min(ans,Math.abs(m - n));
                    m = -1;
                }
                if(words[i].equals(word1)){
                    m = i;
                }
            }
            if(n != -1){
                if(words[i].equals(word1)){
                    m = i;
                    ans = Math.min(ans,Math.abs(m - n));
                    n = -1;
                }
                if(words[i].equals(word2)){
                    n = i;
                }
            }
            if(m == -1 && n == -1){
                if(word1.equals(words[i]))
                    m = i;
                if(word2.equals(words[i]))
                    n = i;
            }
        }
        return ans;
    }
}
