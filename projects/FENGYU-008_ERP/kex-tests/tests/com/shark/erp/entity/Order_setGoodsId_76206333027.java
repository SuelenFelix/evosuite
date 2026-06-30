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

public class Order_setGoodsId_76206333027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5296;
     Object term5305;

    public Order_setGoodsId_76206333027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5296 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5296, term5296.getClass(), "id", 0);
        setIntField(term5296, term5296.getClass(), "goodsId", 0);
        setField(term5296, term5296.getClass(), "goodsName", null);
        setIntField(term5296, term5296.getClass(), "customerId", 0);
        setIntField(term5296, term5296.getClass(), "quantity", 0);
        setDoubleField(term5296, term5296.getClass(), "amountPayable", 0.0);
        setDoubleField(term5296, term5296.getClass(), "amountPaid", 0.0);
        setDoubleField(term5296, term5296.getClass(), "change", 0.0);
        setIntField(term5296, term5296.getClass(), "point", 0);
        setField(term5296, term5296.getClass(), "salesTime", null);
        setField(term5296, term5296.getClass(), "state", null);
        term5305 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5305;
        callMethod(klass, "setGoodsId", argTypes, term5296, args);
    }

};


