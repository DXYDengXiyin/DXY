package com.swufe.javaee.request_response.utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * this tool cannot cover every situation, and you may refer to https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent
 */
public class AgentChecker {
    public static String getBrowser(String agent) {
        if (agent.contains("Chrome")) return "Chrome";
        else if (agent.contains("Firefox")) return "Firefox";
        else if (agent.contains("Safari")) return "Safari";
        else return "Unknow";
    }

    public static String getOS(String agent) {
       if (agent.contains("Windows")) return "Windows";
       else if (agent.contains("Mac")) return "Mac OS";
       else return "Linux";
    }
}
