package com.example;

import picocli.CommandLine;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        WcTool helloWorld= new WcTool();
        int exitCode =  new CommandLine(helloWorld).execute(args);
        System.exit(exitCode);
    }
}
