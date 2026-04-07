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

public class Goods_setInventory_177988380933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7759;
     Object term7763;

    public Goods_setInventory_177988380933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7759 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7759, term7759.getClass(), "id", 0);
        setField(term7759, term7759.getClass(), "category", null);
        setField(term7759, term7759.getClass(), "goodsName", null);
        setField(term7759, term7759.getClass(), "productionTime", null);
        setField(term7759, term7759.getClass(), "purchaseTime", null);
        setField(term7759, term7759.getClass(), "expirationTime", null);
        setDoubleField(term7759, term7759.getClass(), "unitPrice", 0.0);
        setIntField(term7759, term7759.getClass(), "inventory", 0);
        term7763 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7763;
        callMethod(klass, "setInventory", argTypes, term7759, args);
    }

};


