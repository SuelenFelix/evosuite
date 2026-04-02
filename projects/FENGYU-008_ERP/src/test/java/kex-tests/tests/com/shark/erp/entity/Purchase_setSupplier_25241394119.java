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

public class Purchase_setSupplier_25241394119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816;

    public Purchase_setSupplier_25241394119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1816 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1816, term1816.getClass(), "id", 0);
        setIntField(term1816, term1816.getClass(), "goodsId", 0);
        setField(term1816, term1816.getClass(), "supplier", null);
        setIntField(term1816, term1816.getClass(), "quantity", 0);
        setDoubleField(term1816, term1816.getClass(), "purchasePrice", 0.0);
        setField(term1816, term1816.getClass(), "purchaseTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSupplier", argTypes, term1816, args);
    }

};


