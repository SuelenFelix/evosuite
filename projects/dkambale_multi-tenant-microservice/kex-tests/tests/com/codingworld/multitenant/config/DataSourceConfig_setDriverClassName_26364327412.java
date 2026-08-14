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
import java.lang.Long;

public class DataSourceConfig_setDriverClassName_26364327412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345;

    public DataSourceConfig_setDriverClassName_26364327412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1346 = new Long(-4325723315152823407L);
        term1345 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term1345, term1345.getClass(), "id", term1346);
        setField(term1345, term1345.getClass(), "name", "nHXjMycHlU");
        setField(term1345, term1345.getClass(), "url", "ieCtQFdkii");
        setField(term1345, term1345.getClass(), "username", "dEnhdmILtU");
        setField(term1345, term1345.getClass(), "password", "hoicvmsovO");
        setField(term1345, term1345.getClass(), "driverClassName", "eqJfYWRaEL");
        setBooleanField(term1345, term1345.getClass(), "initialize", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setDriverClassName", argTypes, term1345, args);
    }

};


