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

public class CustomerType_setCustomerType_17522875172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;
     Object enum6;

    public CustomerType_setCustomerType_17522875172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1701 = Class.forName((String) "com.praveen.drools.example.model.CustomerCategory");
        Field term1700 = ((Class) term1701).getDeclaredField((String) "KIDS");
        ((Field) term1700).setAccessible(true);
        Object enum5 = ((Field) term1700).get((Object) null);
        term1680 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerType"));
        setField(term1680, term1680.getClass(), "customerType", enum5);
        Class<? extends Object> term1965 = Class.forName((String) "com.praveen.drools.example.model.CustomerCategory");
        Field term1964 = ((Class) term1965).getDeclaredField((String) "GENERAL");
        ((Field) term1964).setAccessible(true);
        enum6 = ((Field) term1964).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.praveen.drools.example.model.CustomerCategory");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "setCustomerType", argTypes, term1680, args);
    }

};


