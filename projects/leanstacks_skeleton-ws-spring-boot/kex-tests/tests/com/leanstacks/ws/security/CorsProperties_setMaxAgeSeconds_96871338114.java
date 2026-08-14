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

public class CorsProperties_setMaxAgeSeconds_96871338114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2121;
     Object term2186;

    public CorsProperties_setMaxAgeSeconds_96871338114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2127 = new Boolean(false);
        ArrayList term2168 = new ArrayList();
        ((ArrayList) term2168).add("onpbIeEKoi");
        Long term2184 = new Long(1800L);
        term2121 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term2129 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term2130 = (Object[]) newArray("java.lang.String", 2);
        Object term2154 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term2155 = (Object[]) newArray("java.lang.String", 1);
        Object term2162 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term2163 = (Object[]) newArray("java.lang.String", 1);
        setField(term2121, term2121.getClass(), "filterRegistrationPath", "/**");
        setField(term2121, term2121.getClass(), "allowCredentials", term2127);
        setElement(term2130, 0, "accept");
        setElement(term2130, 1, "content-type");
        setField(term2129, term2129.getClass(), "a", term2130);
        setIntField(term2129, term2129.getClass(), "modCount", 0);
        setField(term2121, term2121.getClass(), "allowedHeaders", term2129);
        setElement(term2155, 0, "GET");
        setField(term2154, term2154.getClass(), "a", term2155);
        setIntField(term2154, term2154.getClass(), "modCount", 0);
        setField(term2121, term2121.getClass(), "allowedMethods", term2154);
        setElement(term2163, 0, "*");
        setField(term2162, term2162.getClass(), "a", term2163);
        setIntField(term2162, term2162.getClass(), "modCount", 0);
        setField(term2121, term2121.getClass(), "allowedOrigins", term2162);
        setField(term2121, term2121.getClass(), "exposedHeaders", term2168);
        setField(term2121, term2121.getClass(), "maxAgeSeconds", term2184);
        term2186 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2186;
        callMethod(klass, "setMaxAgeSeconds", argTypes, term2121, args);
    }

};


