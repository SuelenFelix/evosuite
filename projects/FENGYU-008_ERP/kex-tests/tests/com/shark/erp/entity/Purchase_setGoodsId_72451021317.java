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

public class Purchase_setGoodsId_72451021317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804;
     Object term1809;

    public Purchase_setGoodsId_72451021317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1804 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1804, term1804.getClass(), "id", 0);
        setIntField(term1804, term1804.getClass(), "goodsId", 0);
        setField(term1804, term1804.getClass(), "supplier", null);
        setIntField(term1804, term1804.getClass(), "quantity", 0);
        setDoubleField(term1804, term1804.getClass(), "purchasePrice", 0.0);
        setField(term1804, term1804.getClass(), "purchaseTime", null);
        term1809 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1809;
        callMethod(klass, "setGoodsId", argTypes, term1804, args);
    }

};


