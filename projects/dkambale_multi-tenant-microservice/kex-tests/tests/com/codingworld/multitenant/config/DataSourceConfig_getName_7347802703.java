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

public class DataSourceConfig_getName_7347802703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;

    public DataSourceConfig_getName_7347802703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term232 = new Long(-8400487765614892086L);
        term231 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term231, term231.getClass(), "id", term232);
        setField(term231, term231.getClass(), "name", "NRdvgJlhkX");
        setField(term231, term231.getClass(), "url", "uuaPigETmJ");
        setField(term231, term231.getClass(), "username", "MxlszYVzRf");
        setField(term231, term231.getClass(), "password", "LQFpaHEwXR");
        setField(term231, term231.getClass(), "driverClassName", "oVcInYnLWB");
        setBooleanField(term231, term231.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term231, args);
    }

};


