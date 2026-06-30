package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BccResource_getCreated_47865167526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;

    public BccResource_getCreated_47865167526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2163 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        setField(term2163, term2163.getClass(), "id", null);
        setField(term2163, term2163.getClass(), "accountId", null);
        setField(term2163, term2163.getClass(), "email", null);
        setBooleanField(term2163, term2163.getClass(), "enabled", false);
        setField(term2163, term2163.getClass(), "created", null);
        setField(term2163, term2163.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term2163, args);
    }

};


