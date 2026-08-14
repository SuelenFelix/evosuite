package com.codingworld.multitenant.bean;

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
import static com.codingworld.multitenant.bean.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class City_setId_6491379913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term75;

    public City_setId_6491379913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49 = new Long(6375119433582206027L);
        term48 = newInstance(Class.forName("com.codingworld.multitenant.bean.City"));
        setField(term48, term48.getClass(), "id", term49);
        setField(term48, term48.getClass(), "name", "MuLcgQHgqz");
        setField(term48, term48.getClass(), "tenantId", "xxtlPwDYFs");
        term75 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.bean.City");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term75;
        callMethod(klass, "setId", argTypes, term48, args);
    }

};


