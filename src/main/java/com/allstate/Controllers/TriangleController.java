package com.allstate.Controllers;


import com.allstate.Models.Line;
import com.allstate.Models.Point;
import com.allstate.Models.Triangle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController


public class TriangleController {

    @RequestMapping(value = "/triangle/area")
    public String area(){
        return new Triangle(3,4).toString();
    }

    @RequestMapping(value = "/triangle/area", method = RequestMethod.POST)
    public double area(@RequestBody Triangle triangle){
        System.out.println("TRIANGLE-------------------" + triangle.toString());
        return triangle.getArea();
    }

    @RequestMapping(value = "/triangle/distance")
    public Map<String, Double> distance(){
        Map<String, Double> map = new HashMap<>();
        map.put("distance",Line.getDistance(new Point(3,4), new Point(5,6)));
        return map;
    }

    @RequestMapping(value = "/triangle/distance", method = RequestMethod.POST)
    public Map<String, Double> distance(@RequestBody List<Point> points){
        Map<String, Double> map = new HashMap<>();
        map.put("distance",Line.getDistance(points.get(0), points.get(1)));
        return map;
    }
}
