package com.example.fileManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToHtmlController {

    @RequestMapping(value = "/picUpload")
    public String picUpload(){
        return "picUpload";
    }
}
