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

public class Order_setChange_157099678416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4694;
     Object term4739;

    public Order_setChange_157099678416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4694 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4694, term4694.getClass(), "id", 49950830);
        setIntField(term4694, term4694.getClass(), "goodsId", -525257914);
        setField(term4694, term4694.getClass(), "goodsName", "ekxGuOYIwi");
        setIntField(term4694, term4694.getClass(), "customerId", 147209682);
        setIntField(term4694, term4694.getClass(), "quantity", 34470066);
        setDoubleField(term4694, term4694.getClass(), "amountPayable", 0.3227335400819148);
        setDoubleField(term4694, term4694.getClass(), "amountPaid", 0.43337207054070237);
        setDoubleField(term4694, term4694.getClass(), "change", 0.13246999699526574);
        setIntField(term4694, term4694.getClass(), "point", 2058711405);
        setField(term4694, term4694.getClass(), "salesTime", "RbVQXSpxXy");
        setField(term4694, term4694.getClass(), "state", "YpJbIgJWWv");
        term4739 = new Double(0.9126850255993704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4739;
        callMethod(klass, "setChange", argTypes, term4694, args);
    }

};


