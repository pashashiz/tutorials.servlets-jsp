package com.ps.tutorial.sj.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Servlet request [" + sre.getServletRequest() + "] was initialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Servlet request [" + sre.getServletRequest() + "] was destroyed");
    }

}
