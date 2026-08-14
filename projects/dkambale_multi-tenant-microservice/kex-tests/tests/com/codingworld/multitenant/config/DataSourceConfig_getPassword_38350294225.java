package com.codingworld.multitenant.config;

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
import static com.codingworld.multitenant.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DataSourceConfig_getPassword_38350294225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727;

    public DataSourceConfig_getPassword_38350294225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1727 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term1727, term1727.getClass(), "id", null);
        setField(term1727, term1727.getClass(), "name", null);
        setField(term1727, term1727.getClass(), "url", null);
        setField(term1727, term1727.getClass(), "username", null);
        setField(term1727, term1727.getClass(), "password", null);
        setField(term1727, term1727.getClass(), "driverClassName", null);
        setBooleanField(term1727, term1727.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1727, args);
    }

};


