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

public class DataSourceConfig_setId_4028665432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term179;

    public DataSourceConfig_setId_4028665432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116 = new Long(6375119433582206027L);
        term115 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term115, term115.getClass(), "id", term116);
        setField(term115, term115.getClass(), "name", "EGtDIRbSSb");
        setField(term115, term115.getClass(), "url", "SzjVpOQTyS");
        setField(term115, term115.getClass(), "username", "MjGYSRKTNF");
        setField(term115, term115.getClass(), "password", "hRNSzYYIrc");
        setField(term115, term115.getClass(), "driverClassName", "RMFIsYGgne");
        setBooleanField(term115, term115.getClass(), "initialize", false);
        term179 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term179;
        callMethod(klass, "setId", argTypes, term115, args);
    }

};


