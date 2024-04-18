package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.io.File;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "hello", description = "hello world", version = "1.0", mixinStandardHelpOptions = true)
public class WcTool implements Callable<String> {

    @Parameters(index = "0", description = "The file whose bytes we want to calculate.", arity = "0..1")
    private File file= null;
    @Option(names = { "--c" }, description = "count bytes")
    private boolean countBytes;
    @Option(names = { "--l" }, description = "count lines")
    private boolean countLines;
    @Option(names = { "--w" }, description = "count words")
    private boolean countWords;
    @Option(names = { "--m" }, description = "count characters")
    private boolean countCharacters;

    @Override
    public String call() throws Exception {
        String result = "";
        try {
            byte[] bytes;
            String fileName;
            if (file != null) {
                bytes = Files.readAllBytes(Path.of(file.toURI()));
                fileName = file.getName();
            } else {
                bytes = System.in.readAllBytes();
                fileName="";
            }
             result = new Result(bytes,fileName).count(countBytes, countLines, countWords, countCharacters);
             System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
