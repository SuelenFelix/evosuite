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

public class CorsProperties_getFilterRegistrationPath_15916036121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CorsProperties_getFilterRegistrationPath_15916036121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term7 = new Boolean(false);
        ArrayList term48 = new ArrayList();
        ((ArrayList) term48).add("PAEBtnZtTD");
        ((ArrayList) term48).add("sjlJAEtRrb");
        ((ArrayList) term48).add("MuLcgQHgqz");
        ((ArrayList) term48).add("xxtlPwDYFs");
        ((ArrayList) term48).add("jJCZpVmanW");
        Long term112 = new Long(1800L);
        term1 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term9 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term10 = (Object[]) newArray("java.lang.String", 2);
        Object term34 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term35 = (Object[]) newArray("java.lang.String", 1);
        Object term42 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term43 = (Object[]) newArray("java.lang.String", 1);
        setField(term1, term1.getClass(), "filterRegistrationPath", "/**");
        setField(term1, term1.getClass(), "allowCredentials", term7);
        setElement(term10, 0, "accept");
        setElement(term10, 1, "content-type");
        setField(term9, term9.getClass(), "a", term10);
        setIntField(term9, term9.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "allowedHeaders", term9);
        setElement(term35, 0, "GET");
        setField(term34, term34.getClass(), "a", term35);
        setIntField(term34, term34.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "allowedMethods", term34);
        setElement(term43, 0, "*");
        setField(term42, term42.getClass(), "a", term43);
        setIntField(term42, term42.getClass(), "modCount", 0);
        setField(term1, term1.getClass(), "allowedOrigins", term42);
        setField(term1, term1.getClass(), "exposedHeaders", term48);
        setField(term1, term1.getClass(), "maxAgeSeconds", term112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterRegistrationPath", argTypes, term1, args);
    }

};


