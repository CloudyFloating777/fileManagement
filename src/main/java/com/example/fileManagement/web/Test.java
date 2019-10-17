package com.example.fileManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Test {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String tes(){
        return "test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(String fileName, ModelMap modelMap){
        modelMap.put("filename", fileName);
        return "f";
    }
}
