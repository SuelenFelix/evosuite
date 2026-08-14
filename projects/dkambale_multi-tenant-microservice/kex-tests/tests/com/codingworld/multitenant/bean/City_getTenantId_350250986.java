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

public class City_getTenantId_350250986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;

    public City_getTenantId_350250986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term214 = new Long(7411271909051562686L);
        term213 = newInstance(Class.forName("com.codingworld.multitenant.bean.City"));
        setField(term213, term213.getClass(), "id", term214);
        setField(term213, term213.getClass(), "name", "RMFIsYGgne");
        setField(term213, term213.getClass(), "tenantId", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.bean.City");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTenantId", argTypes, term213, args);
    }

};


