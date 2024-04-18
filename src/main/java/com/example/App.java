package com.example;

import picocli.CommandLine;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception
    {
        WcTool helloWorld= new WcTool();
        CommandLine commandLine = new CommandLine(helloWorld);
        commandLine.setExecutionStrategy(new CommandLine.RunLast());
        int exitCode =  new CommandLine(helloWorld).execute(args);
        System.exit(exitCode);
    }
}
