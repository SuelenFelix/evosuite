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
import java.lang.Object;

public class LoggingProperties_getRequestIdPrefix_13119050283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3245;

    public LoggingProperties_getRequestIdPrefix_13119050283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3245 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term3260 = (Object[]) newArray("java.lang.String", 2);
        Object[] term3286 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term3245, term3245.getClass(), "logRequestId", false);
        setField(term3245, term3245.getClass(), "requestIdPrefix", "ZzIujlwVsw");
        setBooleanField(term3245, term3245.getClass(), "logHeaders", false);
        setElement(term3260, 0, "LWyEaeIyAo");
        setElement(term3260, 1, "yVMkkQhvmN");
        setField(term3245, term3245.getClass(), "maskedHeaders", term3260);
        setBooleanField(term3245, term3245.getClass(), "logCookies", true);
        setElement(term3286, 0, "mvrkADEgpp");
        setElement(term3286, 1, "pXOkjyeIRb");
        setElement(term3286, 2, "GgZWSjxjyE");
        setElement(term3286, 3, "EeBVbzjcCI");
        setElement(term3286, 4, "UfQtPRyWRC");
        setField(term3245, term3245.getClass(), "maskedCookies", term3286);
        setBooleanField(term3245, term3245.getClass(), "logBody", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestIdPrefix", argTypes, term3245, args);
    }

};


