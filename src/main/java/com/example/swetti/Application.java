package com.example.swetti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication - аннотация, которая добовляет специальные обвесы, которые найдут все необходимые данные для подключение к бд
//созданию классов, контроллеры и вообще все файлы в приложение и запустят их

/*
-FreeMarker-
        FreeMarker — компилирующий обработчик шаблонов, написанный на Java,
        один из инструментов, позволяющих отделить логику и данные от представления в духе концепции Model-view-controller
        https://habr.com/ru/post/420549/
        Apache FreeMarker — это механизм шаблонов: библиотека Java для генерации текстового вывода (HTML-страницы, xml, файлы конфигурации, исходный код и.т.д.
        На вход подается шаблон, например html в котором есть специальные выражения, подготавливаются данные соответствующие этим выражением,
        а Freemarker динамически вставляет эти данные и получается динамически заполненный документ.
*/

@SpringBootApplication
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
