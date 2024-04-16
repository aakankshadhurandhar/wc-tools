package com.example;

import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.io.File;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
@Command(name = "hello", description = "hello world", version = "1.0", mixinStandardHelpOptions = true)
public class WcTool implements Callable<String> {

    @Parameters(index = "0", description = "The file whose bytes we want to calculate.")
    private File file;
    @Option(names = { "--c" }, description = "count bytes")
    private boolean countBytes;

    @Override
    public String call() throws Exception {
        if (!this.file.exists()) {
        throw new FileNotFoundException("File " + this.file.getAbsolutePath() + "does not exist");
        }
        if (countBytes) {
            return this.file.length() +" " +file.getName();
        } else {
            return "Processing " + this.file.getName();
        }
    }

}
