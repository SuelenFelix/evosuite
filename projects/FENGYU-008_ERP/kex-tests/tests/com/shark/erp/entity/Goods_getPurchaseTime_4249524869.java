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

public class Goods_getPurchaseTime_4249524869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6735;

    public Goods_getPurchaseTime_4249524869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6735 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6735, term6735.getClass(), "id", -146054762);
        setField(term6735, term6735.getClass(), "category", "ypEdrstygY");
        setField(term6735, term6735.getClass(), "goodsName", "sNQFlATEeQ");
        setField(term6735, term6735.getClass(), "productionTime", "ZKMLioamsY");
        setField(term6735, term6735.getClass(), "purchaseTime", "WVbxuoDBcn");
        setField(term6735, term6735.getClass(), "expirationTime", "pvDEABOxLt");
        setDoubleField(term6735, term6735.getClass(), "unitPrice", 0.3626177854778667);
        setIntField(term6735, term6735.getClass(), "inventory", 798043553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPurchaseTime", argTypes, term6735, args);
    }

};


