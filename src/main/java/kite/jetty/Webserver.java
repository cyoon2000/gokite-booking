package kite.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.net.URL;


public class Webserver
{
    public static void main(String[] args) throws Exception
    {
        final Server server = new Server(9119);
        server.setHandler(getServletHandler());

        server.start();
        server.join();
    }

    static ServletContextHandler getServletHandler() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringConfig.class);

        ServletHolder servletHolder = new ServletHolder(new DispatcherServlet(applicationContext));
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        context.addServlet(servletHolder, "/*");

        return context;
    }

}