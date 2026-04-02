package com.shark.erp.entity;

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
import static com.shark.erp.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Order_setSalesTime_55544595143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5454;

    public Order_setSalesTime_55544595143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5454 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5454, term5454.getClass(), "id", 0);
        setIntField(term5454, term5454.getClass(), "goodsId", 0);
        setField(term5454, term5454.getClass(), "goodsName", null);
        setIntField(term5454, term5454.getClass(), "customerId", 0);
        setIntField(term5454, term5454.getClass(), "quantity", 0);
        setDoubleField(term5454, term5454.getClass(), "amountPayable", 0.0);
        setDoubleField(term5454, term5454.getClass(), "amountPaid", 0.0);
        setDoubleField(term5454, term5454.getClass(), "change", 0.0);
        setIntField(term5454, term5454.getClass(), "point", 0);
        setField(term5454, term5454.getClass(), "salesTime", null);
        setField(term5454, term5454.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSalesTime", argTypes, term5454, args);
    }

};


