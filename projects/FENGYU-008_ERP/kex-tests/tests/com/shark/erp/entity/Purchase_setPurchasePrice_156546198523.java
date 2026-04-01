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

public class Purchase_setPurchasePrice_156546198523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;
     Object term1843;

    public Purchase_setPurchasePrice_156546198523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1838 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1838, term1838.getClass(), "id", 0);
        setIntField(term1838, term1838.getClass(), "goodsId", 0);
        setField(term1838, term1838.getClass(), "supplier", null);
        setIntField(term1838, term1838.getClass(), "quantity", 0);
        setDoubleField(term1838, term1838.getClass(), "purchasePrice", 0.0);
        setField(term1838, term1838.getClass(), "purchaseTime", null);
        term1843 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1843;
        callMethod(klass, "setPurchasePrice", argTypes, term1838, args);
    }

};


