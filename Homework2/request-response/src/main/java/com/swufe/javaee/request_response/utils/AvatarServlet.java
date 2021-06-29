package com.swufe.javaee.request_response.utils;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

@WebServlet(name = "AvatarServlet", value = "/AvatarServlet")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Avatar avatar = TriangleAvatar.newAvatarBuilder().build();

        //avatar.create(123456L);
        byte[] bytes = avatar.createAsPngBytes(1234567L);
        response.getOutputStream().write(bytes);

    }
}
