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

public class WebsocketConfiguration_setAsyncSendTimeout_11217124516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1566;
     Object term1575;

    public WebsocketConfiguration_setAsyncSendTimeout_11217124516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1567 = new Integer(-522618178);
        Long term1569 = new Long(-2813493605142626659L);
        Long term1571 = new Long(-8885298608300233488L);
        Integer term1573 = new Integer(1134449235);
        term1566 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1566, term1566.getClass(), "maxTextMessageBufferSize", term1567);
        setField(term1566, term1566.getClass(), "asyncSendTimeout", term1569);
        setField(term1566, term1566.getClass(), "maxSessionIdleTimeout", term1571);
        setField(term1566, term1566.getClass(), "maxBinaryMessageBufferSize", term1573);
        term1575 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1575;
        callMethod(klass, "setAsyncSendTimeout", argTypes, term1566, args);
    }

};


