package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class RateLimitManager_isInRate_149045636116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22054;
     Object term22056;

    public RateLimitManager_isInRate_149045636116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22054 = newInstance(Class.forName("com.scaleguard.server.http.router.RateLimitManager"));
        setField(term22054, term22054.getClass(), "ibm", null);
        setField(term22054, term22054.getClass(), "rateLimitMap", null);
        setIntField(term22054, term22054.getClass(), "allowedRate", 0);
        term22056 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RateLimitManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.RouteTarget");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term22056;
        callMethod(klass, "isInRate", argTypes, term22054, args);
    }

};


