package com.example.swetti;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

//Контроллер - Модуль программный, по пути слушает запросы от пользователя и возвращаеть файл шаблона
@Controller
public class GreetingController {

    @GetMapping("/greeting")//путь
    public String greeting
            (@RequestParam(name="name", required=false, defaultValue="World") String name,
             Map<String, Object> model)
    {
        model.put("name", name);
        return "greeting";//файл шаблона
    }

    @GetMapping
    public String main(Map<String, Object> model){

        model.put("some", "Hi, Let's code!");
        return "main";
    }

}
