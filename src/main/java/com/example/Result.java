package com.example;

import java.io.IOException;

public class Result {
    private final byte[] bytes;
    private final String fileName;

    public Result(byte[] bytes,String fileName) {
        this.bytes = bytes;
        this.fileName = fileName;
    }

    public String count(boolean countBytes, boolean countLines, boolean countWords, boolean countCharacters)
            throws IOException {
        StringBuilder result = new StringBuilder();
        if(!countBytes && !countLines && !countWords && !countCharacters) {
            countBytes = true;
            countLines = true;
            countWords = true;
            countCharacters = true;
        }
        if (countBytes) {
            result.append(bytes.length+" ");
        }
        if (countLines) {
            var i = 0;
            for (byte byte2 : bytes) {
                if (byte2 == '\n') {
                    i++;
                }
            }
            result.append(i+" ");
        }
        if (countWords) {
            var i = 0;
            for (byte byte2 : bytes) {
                if (byte2 == ' ') {
                    i++;
                }
            }
            result.append(i+" ");
        }
        if (countCharacters) {

            String s = new String(bytes);
            var j = 0;
            for (char ch : s.toCharArray()) {
                if (Character.isLetter(ch)) {
                    j++;
                }
            }
            result.append(j+" ");
        }
        result.append(" "+fileName);
        return result.toString();
    }

}
