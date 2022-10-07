package ru.itis.imt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/imt")
public class IMTController {

    @GetMapping()
    public String imt() {
        return "imtinput";
    }

    @GetMapping("/result")
    public String result(Model model, @RequestParam("weight") Double weight, @RequestParam("height") Double height) {
        System.out.println(weight + "  " + height);
        model.addAttribute("imt", weight / (height * height));
        return "imtresult";
    }

}
