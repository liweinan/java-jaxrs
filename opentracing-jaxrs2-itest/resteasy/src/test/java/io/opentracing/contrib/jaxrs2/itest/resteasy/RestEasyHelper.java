package io.opentracing.contrib.jaxrs2.itest.resteasy;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import io.opentracing.contrib.jaxrs2.itest.common.rest.InstrumentedRestApplication;

/**
 * @author Pavol Loffay
 */
public class RestEasyHelper {

    public static void initServletContext(ServletContextHandler context) {
        ServletHolder restEasyServlet = context.addServlet(
                org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.class, "/*");
        restEasyServlet.setInitOrder(0);

        restEasyServlet.setInitParameter(
                "javax.ws.rs.Application", InstrumentedRestApplication.class.getCanonicalName());
    }
}
