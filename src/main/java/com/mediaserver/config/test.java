package com.mediaserver.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {


    public static void main(String[] args)  throws IOException {
 // Get the List of Files in the directory
        Stream<Path> list = Files.list(Paths.get("D:\\PracticeSpringMvc\\src\\main\\java\\com\\mediaserver\\resources\\video"));

        //Convert them into Strings and put then into List object
        List<String> videoslist = list.
                map(e->e.toString()).
                collect(Collectors.toList());

    //loop and print the list
        for(String s :videoslist)
            System.out.println(s);


    }
}
