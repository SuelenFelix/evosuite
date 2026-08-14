package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AsyncEngineEntry_setId_17963162109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;

    public AsyncEngineEntry_setId_17963162109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1104 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1104, term1104.getClass(), "id", "jDtqGUpnZN");
        setField(term1104, term1104.getClass(), "name", "nGKItKLYNC");
        setField(term1104, term1104.getClass(), "description", "UiUYnPrcCi");
        setField(term1104, term1104.getClass(), "payload", "UoYtihxVaS");
        setField(term1104, term1104.getClass(), "type", "JDswTTCZHV");
        setLongField(term1104, term1104.getClass(), "mts", -5476826692763582090L);
        setLongField(term1104, term1104.getClass(), "uts", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "setId", argTypes, term1104, args);
    }

};


