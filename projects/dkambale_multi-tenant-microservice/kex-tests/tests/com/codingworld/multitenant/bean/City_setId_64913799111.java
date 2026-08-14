package com.codingworld.multitenant.bean;

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
import static com.codingworld.multitenant.bean.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class City_setId_64913799111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;

    public City_setId_64913799111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331 = newInstance(Class.forName("com.codingworld.multitenant.bean.City"));
        setField(term331, term331.getClass(), "id", null);
        setField(term331, term331.getClass(), "name", null);
        setField(term331, term331.getClass(), "tenantId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.bean.City");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term331, args);
    }

};


