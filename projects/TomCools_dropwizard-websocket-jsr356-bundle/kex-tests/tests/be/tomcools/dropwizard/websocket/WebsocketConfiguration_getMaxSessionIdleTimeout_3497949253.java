package be.tomcools.dropwizard.websocket;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static be.tomcools.dropwizard.websocket.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class WebsocketConfiguration_getMaxSessionIdleTimeout_3497949253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537;

    public WebsocketConfiguration_getMaxSessionIdleTimeout_3497949253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1538 = new Integer(-1922583790);
        Long term1540 = new Long(5270370404989704783L);
        Long term1542 = new Long(7411271909051562686L);
        Integer term1544 = new Integer(-616727354);
        term1537 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1537, term1537.getClass(), "maxTextMessageBufferSize", term1538);
        setField(term1537, term1537.getClass(), "asyncSendTimeout", term1540);
        setField(term1537, term1537.getClass(), "maxSessionIdleTimeout", term1542);
        setField(term1537, term1537.getClass(), "maxBinaryMessageBufferSize", term1544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxSessionIdleTimeout", argTypes, term1537, args);
    }

};


