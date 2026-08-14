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

public class CustomerRequest_equals_11576219475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term159;

    public CustomerRequest_equals_11576219475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term143 = new Integer(1725571209);
        Integer term157 = new Integer(-522618178);
        term141 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term141, term141.getClass(), "id", 7411271909051562686L);
        setField(term141, term141.getClass(), "age", term143);
        setField(term141, term141.getClass(), "gender", "EGtDIRbSSb");
        setField(term141, term141.getClass(), "numberOfOrders", term157);
        term159 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term159;
        callMethod(klass, "equals", argTypes, term141, args);
    }

};


