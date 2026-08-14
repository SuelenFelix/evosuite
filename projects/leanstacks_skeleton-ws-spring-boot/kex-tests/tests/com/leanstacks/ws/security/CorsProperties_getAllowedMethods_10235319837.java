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

public class CorsProperties_getAllowedMethods_10235319837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064;

    public CorsProperties_getAllowedMethods_10235319837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1070 = new Boolean(false);
        ArrayList term1111 = new ArrayList();
        Long term1115 = new Long(1800L);
        term1064 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1072 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1073 = (Object[]) newArray("java.lang.String", 2);
        Object term1097 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1098 = (Object[]) newArray("java.lang.String", 1);
        Object term1105 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1106 = (Object[]) newArray("java.lang.String", 1);
        setField(term1064, term1064.getClass(), "filterRegistrationPath", "/**");
        setField(term1064, term1064.getClass(), "allowCredentials", term1070);
        setElement(term1073, 0, "accept");
        setElement(term1073, 1, "content-type");
        setField(term1072, term1072.getClass(), "a", term1073);
        setIntField(term1072, term1072.getClass(), "modCount", 0);
        setField(term1064, term1064.getClass(), "allowedHeaders", term1072);
        setElement(term1098, 0, "GET");
        setField(term1097, term1097.getClass(), "a", term1098);
        setIntField(term1097, term1097.getClass(), "modCount", 0);
        setField(term1064, term1064.getClass(), "allowedMethods", term1097);
        setElement(term1106, 0, "*");
        setField(term1105, term1105.getClass(), "a", term1106);
        setIntField(term1105, term1105.getClass(), "modCount", 0);
        setField(term1064, term1064.getClass(), "allowedOrigins", term1105);
        setField(term1064, term1064.getClass(), "exposedHeaders", term1111);
        setField(term1064, term1064.getClass(), "maxAgeSeconds", term1115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowedMethods", argTypes, term1064, args);
    }

};


