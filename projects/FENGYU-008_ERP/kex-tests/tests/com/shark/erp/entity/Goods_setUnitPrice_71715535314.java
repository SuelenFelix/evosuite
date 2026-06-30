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
import java.lang.Double;

public class Goods_setUnitPrice_71715535314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7349;
     Object term7413;

    public Goods_setUnitPrice_71715535314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7349 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7349, term7349.getClass(), "id", 877649659);
        setField(term7349, term7349.getClass(), "category", "tsTGdgQYUL");
        setField(term7349, term7349.getClass(), "goodsName", "TtGbVmKcnX");
        setField(term7349, term7349.getClass(), "productionTime", "GJVkUrCVdD");
        setField(term7349, term7349.getClass(), "purchaseTime", "zNdorvdUgu");
        setField(term7349, term7349.getClass(), "expirationTime", "oPxuZbkYio");
        setDoubleField(term7349, term7349.getClass(), "unitPrice", 0.39286935532362843);
        setIntField(term7349, term7349.getClass(), "inventory", -1332748804);
        term7413 = new Double(0.11577948268926874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7413;
        callMethod(klass, "setUnitPrice", argTypes, term7349, args);
    }

};


