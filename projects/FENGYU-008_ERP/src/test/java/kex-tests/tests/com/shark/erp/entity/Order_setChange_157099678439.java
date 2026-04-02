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

public class Order_setChange_157099678439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5414;
     Object term5423;

    public Order_setChange_157099678439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5414 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5414, term5414.getClass(), "id", 0);
        setIntField(term5414, term5414.getClass(), "goodsId", 0);
        setField(term5414, term5414.getClass(), "goodsName", null);
        setIntField(term5414, term5414.getClass(), "customerId", 0);
        setIntField(term5414, term5414.getClass(), "quantity", 0);
        setDoubleField(term5414, term5414.getClass(), "amountPayable", 0.0);
        setDoubleField(term5414, term5414.getClass(), "amountPaid", 0.0);
        setDoubleField(term5414, term5414.getClass(), "change", 0.0);
        setIntField(term5414, term5414.getClass(), "point", 0);
        setField(term5414, term5414.getClass(), "salesTime", null);
        setField(term5414, term5414.getClass(), "state", null);
        term5423 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5423;
        callMethod(klass, "setChange", argTypes, term5414, args);
    }

};


