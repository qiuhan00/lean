package com.cfang.algorithm.common;

/**
 * @author cfang 2020/9/28 14:36
 * @description
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(null == s || "".equals(s)) return 0;
        int max = 1;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            String str = chars[i] + "";
            for(int j = i + 1; j < chars.length; j++){
                if(chars[i] != chars[j] && !str.contains(chars[j]+"")){
                    str += chars[j];
                }else {
                    break;
                }
            }
            if(str.length() > max){
                max = str.length();
            }
        }
        return max;
    }

}
