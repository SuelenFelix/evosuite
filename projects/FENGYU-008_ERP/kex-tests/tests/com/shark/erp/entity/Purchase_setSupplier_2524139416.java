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

public class Purchase_setSupplier_2524139416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396;

    public Purchase_setSupplier_2524139416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1396 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1396, term1396.getClass(), "id", 1063420942);
        setIntField(term1396, term1396.getClass(), "goodsId", 1375330971);
        setField(term1396, term1396.getClass(), "supplier", "YRHGsAkhxb");
        setIntField(term1396, term1396.getClass(), "quantity", -478195677);
        setDoubleField(term1396, term1396.getClass(), "purchasePrice", 0.40176586625454525);
        setField(term1396, term1396.getClass(), "purchaseTime", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MLqYREekMl";
        callMethod(klass, "setSupplier", argTypes, term1396, args);
    }

};


