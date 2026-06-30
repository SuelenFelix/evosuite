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

public class Customer_setLastName_32317586923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1374;

    public Customer_setLastName_32317586923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1374 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term1374, term1374.getClass(), "id", null);
        setField(term1374, term1374.getClass(), "firstName", null);
        setField(term1374, term1374.getClass(), "lastName", null);
        setField(term1374, term1374.getClass(), "email", null);
        setField(term1374, term1374.getClass(), "contactNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastName", argTypes, term1374, args);
    }

};


