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

public class ExchangeGoods_setId_115323709517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term1079;

    public ExchangeGoods_setId_115323709517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1074, term1074.getClass(), "id", 0);
        setIntField(term1074, term1074.getClass(), "goodsId", 0);
        setField(term1074, term1074.getClass(), "goodsName", null);
        setIntField(term1074, term1074.getClass(), "customerId", 0);
        setIntField(term1074, term1074.getClass(), "orderId", 0);
        setField(term1074, term1074.getClass(), "exchangeTime", null);
        setField(term1074, term1074.getClass(), "state", null);
        term1079 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1079;
        callMethod(klass, "setId", argTypes, term1074, args);
    }

};


