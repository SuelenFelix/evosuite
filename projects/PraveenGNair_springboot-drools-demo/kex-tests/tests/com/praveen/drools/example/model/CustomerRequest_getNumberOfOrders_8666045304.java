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

public class CustomerRequest_getNumberOfOrders_8666045304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public CustomerRequest_getNumberOfOrders_8666045304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term115 = new Integer(1227103734);
        Integer term129 = new Integer(-1339778481);
        term113 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term113, term113.getClass(), "id", 5270370404989704783L);
        setField(term113, term113.getClass(), "age", term115);
        setField(term113, term113.getClass(), "gender", "jJCZpVmanW");
        setField(term113, term113.getClass(), "numberOfOrders", term129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfOrders", argTypes, term113, args);
    }

};


