package com.github.finder;

public class Main{
    public Main(String[] arguments){
        parseArguments(arguments);
    }

    public static void main(String[] args){
        new Main(args);
    }

    private Args parseArguments(String[] arguments){
        Args args = new Args();
        try {
            CmdLineParser parser = new CmdLineParser(args);
            parser.parseArgument(arguments);
        } catch (CmdLineException e) {
        }
        return args;
    }
}
