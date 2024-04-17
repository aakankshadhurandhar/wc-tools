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

    public String count(boolean countBytes,boolean countLines) throws IOException {
        var bytes = Files.readAllBytes(Path.of(this.file.toURI()));



        if (!this.file.exists()) {
            throw new FileNotFoundException("File " + this.file.getAbsolutePath() + "does not exist");
        }
        if (countBytes) {
            return this.file.length() +" " +file.getName();
        }
        if (countLines){
            var i=0;
            for (byte byte2 : bytes) {
                if (byte2=='\n'){
                    i++;
                }

            }
            return i + " " +file.getName();
        }
        else {
            return "Processing " + this.file.getName();
        }

    }

}