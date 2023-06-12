// 10. Write a java program to write data to console screen using console class.

import java.io.Console;

class ConsoleWriter {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            String data = "Hello, world!";

            console.writer().println(data);
        } else {
            System.out.println("Console is not available.");
        }
    }
}
