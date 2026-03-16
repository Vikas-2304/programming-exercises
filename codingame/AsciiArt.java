import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static int letterPosition (char c) {
        return Character.isLetter(c) ? Character.toUpperCase(c) - 65 : 26;
    }

    public static int asciiLetterStartPos (char c, int L) {
        return letterPosition(c) * L;
    }

    public static int asciiLetterEndPos (char c, int L) {
        return asciiLetterStartPos(c, L) + L;
    }

    public static void printOutput (String[] output) {
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        String[] ascii = new String[H];
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            ascii[i] = ROW;
        }

        String[] asciiOutput = new String[H];

        for (int i = 0; i < H; i++) {
            asciiOutput[i] = "";
        }

        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            int begin = asciiLetterStartPos(c, L);
            int end = asciiLetterEndPos(c, L);

            for (int j = 0; j < H; j++) {
                asciiOutput[j] += ascii[j].substring(begin,end);
            }
        }

        printOutput(asciiOutput);
    }
}
