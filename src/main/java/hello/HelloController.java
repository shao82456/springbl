package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/greet")
    public String index(){
        return "Greetings from spring boot";
    }

    @RequestMapping("/submitname")
    public List<String> submitname(@RequestParam String firstname,@RequestParam String lastname){
        return Arrays.asList(new String[]{firstname, lastname});
    }
}
