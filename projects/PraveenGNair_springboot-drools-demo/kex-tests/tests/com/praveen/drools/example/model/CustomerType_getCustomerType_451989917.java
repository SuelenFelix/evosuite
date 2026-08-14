package com.praveen.drools.example.model;

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
import static com.praveen.drools.example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerType_getCustomerType_451989917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;

    public CustomerType_getCustomerType_451989917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3157 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerType"));
        setField(term3157, term3157.getClass(), "customerType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerType", argTypes, term3157, args);
    }

};


