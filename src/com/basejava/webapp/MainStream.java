package com.basejava.webapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainStream {
    public MainStream()  {}

    public static void main(String[] args) {
        //read from file
        Path path = Paths.get("src/com/basejava/webapp/MainStream.java");
        try(Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch(IOException e) {
            e.printStackTrace();
        }
        int sum = Stream.of(10, 2, 3, 4, 5)
                .peek(e -> System.out.println("Taking integer: " + e))// take 10.2.3//4.5
                .filter(n -> n % 2 == 1)//filter 3//5
                .peek(e -> System.out.println("Filtered integer: " + e))// print 3//5
                //multiply after filer 3*3// return to take// multyply after filter 5*5
                .map(n -> n * n).peek(e -> System.out.println("Mapped integer: " + e))
                .reduce(0, Integer::sum); // 9+25=34
        System.out.println("Sum = " + sum);//34

    }
}

