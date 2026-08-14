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

public class DataSourceConfig_getUsername_6717033257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;

    public DataSourceConfig_getUsername_6717033257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term732 = new Long(6811161968424632369L);
        term731 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term731, term731.getClass(), "id", term732);
        setField(term731, term731.getClass(), "name", "AijpHYOFuy");
        setField(term731, term731.getClass(), "url", "SbAoxhfrkn");
        setField(term731, term731.getClass(), "username", "kuTXqwMtDB");
        setField(term731, term731.getClass(), "password", "Ghbwtircqb");
        setField(term731, term731.getClass(), "driverClassName", "xrwlQZdwCp");
        setBooleanField(term731, term731.getClass(), "initialize", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term731, args);
    }

};


