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

public class Purchase_getSupplier_183875638118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811;

    public Purchase_getSupplier_183875638118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1811, term1811.getClass(), "id", 0);
        setIntField(term1811, term1811.getClass(), "goodsId", 0);
        setField(term1811, term1811.getClass(), "supplier", null);
        setIntField(term1811, term1811.getClass(), "quantity", 0);
        setDoubleField(term1811, term1811.getClass(), "purchasePrice", 0.0);
        setField(term1811, term1811.getClass(), "purchaseTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupplier", argTypes, term1811, args);
    }

};


