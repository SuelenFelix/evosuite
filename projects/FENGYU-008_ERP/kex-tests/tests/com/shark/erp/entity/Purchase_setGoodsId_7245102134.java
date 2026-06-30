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

public class Purchase_setGoodsId_7245102134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1296;
     Object term1325;

    public Purchase_setGoodsId_7245102134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1296 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1296, term1296.getClass(), "id", 287287233);
        setIntField(term1296, term1296.getClass(), "goodsId", 962840079);
        setField(term1296, term1296.getClass(), "supplier", "UiUYnPrcCi");
        setIntField(term1296, term1296.getClass(), "quantity", 1540719661);
        setDoubleField(term1296, term1296.getClass(), "purchasePrice", 0.544608645520025);
        setField(term1296, term1296.getClass(), "purchaseTime", "UoYtihxVaS");
        term1325 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1325;
        callMethod(klass, "setGoodsId", argTypes, term1296, args);
    }

};


