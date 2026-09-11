package com.test;

import java.io.IOException;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JLINE");

        try{
            Terminal terminal = TerminalBuilder.builder().system(true).build();

            LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();

            while(true){
                String line = reader.readLine("prompt > ");

                if("exit".equals(line)){
                    break;
                }

                terminal.writer().println("You entered: "+ line);

                terminal.flush();
            }
            terminal.writer().println("Goodbye!");
            terminal.close();

        }catch(IOException e){
            System.err.println("Error creando terminal: "+e.getMessage());
        }
    }
}