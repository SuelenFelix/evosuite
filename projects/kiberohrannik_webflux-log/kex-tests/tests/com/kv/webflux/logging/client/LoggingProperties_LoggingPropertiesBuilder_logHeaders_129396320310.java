package com.kv.webflux.logging.client;

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
import static com.kv.webflux.logging.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class LoggingProperties_LoggingPropertiesBuilder_logHeaders_129396320310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2313;
     Object term2318;

    public LoggingProperties_LoggingPropertiesBuilder_logHeaders_129396320310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2313 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        setBooleanField(term2313, term2313.getClass(), "logRequestId", false);
        setField(term2313, term2313.getClass(), "requestIdPrefix", null);
        setBooleanField(term2313, term2313.getClass(), "logHeaders", false);
        setField(term2313, term2313.getClass(), "maskedHeaders", null);
        setBooleanField(term2313, term2313.getClass(), "logCookies", false);
        setField(term2313, term2313.getClass(), "maskedCookies", null);
        setBooleanField(term2313, term2313.getClass(), "logBody", false);
        term2318 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2318;
        callMethod(klass, "logHeaders", argTypes, term2313, args);
    }

};


