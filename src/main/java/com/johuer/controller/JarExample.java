package com.johuer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua[xujiuhuamoney@163.com]
 * @create 2016-09-30-10:19
 */
@Controller
public class JarExample {

    @RequestMapping("jar")
    @ResponseBody
    public Map<String, Object> jar() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("jar", "This is a jar Example");
        return map;
    }
}
