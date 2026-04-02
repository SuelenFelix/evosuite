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

public class Goods_setPurchaseTime_56938833810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6849;

    public Goods_setPurchaseTime_56938833810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6849 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6849, term6849.getClass(), "id", 533197381);
        setField(term6849, term6849.getClass(), "category", "beAMpkroCQ");
        setField(term6849, term6849.getClass(), "goodsName", "uSUvKAyuvd");
        setField(term6849, term6849.getClass(), "productionTime", "onQLVONGuf");
        setField(term6849, term6849.getClass(), "purchaseTime", "SOrEHbcbmn");
        setField(term6849, term6849.getClass(), "expirationTime", "bnsyeQXFdu");
        setDoubleField(term6849, term6849.getClass(), "unitPrice", 0.3163771663728089);
        setIntField(term6849, term6849.getClass(), "inventory", 1048271679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BwtdjiefJn";
        callMethod(klass, "setPurchaseTime", argTypes, term6849, args);
    }

};


