package Leetcode;
/**
 * @author xiangfeidong
 *
 * 58.Length of Last Word
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
