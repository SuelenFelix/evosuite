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

public class Purchase_getPurchasePrice_176584210522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1833;

    public Purchase_getPurchasePrice_176584210522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1833 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1833, term1833.getClass(), "id", 0);
        setIntField(term1833, term1833.getClass(), "goodsId", 0);
        setField(term1833, term1833.getClass(), "supplier", null);
        setIntField(term1833, term1833.getClass(), "quantity", 0);
        setDoubleField(term1833, term1833.getClass(), "purchasePrice", 0.0);
        setField(term1833, term1833.getClass(), "purchaseTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPurchasePrice", argTypes, term1833, args);
    }

};


