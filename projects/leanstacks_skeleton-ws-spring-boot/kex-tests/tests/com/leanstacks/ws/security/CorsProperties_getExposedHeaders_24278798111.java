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

public class CorsProperties_getExposedHeaders_24278798111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;

    public CorsProperties_getExposedHeaders_24278798111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1740 = new Boolean(false);
        ArrayList term1781 = new ArrayList();
        Long term1785 = new Long(1800L);
        term1734 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1742 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1743 = (Object[]) newArray("java.lang.String", 2);
        Object term1767 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1768 = (Object[]) newArray("java.lang.String", 1);
        Object term1775 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1776 = (Object[]) newArray("java.lang.String", 1);
        setField(term1734, term1734.getClass(), "filterRegistrationPath", "/**");
        setField(term1734, term1734.getClass(), "allowCredentials", term1740);
        setElement(term1743, 0, "accept");
        setElement(term1743, 1, "content-type");
        setField(term1742, term1742.getClass(), "a", term1743);
        setIntField(term1742, term1742.getClass(), "modCount", 0);
        setField(term1734, term1734.getClass(), "allowedHeaders", term1742);
        setElement(term1768, 0, "GET");
        setField(term1767, term1767.getClass(), "a", term1768);
        setIntField(term1767, term1767.getClass(), "modCount", 0);
        setField(term1734, term1734.getClass(), "allowedMethods", term1767);
        setElement(term1776, 0, "*");
        setField(term1775, term1775.getClass(), "a", term1776);
        setIntField(term1775, term1775.getClass(), "modCount", 0);
        setField(term1734, term1734.getClass(), "allowedOrigins", term1775);
        setField(term1734, term1734.getClass(), "exposedHeaders", term1781);
        setField(term1734, term1734.getClass(), "maxAgeSeconds", term1785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExposedHeaders", argTypes, term1734, args);
    }

};


