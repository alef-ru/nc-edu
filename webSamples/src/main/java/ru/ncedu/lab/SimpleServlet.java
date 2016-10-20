package ru.ncedu.lab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import static org.springframework.util.StringUtils.*;
/**
 * Created by alef0913 on 14.10.2016.
 */
public class SimpleServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        out.println("Hi there!\n");

        //resp.setStatus(222);

        Map<String, String[]> params = req.getParameterMap();
        if (!params.isEmpty()) {
            out.println("Params:");
            for (String key: params.keySet())
                out.println(key + ": " + arrayToDelimitedString(params.get(key), ", "));

        }
    }
}
