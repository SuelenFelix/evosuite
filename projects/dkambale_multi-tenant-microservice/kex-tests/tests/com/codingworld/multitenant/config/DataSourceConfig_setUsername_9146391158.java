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

public class DataSourceConfig_setUsername_9146391158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845;

    public DataSourceConfig_setUsername_9146391158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term846 = new Long(-7237588299778557629L);
        term845 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term845, term845.getClass(), "id", term846);
        setField(term845, term845.getClass(), "name", "IDCWpPLRkE");
        setField(term845, term845.getClass(), "url", "nyiiPDVjAc");
        setField(term845, term845.getClass(), "username", "aKnKipADSo");
        setField(term845, term845.getClass(), "password", "wSQxaModmm");
        setField(term845, term845.getClass(), "driverClassName", "UlajhuVLaP");
        setBooleanField(term845, term845.getClass(), "initialize", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setUsername", argTypes, term845, args);
    }

};


