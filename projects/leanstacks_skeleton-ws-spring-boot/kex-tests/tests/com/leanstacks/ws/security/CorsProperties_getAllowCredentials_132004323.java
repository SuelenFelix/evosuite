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

public class CorsProperties_getAllowCredentials_132004323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;

    public CorsProperties_getAllowCredentials_132004323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term383 = new Boolean(false);
        ArrayList term424 = new ArrayList();
        ((ArrayList) term424).add("NRdvgJlhkX");
        ((ArrayList) term424).add("uuaPigETmJ");
        ((ArrayList) term424).add("MxlszYVzRf");
        Long term464 = new Long(1800L);
        term377 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term385 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term386 = (Object[]) newArray("java.lang.String", 2);
        Object term410 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term411 = (Object[]) newArray("java.lang.String", 1);
        Object term418 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term419 = (Object[]) newArray("java.lang.String", 1);
        setField(term377, term377.getClass(), "filterRegistrationPath", "/**");
        setField(term377, term377.getClass(), "allowCredentials", term383);
        setElement(term386, 0, "accept");
        setElement(term386, 1, "content-type");
        setField(term385, term385.getClass(), "a", term386);
        setIntField(term385, term385.getClass(), "modCount", 0);
        setField(term377, term377.getClass(), "allowedHeaders", term385);
        setElement(term411, 0, "GET");
        setField(term410, term410.getClass(), "a", term411);
        setIntField(term410, term410.getClass(), "modCount", 0);
        setField(term377, term377.getClass(), "allowedMethods", term410);
        setElement(term419, 0, "*");
        setField(term418, term418.getClass(), "a", term419);
        setIntField(term418, term418.getClass(), "modCount", 0);
        setField(term377, term377.getClass(), "allowedOrigins", term418);
        setField(term377, term377.getClass(), "exposedHeaders", term424);
        setField(term377, term377.getClass(), "maxAgeSeconds", term464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowCredentials", argTypes, term377, args);
    }

};


