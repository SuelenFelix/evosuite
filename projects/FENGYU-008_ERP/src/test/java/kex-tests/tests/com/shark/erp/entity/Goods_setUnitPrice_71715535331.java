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

public class Goods_setUnitPrice_71715535331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7749;
     Object term7753;

    public Goods_setUnitPrice_71715535331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7749 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7749, term7749.getClass(), "id", 0);
        setField(term7749, term7749.getClass(), "category", null);
        setField(term7749, term7749.getClass(), "goodsName", null);
        setField(term7749, term7749.getClass(), "productionTime", null);
        setField(term7749, term7749.getClass(), "purchaseTime", null);
        setField(term7749, term7749.getClass(), "expirationTime", null);
        setDoubleField(term7749, term7749.getClass(), "unitPrice", 0.0);
        setIntField(term7749, term7749.getClass(), "inventory", 0);
        term7753 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7753;
        callMethod(klass, "setUnitPrice", argTypes, term7749, args);
    }

};


