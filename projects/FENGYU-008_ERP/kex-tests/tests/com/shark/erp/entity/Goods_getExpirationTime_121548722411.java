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

public class Goods_getExpirationTime_121548722411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6985;

    public Goods_getExpirationTime_121548722411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6985 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6985, term6985.getClass(), "id", -1529797673);
        setField(term6985, term6985.getClass(), "category", "jDmhBrIoDa");
        setField(term6985, term6985.getClass(), "goodsName", "SPtPatHeOm");
        setField(term6985, term6985.getClass(), "productionTime", "ywmcuThdfL");
        setField(term6985, term6985.getClass(), "purchaseTime", "GBOEuByOfr");
        setField(term6985, term6985.getClass(), "expirationTime", "NHbOFFjyVK");
        setDoubleField(term6985, term6985.getClass(), "unitPrice", 0.8819646072665548);
        setIntField(term6985, term6985.getClass(), "inventory", -868676396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpirationTime", argTypes, term6985, args);
    }

};


