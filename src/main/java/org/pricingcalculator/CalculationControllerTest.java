package org.pricingcalculator;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalculationControllerTest {
    @GetMapping("/test")
    public String test(){
        return "Api is fine";
    }
}
