package com.sdanila.patterns.decorator.streams;

import java.io.*;
import java.nio.file.Paths;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Personal\\DesignPatterns\\src\\main\\java\\com\\sdanila\\patterns\\decorator\\streams\\test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
