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

public class Goods_setProductionTime_4598800428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6599;

    public Goods_setProductionTime_4598800428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6599 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6599, term6599.getClass(), "id", -1127721881);
        setField(term6599, term6599.getClass(), "category", "CKWpJaaaxX");
        setField(term6599, term6599.getClass(), "goodsName", "UBRmXJmfrt");
        setField(term6599, term6599.getClass(), "productionTime", "WZzvmIHhzZ");
        setField(term6599, term6599.getClass(), "purchaseTime", "doQLHkjpNm");
        setField(term6599, term6599.getClass(), "expirationTime", "lCyLIcSuom");
        setDoubleField(term6599, term6599.getClass(), "unitPrice", 0.045893173090043815);
        setIntField(term6599, term6599.getClass(), "inventory", 1074848808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CGOpQSZZwI";
        callMethod(klass, "setProductionTime", argTypes, term6599, args);
    }

};


