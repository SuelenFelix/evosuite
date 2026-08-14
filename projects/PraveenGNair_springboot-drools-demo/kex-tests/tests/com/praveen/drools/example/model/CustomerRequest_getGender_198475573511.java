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

public class CustomerRequest_getGender_198475573511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;

    public CustomerRequest_getGender_198475573511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term232, term232.getClass(), "id", 0L);
        setField(term232, term232.getClass(), "age", null);
        setField(term232, term232.getClass(), "gender", null);
        setField(term232, term232.getClass(), "numberOfOrders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term232, args);
    }

};


