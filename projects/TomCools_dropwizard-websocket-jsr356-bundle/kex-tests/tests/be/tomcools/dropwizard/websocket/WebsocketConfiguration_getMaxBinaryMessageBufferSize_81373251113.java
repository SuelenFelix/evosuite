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

public class WebsocketConfiguration_getMaxBinaryMessageBufferSize_81373251113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1602;

    public WebsocketConfiguration_getMaxBinaryMessageBufferSize_81373251113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1602 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1602, term1602.getClass(), "maxTextMessageBufferSize", null);
        setField(term1602, term1602.getClass(), "asyncSendTimeout", null);
        setField(term1602, term1602.getClass(), "maxSessionIdleTimeout", null);
        setField(term1602, term1602.getClass(), "maxBinaryMessageBufferSize", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBinaryMessageBufferSize", argTypes, term1602, args);
    }

};


