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

public class Goods_getId_28869949018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7695;

    public Goods_getId_28869949018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7695 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7695, term7695.getClass(), "id", 0);
        setField(term7695, term7695.getClass(), "category", null);
        setField(term7695, term7695.getClass(), "goodsName", null);
        setField(term7695, term7695.getClass(), "productionTime", null);
        setField(term7695, term7695.getClass(), "purchaseTime", null);
        setField(term7695, term7695.getClass(), "expirationTime", null);
        setDoubleField(term7695, term7695.getClass(), "unitPrice", 0.0);
        setIntField(term7695, term7695.getClass(), "inventory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7695, args);
    }

};


