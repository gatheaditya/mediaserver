package com.mediaserver.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class mainController
{

    @GetMapping("/hello")
    public String  hello()
    {
        return "hi";
    }

    @RequestMapping("getvideolist")
    public ModelAndView listFiles(ModelMap map) throws IOException
    {
        Stream<Path> list = Files.list(Paths.get("F://resources//video"));
        //Convert them into Strings and put then into List object
        List<String> videoslist = list.
                map(e->e.toString().replace("F:\\","")).
                collect(Collectors.toList());
        // return a view name with atributes
        return new ModelAndView("displayvideos","list",videoslist);
    }

}