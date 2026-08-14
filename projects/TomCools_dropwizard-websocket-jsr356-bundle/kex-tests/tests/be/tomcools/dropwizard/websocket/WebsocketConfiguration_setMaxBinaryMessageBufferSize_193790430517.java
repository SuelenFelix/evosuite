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

public class WebsocketConfiguration_setMaxBinaryMessageBufferSize_193790430517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1606;

    public WebsocketConfiguration_setMaxBinaryMessageBufferSize_193790430517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1606 = newInstance(Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration"));
        setField(term1606, term1606.getClass(), "maxTextMessageBufferSize", null);
        setField(term1606, term1606.getClass(), "asyncSendTimeout", null);
        setField(term1606, term1606.getClass(), "maxSessionIdleTimeout", null);
        setField(term1606, term1606.getClass(), "maxBinaryMessageBufferSize", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("be.tomcools.dropwizard.websocket.WebsocketConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMaxBinaryMessageBufferSize", argTypes, term1606, args);
    }

};


