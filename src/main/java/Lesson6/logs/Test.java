package Lesson6.logs;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Logger cl = new ConsoleLogger("Test");
        Logger fl = new FileLogger("Test");
        cl.log("OLOLO");
        fl.log("OLOLO!!!");
    }
}
