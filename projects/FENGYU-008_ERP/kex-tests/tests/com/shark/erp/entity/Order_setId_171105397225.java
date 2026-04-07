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
import java.lang.Integer;

public class Order_setId_171105397225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5276;
     Object term5285;

    public Order_setId_171105397225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5276 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5276, term5276.getClass(), "id", 0);
        setIntField(term5276, term5276.getClass(), "goodsId", 0);
        setField(term5276, term5276.getClass(), "goodsName", null);
        setIntField(term5276, term5276.getClass(), "customerId", 0);
        setIntField(term5276, term5276.getClass(), "quantity", 0);
        setDoubleField(term5276, term5276.getClass(), "amountPayable", 0.0);
        setDoubleField(term5276, term5276.getClass(), "amountPaid", 0.0);
        setDoubleField(term5276, term5276.getClass(), "change", 0.0);
        setIntField(term5276, term5276.getClass(), "point", 0);
        setField(term5276, term5276.getClass(), "salesTime", null);
        setField(term5276, term5276.getClass(), "state", null);
        term5285 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5285;
        callMethod(klass, "setId", argTypes, term5276, args);
    }

};


