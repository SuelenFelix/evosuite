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

public class LoggingProperties_LoggingPropertiesBuilder_build_4789236688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2064;

    public LoggingProperties_LoggingPropertiesBuilder_build_4789236688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2064 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term2079 = (Object[]) newArray("java.lang.String", 1);
        Object[] term2093 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term2064, term2064.getClass(), "logRequestId", false);
        setField(term2064, term2064.getClass(), "requestIdPrefix", "swZVeJAxjt");
        setBooleanField(term2064, term2064.getClass(), "logHeaders", false);
        setElement(term2079, 0, "xOcJIiQQDu");
        setField(term2064, term2064.getClass(), "maskedHeaders", term2079);
        setBooleanField(term2064, term2064.getClass(), "logCookies", true);
        setElement(term2093, 0, "GVizqqzXpy");
        setElement(term2093, 1, "JqXGgAhZPl");
        setElement(term2093, 2, "jiKYgYHqIS");
        setElement(term2093, 3, "DfISiziTgG");
        setElement(term2093, 4, "XqgfKFvPSD");
        setElement(term2093, 5, "JiVRgTZvKc");
        setElement(term2093, 6, "XPKmummaqg");
        setElement(term2093, 7, "BKLfkLiZTH");
        setElement(term2093, 8, "SPpkrGcPRr");
        setField(term2064, term2064.getClass(), "maskedCookies", term2093);
        setBooleanField(term2064, term2064.getClass(), "logBody", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2064, args);
    }

};


