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

public class CorsProperties_getMaxAgeSeconds_60140430513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1977;

    public CorsProperties_getMaxAgeSeconds_60140430513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1983 = new Boolean(false);
        ArrayList term2024 = new ArrayList();
        ((ArrayList) term2024).add("UiUYnPrcCi");
        ((ArrayList) term2024).add("UoYtihxVaS");
        ((ArrayList) term2024).add("JDswTTCZHV");
        Long term2064 = new Long(1800L);
        term1977 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1985 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1986 = (Object[]) newArray("java.lang.String", 2);
        Object term2010 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term2011 = (Object[]) newArray("java.lang.String", 1);
        Object term2018 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term2019 = (Object[]) newArray("java.lang.String", 1);
        setField(term1977, term1977.getClass(), "filterRegistrationPath", "/**");
        setField(term1977, term1977.getClass(), "allowCredentials", term1983);
        setElement(term1986, 0, "accept");
        setElement(term1986, 1, "content-type");
        setField(term1985, term1985.getClass(), "a", term1986);
        setIntField(term1985, term1985.getClass(), "modCount", 0);
        setField(term1977, term1977.getClass(), "allowedHeaders", term1985);
        setElement(term2011, 0, "GET");
        setField(term2010, term2010.getClass(), "a", term2011);
        setIntField(term2010, term2010.getClass(), "modCount", 0);
        setField(term1977, term1977.getClass(), "allowedMethods", term2010);
        setElement(term2019, 0, "*");
        setField(term2018, term2018.getClass(), "a", term2019);
        setIntField(term2018, term2018.getClass(), "modCount", 0);
        setField(term1977, term1977.getClass(), "allowedOrigins", term2018);
        setField(term1977, term1977.getClass(), "exposedHeaders", term2024);
        setField(term1977, term1977.getClass(), "maxAgeSeconds", term2064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxAgeSeconds", argTypes, term1977, args);
    }

};


