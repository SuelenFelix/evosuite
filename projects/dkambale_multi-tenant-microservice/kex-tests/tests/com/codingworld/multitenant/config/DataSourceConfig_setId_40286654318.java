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

public class DataSourceConfig_setId_40286654318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1713;

    public DataSourceConfig_setId_40286654318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1713 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term1713, term1713.getClass(), "id", null);
        setField(term1713, term1713.getClass(), "name", null);
        setField(term1713, term1713.getClass(), "url", null);
        setField(term1713, term1713.getClass(), "username", null);
        setField(term1713, term1713.getClass(), "password", null);
        setField(term1713, term1713.getClass(), "driverClassName", null);
        setBooleanField(term1713, term1713.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term1713, args);
    }

};


