package ru.ncedu.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by alef0913 on 17.10.2016.
 */

@Controller
public class SimpleController {

    @RequestMapping("/env")
    public String getAllEnvVariables(Map<String, Object> model){
        model.put("env", System.getenv());
        return "/WEB-INF/views/env_all.jsp";
    }

    @RequestMapping("/env/{paramname}")
    public String getEnvVariable(@PathVariable String paramname, Map<String, Object> model){
        model.put("value", System.getenv().get(paramname));
        return "/WEB-INF/views/env_one.jsp";
    }
}
