package com.example.fileManagement.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@Controller
public class DeleteController {

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String dele(){
        return "/delete";
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String del(String fileName){
        File file = new File("E:/JavaLab/fileManagement/src/main/resources/static/"+fileName);
        if (file.exists())
            file.delete();
        else
            System.out.println("no exist");
        return "success";
    }
}
