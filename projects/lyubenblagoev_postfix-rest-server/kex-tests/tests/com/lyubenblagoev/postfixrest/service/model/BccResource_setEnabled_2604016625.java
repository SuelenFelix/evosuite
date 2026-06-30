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
import java.lang.Boolean;

public class BccResource_setEnabled_2604016625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159;
     Object term2161;

    public BccResource_setEnabled_2604016625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2159 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        setField(term2159, term2159.getClass(), "id", null);
        setField(term2159, term2159.getClass(), "accountId", null);
        setField(term2159, term2159.getClass(), "email", null);
        setBooleanField(term2159, term2159.getClass(), "enabled", false);
        setField(term2159, term2159.getClass(), "created", null);
        setField(term2159, term2159.getClass(), "updated", null);
        term2161 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2161;
        callMethod(klass, "setEnabled", argTypes, term2159, args);
    }

};


