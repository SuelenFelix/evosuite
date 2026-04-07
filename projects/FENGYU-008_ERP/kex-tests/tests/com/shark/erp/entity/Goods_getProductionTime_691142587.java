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

public class Goods_getProductionTime_691142587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6485;

    public Goods_getProductionTime_691142587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6485 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6485, term6485.getClass(), "id", 1741500243);
        setField(term6485, term6485.getClass(), "category", "NTlKJDDWlk");
        setField(term6485, term6485.getClass(), "goodsName", "vOuMEpOQAg");
        setField(term6485, term6485.getClass(), "productionTime", "SIODFGaQhr");
        setField(term6485, term6485.getClass(), "purchaseTime", "qYzsiuXOgS");
        setField(term6485, term6485.getClass(), "expirationTime", "bxrCBbrrct");
        setDoubleField(term6485, term6485.getClass(), "unitPrice", 0.5187846213101265);
        setIntField(term6485, term6485.getClass(), "inventory", -2070466617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionTime", argTypes, term6485, args);
    }

};


