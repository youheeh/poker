package com.poker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

@GetMapping("/throwDice")
    public void ThrowDice() {
        System.out.print("test");
    }
}
