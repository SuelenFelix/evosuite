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

public class Purchase_setQuantity_112017581521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1826;
     Object term1831;

    public Purchase_setQuantity_112017581521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1826 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1826, term1826.getClass(), "id", 0);
        setIntField(term1826, term1826.getClass(), "goodsId", 0);
        setField(term1826, term1826.getClass(), "supplier", null);
        setIntField(term1826, term1826.getClass(), "quantity", 0);
        setDoubleField(term1826, term1826.getClass(), "purchasePrice", 0.0);
        setField(term1826, term1826.getClass(), "purchaseTime", null);
        term1831 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1831;
        callMethod(klass, "setQuantity", argTypes, term1826, args);
    }

};


