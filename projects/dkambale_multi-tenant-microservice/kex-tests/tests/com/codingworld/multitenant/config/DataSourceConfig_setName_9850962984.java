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

public class DataSourceConfig_setName_9850962984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;

    public DataSourceConfig_setName_9850962984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term346 = new Long(5270370404989704783L);
        term345 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term345, term345.getClass(), "id", term346);
        setField(term345, term345.getClass(), "name", "aJlieCFVtF");
        setField(term345, term345.getClass(), "url", "ZiaGIbnzTs");
        setField(term345, term345.getClass(), "username", "tbcdzjIfER");
        setField(term345, term345.getClass(), "password", "HyxfbSQYBe");
        setField(term345, term345.getClass(), "driverClassName", "pCTimMblYc");
        setBooleanField(term345, term345.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setName", argTypes, term345, args);
    }

};


