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
import java.lang.Boolean;

public class LoggingProperties_LoggingPropertiesBuilder_logCookies_17333955963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010;
     Object term1161;

    public LoggingProperties_LoggingPropertiesBuilder_logCookies_17333955963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1010 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term1025 = (Object[]) newArray("java.lang.String", 6);
        Object[] term1099 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term1010, term1010.getClass(), "logRequestId", true);
        setField(term1010, term1010.getClass(), "requestIdPrefix", "BndsHwAFMv");
        setBooleanField(term1010, term1010.getClass(), "logHeaders", false);
        setElement(term1025, 0, "GzFkzHGYFt");
        setElement(term1025, 1, "tShwQLRGNe");
        setElement(term1025, 2, "LvtrsXUliU");
        setElement(term1025, 3, "xLbjWUgOIL");
        setElement(term1025, 4, "jDtqGUpnZN");
        setElement(term1025, 5, "nGKItKLYNC");
        setField(term1010, term1010.getClass(), "maskedHeaders", term1025);
        setBooleanField(term1010, term1010.getClass(), "logCookies", false);
        setElement(term1099, 0, "UiUYnPrcCi");
        setElement(term1099, 1, "UoYtihxVaS");
        setElement(term1099, 2, "JDswTTCZHV");
        setElement(term1099, 3, "onpbIeEKoi");
        setElement(term1099, 4, "YRHGsAkhxb");
        setField(term1010, term1010.getClass(), "maskedCookies", term1099);
        setBooleanField(term1010, term1010.getClass(), "logBody", true);
        term1161 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1161;
        callMethod(klass, "logCookies", argTypes, term1010, args);
    }

};


