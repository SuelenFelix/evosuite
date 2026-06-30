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

public class Purchase_getSupplier_18387563815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1347;

    public Purchase_getSupplier_18387563815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1347 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1347, term1347.getClass(), "id", 335112684);
        setIntField(term1347, term1347.getClass(), "goodsId", 1551099402);
        setField(term1347, term1347.getClass(), "supplier", "JDswTTCZHV");
        setIntField(term1347, term1347.getClass(), "quantity", -2027534003);
        setDoubleField(term1347, term1347.getClass(), "purchasePrice", 0.28570734989730284);
        setField(term1347, term1347.getClass(), "purchaseTime", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupplier", argTypes, term1347, args);
    }

};


