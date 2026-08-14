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

public class CorsProperties_getAllowedHeaders_3822297555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;

    public CorsProperties_getAllowedHeaders_3822297555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term695 = new Boolean(false);
        ArrayList term736 = new ArrayList();
        ((ArrayList) term736).add("tbcdzjIfER");
        Long term752 = new Long(1800L);
        term689 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term697 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term698 = (Object[]) newArray("java.lang.String", 2);
        Object term722 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term723 = (Object[]) newArray("java.lang.String", 1);
        Object term730 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term731 = (Object[]) newArray("java.lang.String", 1);
        setField(term689, term689.getClass(), "filterRegistrationPath", "/**");
        setField(term689, term689.getClass(), "allowCredentials", term695);
        setElement(term698, 0, "accept");
        setElement(term698, 1, "content-type");
        setField(term697, term697.getClass(), "a", term698);
        setIntField(term697, term697.getClass(), "modCount", 0);
        setField(term689, term689.getClass(), "allowedHeaders", term697);
        setElement(term723, 0, "GET");
        setField(term722, term722.getClass(), "a", term723);
        setIntField(term722, term722.getClass(), "modCount", 0);
        setField(term689, term689.getClass(), "allowedMethods", term722);
        setElement(term731, 0, "*");
        setField(term730, term730.getClass(), "a", term731);
        setIntField(term730, term730.getClass(), "modCount", 0);
        setField(term689, term689.getClass(), "allowedOrigins", term730);
        setField(term689, term689.getClass(), "exposedHeaders", term736);
        setField(term689, term689.getClass(), "maxAgeSeconds", term752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowedHeaders", argTypes, term689, args);
    }

};


