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

public class Order_getChange_151497691238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5405;

    public Order_getChange_151497691238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5405 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5405, term5405.getClass(), "id", 0);
        setIntField(term5405, term5405.getClass(), "goodsId", 0);
        setField(term5405, term5405.getClass(), "goodsName", null);
        setIntField(term5405, term5405.getClass(), "customerId", 0);
        setIntField(term5405, term5405.getClass(), "quantity", 0);
        setDoubleField(term5405, term5405.getClass(), "amountPayable", 0.0);
        setDoubleField(term5405, term5405.getClass(), "amountPaid", 0.0);
        setDoubleField(term5405, term5405.getClass(), "change", 0.0);
        setIntField(term5405, term5405.getClass(), "point", 0);
        setField(term5405, term5405.getClass(), "salesTime", null);
        setField(term5405, term5405.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChange", argTypes, term5405, args);
    }

};


