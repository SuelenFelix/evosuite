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

public class Goods_getCategory_7201838303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5985;

    public Goods_getCategory_7201838303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5985 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term5985, term5985.getClass(), "id", 1295839803);
        setField(term5985, term5985.getClass(), "category", "qCpEbQDHdF");
        setField(term5985, term5985.getClass(), "goodsName", "AHbZyFOmlo");
        setField(term5985, term5985.getClass(), "productionTime", "TwfWVQGiIj");
        setField(term5985, term5985.getClass(), "purchaseTime", "gUvcueTURF");
        setField(term5985, term5985.getClass(), "expirationTime", "EwQBhZjCIT");
        setDoubleField(term5985, term5985.getClass(), "unitPrice", 0.53094494792755);
        setIntField(term5985, term5985.getClass(), "inventory", -1891015523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term5985, args);
    }

};


