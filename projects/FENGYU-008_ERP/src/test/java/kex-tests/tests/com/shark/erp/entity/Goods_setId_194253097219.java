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

public class Goods_setId_194253097219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7699;
     Object term7703;

    public Goods_setId_194253097219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7699 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7699, term7699.getClass(), "id", 0);
        setField(term7699, term7699.getClass(), "category", null);
        setField(term7699, term7699.getClass(), "goodsName", null);
        setField(term7699, term7699.getClass(), "productionTime", null);
        setField(term7699, term7699.getClass(), "purchaseTime", null);
        setField(term7699, term7699.getClass(), "expirationTime", null);
        setDoubleField(term7699, term7699.getClass(), "unitPrice", 0.0);
        setIntField(term7699, term7699.getClass(), "inventory", 0);
        term7703 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7703;
        callMethod(klass, "setId", argTypes, term7699, args);
    }

};


