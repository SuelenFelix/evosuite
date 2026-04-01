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
import java.util.LinkedList;

public class CorsProperties_setAllowedOrigins_150644945410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1521;
     Object term1646;

    public CorsProperties_setAllowedOrigins_150644945410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1527 = new Boolean(false);
        ArrayList term1568 = new ArrayList();
        ((ArrayList) term1568).add("aKnKipADSo");
        ((ArrayList) term1568).add("wSQxaModmm");
        ((ArrayList) term1568).add("UlajhuVLaP");
        ((ArrayList) term1568).add("gGSMzuGICf");
        ((ArrayList) term1568).add("hxCBltsObl");
        ((ArrayList) term1568).add("BndsHwAFMv");
        Long term1644 = new Long(1800L);
        term1521 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1529 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1530 = (Object[]) newArray("java.lang.String", 2);
        Object term1554 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1555 = (Object[]) newArray("java.lang.String", 1);
        Object term1562 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1563 = (Object[]) newArray("java.lang.String", 1);
        setField(term1521, term1521.getClass(), "filterRegistrationPath", "/**");
        setField(term1521, term1521.getClass(), "allowCredentials", term1527);
        setElement(term1530, 0, "accept");
        setElement(term1530, 1, "content-type");
        setField(term1529, term1529.getClass(), "a", term1530);
        setIntField(term1529, term1529.getClass(), "modCount", 0);
        setField(term1521, term1521.getClass(), "allowedHeaders", term1529);
        setElement(term1555, 0, "GET");
        setField(term1554, term1554.getClass(), "a", term1555);
        setIntField(term1554, term1554.getClass(), "modCount", 0);
        setField(term1521, term1521.getClass(), "allowedMethods", term1554);
        setElement(term1563, 0, "*");
        setField(term1562, term1562.getClass(), "a", term1563);
        setIntField(term1562, term1562.getClass(), "modCount", 0);
        setField(term1521, term1521.getClass(), "allowedOrigins", term1562);
        setField(term1521, term1521.getClass(), "exposedHeaders", term1568);
        setField(term1521, term1521.getClass(), "maxAgeSeconds", term1644);
        term1646 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1646;
        callMethod(klass, "setAllowedOrigins", argTypes, term1521, args);
    }

};


