package ar.com.taller.spring.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {

    @RequestMapping(value = "/hola/{nombre}", method = RequestMethod.GET)
    public String holamundo(@PathVariable String nombre){
        return "hola {nomnbre}";
    }
}
