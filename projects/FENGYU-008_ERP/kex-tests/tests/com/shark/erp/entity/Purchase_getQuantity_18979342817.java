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

public class Purchase_getQuantity_18979342817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;

    public Purchase_getQuantity_18979342817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1467 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1467, term1467.getClass(), "id", 972867650);
        setIntField(term1467, term1467.getClass(), "goodsId", 1655935355);
        setField(term1467, term1467.getClass(), "supplier", "ytSBIKXogI");
        setIntField(term1467, term1467.getClass(), "quantity", -481533957);
        setDoubleField(term1467, term1467.getClass(), "purchasePrice", 0.2641345529914265);
        setField(term1467, term1467.getClass(), "purchaseTime", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term1467, args);
    }

};


