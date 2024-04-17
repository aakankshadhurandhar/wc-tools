package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Result {
    private final File file;

    Result(File file) {
        this.file = file;
    }

    public String count(boolean countBytes, boolean countLines, boolean countWords, boolean countCharacters)
            throws IOException {
        var bytes = Files.readAllBytes(Path.of(this.file.toURI()));
        StringBuilder result = new StringBuilder();
        if (!this.file.exists()) {
            throw new FileNotFoundException("File " + this.file.getAbsolutePath() + "does not exist");
        }
        if(!countBytes && !countLines && !countWords && !countCharacters) {
            countBytes = true;
            countLines = true;
            countWords = true;
            countCharacters = true;
        }
        if (countBytes) {
            result.append(this.file.length()+" ");
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
        result.append(" "+this.file.getName());
        return result.toString();
    }

}
