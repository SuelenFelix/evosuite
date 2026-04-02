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

public class Order_setQuantity_115772893233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5354;
     Object term5363;

    public Order_setQuantity_115772893233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5354 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5354, term5354.getClass(), "id", 0);
        setIntField(term5354, term5354.getClass(), "goodsId", 0);
        setField(term5354, term5354.getClass(), "goodsName", null);
        setIntField(term5354, term5354.getClass(), "customerId", 0);
        setIntField(term5354, term5354.getClass(), "quantity", 0);
        setDoubleField(term5354, term5354.getClass(), "amountPayable", 0.0);
        setDoubleField(term5354, term5354.getClass(), "amountPaid", 0.0);
        setDoubleField(term5354, term5354.getClass(), "change", 0.0);
        setIntField(term5354, term5354.getClass(), "point", 0);
        setField(term5354, term5354.getClass(), "salesTime", null);
        setField(term5354, term5354.getClass(), "state", null);
        term5363 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5363;
        callMethod(klass, "setQuantity", argTypes, term5354, args);
    }

};


