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

public class Goods_setPurchaseTime_56938833827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7733;

    public Goods_setPurchaseTime_56938833827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7733 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7733, term7733.getClass(), "id", 0);
        setField(term7733, term7733.getClass(), "category", null);
        setField(term7733, term7733.getClass(), "goodsName", null);
        setField(term7733, term7733.getClass(), "productionTime", null);
        setField(term7733, term7733.getClass(), "purchaseTime", null);
        setField(term7733, term7733.getClass(), "expirationTime", null);
        setDoubleField(term7733, term7733.getClass(), "unitPrice", 0.0);
        setIntField(term7733, term7733.getClass(), "inventory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPurchaseTime", argTypes, term7733, args);
    }

};


