package com.allstate.Controllers;

import com.allstate.Models.Math;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MathController {

    @RequestMapping(value="/math/square/{x}",method = RequestMethod.GET)
    public Map<String,Integer> computeSquare(@PathVariable int x){
        int result = Math.computeSquare(x);
        Map<String, Integer> map = new HashMap<>();
        map.put("square",result);
        return map;
    }

    @RequestMapping(value="/math/factorial/{x}",method = RequestMethod.GET)
    public Map<String,Integer> computeFactorial(@PathVariable int x){
        int result = Math.computeFactorial(x);
        Map<String, Integer> map = new HashMap<>();
        map.put("factorial",result);
        return map;
    }

    @RequestMapping(value="/math/fibonacci/{x}",method = RequestMethod.GET)
    public Map<String,Integer> computeFibonacci(@PathVariable int x){
        int result = Math.computeFibonacci(x);
        Map<String, Integer> map = new HashMap<>();
        map.put("num",x);
        map.put("fibonacci",result);
        return map;
    }
}
