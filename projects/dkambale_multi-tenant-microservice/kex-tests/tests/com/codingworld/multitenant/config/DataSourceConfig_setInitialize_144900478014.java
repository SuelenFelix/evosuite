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
import java.lang.Boolean;

public class DataSourceConfig_setInitialize_144900478014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1595;
     Object term1659;

    public DataSourceConfig_setInitialize_144900478014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1596 = new Long(-5476826692763582090L);
        term1595 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term1595, term1595.getClass(), "id", term1596);
        setField(term1595, term1595.getClass(), "name", "whBvTVIIlC");
        setField(term1595, term1595.getClass(), "url", "IgRJUzaCwW");
        setField(term1595, term1595.getClass(), "username", "JUmudUmaaV");
        setField(term1595, term1595.getClass(), "password", "KoyGrUJeJW");
        setField(term1595, term1595.getClass(), "driverClassName", "HqBOwkVqjD");
        setBooleanField(term1595, term1595.getClass(), "initialize", true);
        term1659 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1659;
        callMethod(klass, "setInitialize", argTypes, term1595, args);
    }

};


