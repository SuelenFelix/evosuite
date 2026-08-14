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

public class DataSourceConfig_getPassword_3835029429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981;

    public DataSourceConfig_getPassword_3835029429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term982 = new Long(6967924379644551255L);
        term981 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term981, term981.getClass(), "id", term982);
        setField(term981, term981.getClass(), "name", "hxCBltsObl");
        setField(term981, term981.getClass(), "url", "BndsHwAFMv");
        setField(term981, term981.getClass(), "username", "GzFkzHGYFt");
        setField(term981, term981.getClass(), "password", "tShwQLRGNe");
        setField(term981, term981.getClass(), "driverClassName", "LvtrsXUliU");
        setBooleanField(term981, term981.getClass(), "initialize", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term981, args);
    }

};


