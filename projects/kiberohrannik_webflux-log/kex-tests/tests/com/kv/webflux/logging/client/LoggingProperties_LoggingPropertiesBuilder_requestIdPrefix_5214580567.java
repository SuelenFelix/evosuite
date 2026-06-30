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

public class LoggingProperties_LoggingPropertiesBuilder_requestIdPrefix_5214580567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1837;

    public LoggingProperties_LoggingPropertiesBuilder_requestIdPrefix_5214580567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1837 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term1852 = (Object[]) newArray("java.lang.String", 6);
        Object[] term1926 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term1837, term1837.getClass(), "logRequestId", true);
        setField(term1837, term1837.getClass(), "requestIdPrefix", "idgaQsnJpQ");
        setBooleanField(term1837, term1837.getClass(), "logHeaders", true);
        setElement(term1852, 0, "VgZnGoIFwQ");
        setElement(term1852, 1, "jUbSRrkrYZ");
        setElement(term1852, 2, "bWWfajKbEX");
        setElement(term1852, 3, "cAPeiZHKGJ");
        setElement(term1852, 4, "LvJFtLBaxj");
        setElement(term1852, 5, "PHvxnGHptP");
        setField(term1837, term1837.getClass(), "maskedHeaders", term1852);
        setBooleanField(term1837, term1837.getClass(), "logCookies", true);
        setElement(term1926, 0, "TimdotUuNC");
        setElement(term1926, 1, "PkWMRdJcBb");
        setField(term1837, term1837.getClass(), "maskedCookies", term1926);
        setBooleanField(term1837, term1837.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jSpAteRute";
        callMethod(klass, "requestIdPrefix", argTypes, term1837, args);
    }

};


