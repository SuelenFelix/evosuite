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

public class CorsProperties_setExposedHeaders_89540746912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1812;
     Object term1877;

    public CorsProperties_setExposedHeaders_89540746912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1818 = new Boolean(false);
        ArrayList term1859 = new ArrayList();
        ((ArrayList) term1859).add("GzFkzHGYFt");
        Long term1875 = new Long(1800L);
        term1812 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1820 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1821 = (Object[]) newArray("java.lang.String", 2);
        Object term1845 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1846 = (Object[]) newArray("java.lang.String", 1);
        Object term1853 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1854 = (Object[]) newArray("java.lang.String", 1);
        setField(term1812, term1812.getClass(), "filterRegistrationPath", "/**");
        setField(term1812, term1812.getClass(), "allowCredentials", term1818);
        setElement(term1821, 0, "accept");
        setElement(term1821, 1, "content-type");
        setField(term1820, term1820.getClass(), "a", term1821);
        setIntField(term1820, term1820.getClass(), "modCount", 0);
        setField(term1812, term1812.getClass(), "allowedHeaders", term1820);
        setElement(term1846, 0, "GET");
        setField(term1845, term1845.getClass(), "a", term1846);
        setIntField(term1845, term1845.getClass(), "modCount", 0);
        setField(term1812, term1812.getClass(), "allowedMethods", term1845);
        setElement(term1854, 0, "*");
        setField(term1853, term1853.getClass(), "a", term1854);
        setIntField(term1853, term1853.getClass(), "modCount", 0);
        setField(term1812, term1812.getClass(), "allowedOrigins", term1853);
        setField(term1812, term1812.getClass(), "exposedHeaders", term1859);
        setField(term1812, term1812.getClass(), "maxAgeSeconds", term1875);
        term1877 = new LinkedList();
        ((LinkedList) term1877).add("tShwQLRGNe");
        ((LinkedList) term1877).add("LvtrsXUliU");
        ((LinkedList) term1877).add("");
        ((LinkedList) term1877).add((Object)null);
        ((LinkedList) term1877).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1877;
        callMethod(klass, "setExposedHeaders", argTypes, term1812, args);
    }

};


