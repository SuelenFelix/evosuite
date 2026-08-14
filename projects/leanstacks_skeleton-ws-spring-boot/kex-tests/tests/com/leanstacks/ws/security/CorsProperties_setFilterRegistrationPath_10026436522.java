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

public class CorsProperties_setFilterRegistrationPath_10026436522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;

    public CorsProperties_setFilterRegistrationPath_10026436522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term195 = new Boolean(false);
        ArrayList term236 = new ArrayList();
        ((ArrayList) term236).add("EGtDIRbSSb");
        ((ArrayList) term236).add("SzjVpOQTyS");
        ((ArrayList) term236).add("MjGYSRKTNF");
        ((ArrayList) term236).add("hRNSzYYIrc");
        Long term288 = new Long(1800L);
        term189 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term197 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term198 = (Object[]) newArray("java.lang.String", 2);
        Object term222 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term223 = (Object[]) newArray("java.lang.String", 1);
        Object term230 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term231 = (Object[]) newArray("java.lang.String", 1);
        setField(term189, term189.getClass(), "filterRegistrationPath", "/**");
        setField(term189, term189.getClass(), "allowCredentials", term195);
        setElement(term198, 0, "accept");
        setElement(term198, 1, "content-type");
        setField(term197, term197.getClass(), "a", term198);
        setIntField(term197, term197.getClass(), "modCount", 0);
        setField(term189, term189.getClass(), "allowedHeaders", term197);
        setElement(term223, 0, "GET");
        setField(term222, term222.getClass(), "a", term223);
        setIntField(term222, term222.getClass(), "modCount", 0);
        setField(term189, term189.getClass(), "allowedMethods", term222);
        setElement(term231, 0, "*");
        setField(term230, term230.getClass(), "a", term231);
        setIntField(term230, term230.getClass(), "modCount", 0);
        setField(term189, term189.getClass(), "allowedOrigins", term230);
        setField(term189, term189.getClass(), "exposedHeaders", term236);
        setField(term189, term189.getClass(), "maxAgeSeconds", term288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "setFilterRegistrationPath", argTypes, term189, args);
    }

};


