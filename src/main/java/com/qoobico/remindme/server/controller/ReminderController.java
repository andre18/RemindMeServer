package com.qoobico.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Andrew on 22.09.2017.
 */
@Controller
@RequestMapping("/reminder")
public class ReminderController {

    /*
    т.к. в нашем контроллере может быть несколько методов, контроллер должен знать, к какому методу мы обращаемся
    для этого мы используем данную аннотацию.
    Данная аннотация всего лишь говорит о том, как обратиться к нашему методу, по какому URL и каким методом. В данном случае
    мы говорим, что хотим обращаться к данному методу с помощью remind/get и сделаем мы это методом GET (второй параметр)
    GET - метод, которыый вызываеться когда мы переходим по определенному URL (например spring.io/project - срабатівает метод GET)
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    /*
    ResponseBody - она скажет о том, что ввиде response (ввиде тела ответа) мы хотим вернуть строку
     */
    @ResponseBody
    public String getReminder(ModelMap model) { //модель - предоставляет возможность передать какие-либо данные нашему клиенту в response
        return "My reminder";
    }
}
