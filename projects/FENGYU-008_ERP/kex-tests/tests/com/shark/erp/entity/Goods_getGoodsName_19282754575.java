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

public class Goods_getGoodsName_19282754575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6235;

    public Goods_getGoodsName_19282754575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6235 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6235, term6235.getClass(), "id", -1422859977);
        setField(term6235, term6235.getClass(), "category", "MHGKyEnwKc");
        setField(term6235, term6235.getClass(), "goodsName", "ShIELyuULw");
        setField(term6235, term6235.getClass(), "productionTime", "IpQuOGMgmj");
        setField(term6235, term6235.getClass(), "purchaseTime", "pJbnHTYrxn");
        setField(term6235, term6235.getClass(), "expirationTime", "iIRsCSYqXH");
        setDoubleField(term6235, term6235.getClass(), "unitPrice", 0.24259014218848696);
        setIntField(term6235, term6235.getClass(), "inventory", -1972436591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsName", argTypes, term6235, args);
    }

};


