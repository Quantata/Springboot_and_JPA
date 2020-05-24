package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // model : spring UI의 model. 여기에 data를 실어서 view로 넘길 수 있음
        // "data"라는 키의 값으로 "hello!!!"를 넣을 것임
        model.addAttribute("data", "hello!!!");
        // "hello" - 화면 이름
        // resources/templates/hello.html
        return "hello";
    }


}

