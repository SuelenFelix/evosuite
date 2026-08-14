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
import java.lang.String;
import java.lang.Object;

public class CustomerType_getCustomerType_451989911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1407;

    public CustomerType_getCustomerType_451989911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1417 = Class.forName((String) "com.praveen.drools.example.model.CustomerCategory");
        Field term1416 = ((Class) term1417).getDeclaredField((String) "KIDS");
        ((Field) term1416).setAccessible(true);
        Object enum4 = ((Field) term1416).get((Object) null);
        term1407 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerType"));
        setField(term1407, term1407.getClass(), "customerType", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerType", argTypes, term1407, args);
    }

};


