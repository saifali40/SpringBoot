package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by saif on 7/15/17.
 */

@Controller
class GroovyTestController {

    @RequestMapping("/")
    String Demo(){
        "index"
    }
}
