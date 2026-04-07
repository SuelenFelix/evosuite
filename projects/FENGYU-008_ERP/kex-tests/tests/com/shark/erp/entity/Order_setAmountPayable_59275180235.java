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
import java.lang.Double;

public class Order_setAmountPayable_59275180235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5374;
     Object term5383;

    public Order_setAmountPayable_59275180235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5374 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5374, term5374.getClass(), "id", 0);
        setIntField(term5374, term5374.getClass(), "goodsId", 0);
        setField(term5374, term5374.getClass(), "goodsName", null);
        setIntField(term5374, term5374.getClass(), "customerId", 0);
        setIntField(term5374, term5374.getClass(), "quantity", 0);
        setDoubleField(term5374, term5374.getClass(), "amountPayable", 0.0);
        setDoubleField(term5374, term5374.getClass(), "amountPaid", 0.0);
        setDoubleField(term5374, term5374.getClass(), "change", 0.0);
        setIntField(term5374, term5374.getClass(), "point", 0);
        setField(term5374, term5374.getClass(), "salesTime", null);
        setField(term5374, term5374.getClass(), "state", null);
        term5383 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5383;
        callMethod(klass, "setAmountPayable", argTypes, term5374, args);
    }

};


