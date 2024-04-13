package com.example;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "hello", description = "hello world", version = "1.0", mixinStandardHelpOptions = true)
public class WcTool implements Runnable {
    @Option(names = { "-n", "--name" }, description = "name", defaultValue = "World")
    private String name;

    public void run() {
        System.out.println("Hello, " + name + "!");
    }

}
