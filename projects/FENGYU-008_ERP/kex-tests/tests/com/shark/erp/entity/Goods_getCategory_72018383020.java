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

public class Goods_getCategory_72018383020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7705;

    public Goods_getCategory_72018383020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7705 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7705, term7705.getClass(), "id", 0);
        setField(term7705, term7705.getClass(), "category", null);
        setField(term7705, term7705.getClass(), "goodsName", null);
        setField(term7705, term7705.getClass(), "productionTime", null);
        setField(term7705, term7705.getClass(), "purchaseTime", null);
        setField(term7705, term7705.getClass(), "expirationTime", null);
        setDoubleField(term7705, term7705.getClass(), "unitPrice", 0.0);
        setIntField(term7705, term7705.getClass(), "inventory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term7705, args);
    }

};


