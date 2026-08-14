package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProxyResponse_setStatus_5937336296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5007;

    public ProxyResponse_setStatus_5937336296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5007 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term5007, term5007.getClass(), "id", "CGOpQSZZwI");
        setField(term5007, term5007.getClass(), "groupId", "ypEdrstygY");
        setField(term5007, term5007.getClass(), "status", "pending");
        setIntField(term5007, term5007.getClass(), "responseCode", 1134449235);
        setField(term5007, term5007.getClass(), "responseBody", "sNQFlATEeQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZKMLioamsY";
        callMethod(klass, "setStatus", argTypes, term5007, args);
    }

};


