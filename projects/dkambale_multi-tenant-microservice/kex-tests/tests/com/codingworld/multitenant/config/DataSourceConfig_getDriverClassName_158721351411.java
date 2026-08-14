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

public class DataSourceConfig_getDriverClassName_158721351411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;

    public DataSourceConfig_getDriverClassName_158721351411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1232 = new Long(-8885298608300233488L);
        term1231 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term1231, term1231.getClass(), "id", term1232);
        setField(term1231, term1231.getClass(), "name", "onpbIeEKoi");
        setField(term1231, term1231.getClass(), "url", "YRHGsAkhxb");
        setField(term1231, term1231.getClass(), "username", "ffYhPOzlUs");
        setField(term1231, term1231.getClass(), "password", "MLqYREekMl");
        setField(term1231, term1231.getClass(), "driverClassName", "ytSBIKXogI");
        setBooleanField(term1231, term1231.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDriverClassName", argTypes, term1231, args);
    }

};


