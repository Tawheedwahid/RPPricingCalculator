package org.pricingcalculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CalculationController {
    @PostMapping("/calculate")
    public Map<String,Object> calculate(@RequestBody CalculationRequest request){
        int result=request.getNumber1()+ request.getNumber2();
        Map<String,Object> response=new HashMap<>();
        response.put("result", result);
        return response;
    }
}
