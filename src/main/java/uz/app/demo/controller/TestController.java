package uz.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
        return "Test successful";
    }

    @RequestMapping("/check")
    public String check() {
        return "server-page.jsp";
    }

    @RequestMapping("/check2")
    public String check2() {
        return "test.html";
    }
}
