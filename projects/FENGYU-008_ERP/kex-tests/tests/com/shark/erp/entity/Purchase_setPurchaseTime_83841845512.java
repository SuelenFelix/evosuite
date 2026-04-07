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

public class Purchase_setPurchaseTime_83841845512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1716;

    public Purchase_setPurchaseTime_83841845512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1716 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1716, term1716.getClass(), "id", -1034506028);
        setIntField(term1716, term1716.getClass(), "goodsId", -1263114719);
        setField(term1716, term1716.getClass(), "supplier", "tPlsykYBqO");
        setIntField(term1716, term1716.getClass(), "quantity", -894662986);
        setDoubleField(term1716, term1716.getClass(), "purchasePrice", 0.7655020693602768);
        setField(term1716, term1716.getClass(), "purchaseTime", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "whBvTVIIlC";
        callMethod(klass, "setPurchaseTime", argTypes, term1716, args);
    }

};


