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

public class City_setTenantId_16213675387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;

    public City_setTenantId_16213675387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261 = new Long(4872422362414183754L);
        term260 = newInstance(Class.forName("com.codingworld.multitenant.bean.City"));
        setField(term260, term260.getClass(), "id", term261);
        setField(term260, term260.getClass(), "name", "uuaPigETmJ");
        setField(term260, term260.getClass(), "tenantId", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.bean.City");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setTenantId", argTypes, term260, args);
    }

};


