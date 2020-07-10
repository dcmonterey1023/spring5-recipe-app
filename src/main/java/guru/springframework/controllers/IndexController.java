package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author d.monterey on 10/07/2020
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){


        return "index";
    }

}
