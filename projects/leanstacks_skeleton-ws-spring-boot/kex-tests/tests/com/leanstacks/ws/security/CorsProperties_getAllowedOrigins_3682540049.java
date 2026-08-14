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

public class CorsProperties_getAllowedOrigins_3682540049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1421;

    public CorsProperties_getAllowedOrigins_3682540049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1427 = new Boolean(false);
        ArrayList term1468 = new ArrayList();
        ((ArrayList) term1468).add("nyiiPDVjAc");
        Long term1484 = new Long(1800L);
        term1421 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1429 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1430 = (Object[]) newArray("java.lang.String", 2);
        Object term1454 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1455 = (Object[]) newArray("java.lang.String", 1);
        Object term1462 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1463 = (Object[]) newArray("java.lang.String", 1);
        setField(term1421, term1421.getClass(), "filterRegistrationPath", "/**");
        setField(term1421, term1421.getClass(), "allowCredentials", term1427);
        setElement(term1430, 0, "accept");
        setElement(term1430, 1, "content-type");
        setField(term1429, term1429.getClass(), "a", term1430);
        setIntField(term1429, term1429.getClass(), "modCount", 0);
        setField(term1421, term1421.getClass(), "allowedHeaders", term1429);
        setElement(term1455, 0, "GET");
        setField(term1454, term1454.getClass(), "a", term1455);
        setIntField(term1454, term1454.getClass(), "modCount", 0);
        setField(term1421, term1421.getClass(), "allowedMethods", term1454);
        setElement(term1463, 0, "*");
        setField(term1462, term1462.getClass(), "a", term1463);
        setIntField(term1462, term1462.getClass(), "modCount", 0);
        setField(term1421, term1421.getClass(), "allowedOrigins", term1462);
        setField(term1421, term1421.getClass(), "exposedHeaders", term1468);
        setField(term1421, term1421.getClass(), "maxAgeSeconds", term1484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowedOrigins", argTypes, term1421, args);
    }

};


