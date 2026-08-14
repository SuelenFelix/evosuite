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
import java.lang.Integer;

public class CustomerRequest_toString_1981755827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public CustomerRequest_toString_1981755827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term200 = new Integer(1585847225);
        Integer term214 = new Integer(597278769);
        term198 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term198, term198.getClass(), "id", 6811161968424632369L);
        setField(term198, term198.getClass(), "age", term200);
        setField(term198, term198.getClass(), "gender", "MjGYSRKTNF");
        setField(term198, term198.getClass(), "numberOfOrders", term214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term198, args);
    }

};


