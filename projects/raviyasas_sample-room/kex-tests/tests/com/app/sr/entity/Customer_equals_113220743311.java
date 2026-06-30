package com.app.sr.entity;

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
import static com.app.sr.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Customer_equals_113220743311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;
     Object term1052;

    public Customer_equals_113220743311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1002 = new Long(-8885298608300233488L);
        term1001 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term1001, term1001.getClass(), "id", term1002);
        setField(term1001, term1001.getClass(), "firstName", "BndsHwAFMv");
        setField(term1001, term1001.getClass(), "lastName", "GzFkzHGYFt");
        setField(term1001, term1001.getClass(), "email", "tShwQLRGNe");
        setField(term1001, term1001.getClass(), "contactNumber", "LvtrsXUliU");
        term1052 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1052;
        callMethod(klass, "equals", argTypes, term1001, args);
    }

};


