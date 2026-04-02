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

public class Goods_setGoodsName_20910328976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6349;

    public Goods_setGoodsName_20910328976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6349 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6349, term6349.getClass(), "id", 68922753);
        setField(term6349, term6349.getClass(), "category", "nghfqDXyCG");
        setField(term6349, term6349.getClass(), "goodsName", "WBAOTqErtm");
        setField(term6349, term6349.getClass(), "productionTime", "PqtVXXZMqK");
        setField(term6349, term6349.getClass(), "purchaseTime", "rYbtIDVdnd");
        setField(term6349, term6349.getClass(), "expirationTime", "UKAReurpHG");
        setDoubleField(term6349, term6349.getClass(), "unitPrice", 0.1544348383112728);
        setIntField(term6349, term6349.getClass(), "inventory", -220791533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "setGoodsName", argTypes, term6349, args);
    }

};


