package com.leanstacks.ws.security;

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
import static com.leanstacks.ws.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class CorsProperties_setAllowCredentials_5449693544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;
     Object term622;

    public CorsProperties_setAllowCredentials_5449693544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term527 = new Boolean(false);
        ArrayList term568 = new ArrayList();
        ((ArrayList) term568).add("LQFpaHEwXR");
        ((ArrayList) term568).add("oVcInYnLWB");
        ((ArrayList) term568).add("aJlieCFVtF");
        ((ArrayList) term568).add("ZiaGIbnzTs");
        Long term620 = new Long(1800L);
        term521 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term529 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term530 = (Object[]) newArray("java.lang.String", 2);
        Object term554 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term555 = (Object[]) newArray("java.lang.String", 1);
        Object term562 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term563 = (Object[]) newArray("java.lang.String", 1);
        setField(term521, term521.getClass(), "filterRegistrationPath", "/**");
        setField(term521, term521.getClass(), "allowCredentials", term527);
        setElement(term530, 0, "accept");
        setElement(term530, 1, "content-type");
        setField(term529, term529.getClass(), "a", term530);
        setIntField(term529, term529.getClass(), "modCount", 0);
        setField(term521, term521.getClass(), "allowedHeaders", term529);
        setElement(term555, 0, "GET");
        setField(term554, term554.getClass(), "a", term555);
        setIntField(term554, term554.getClass(), "modCount", 0);
        setField(term521, term521.getClass(), "allowedMethods", term554);
        setElement(term563, 0, "*");
        setField(term562, term562.getClass(), "a", term563);
        setIntField(term562, term562.getClass(), "modCount", 0);
        setField(term521, term521.getClass(), "allowedOrigins", term562);
        setField(term521, term521.getClass(), "exposedHeaders", term568);
        setField(term521, term521.getClass(), "maxAgeSeconds", term620);
        term622 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term622;
        callMethod(klass, "setAllowCredentials", argTypes, term521, args);
    }

};


