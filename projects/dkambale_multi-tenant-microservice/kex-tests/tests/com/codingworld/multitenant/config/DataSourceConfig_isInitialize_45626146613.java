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

public class DataSourceConfig_isInitialize_45626146613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1481;

    public DataSourceConfig_isInitialize_45626146613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1482 = new Long(2535595959091595249L);
        term1481 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term1481, term1481.getClass(), "id", term1482);
        setField(term1481, term1481.getClass(), "name", "uWHnvSvaPl");
        setField(term1481, term1481.getClass(), "url", "kBdSllIBVz");
        setField(term1481, term1481.getClass(), "username", "TJmVBGfTML");
        setField(term1481, term1481.getClass(), "password", "tPlsykYBqO");
        setField(term1481, term1481.getClass(), "driverClassName", "bLPjGVBhlX");
        setBooleanField(term1481, term1481.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInitialize", argTypes, term1481, args);
    }

};


