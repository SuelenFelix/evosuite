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

public class ExchangeGoods_setGoodsName_89183366821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098;

    public ExchangeGoods_setGoodsName_89183366821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1098 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1098, term1098.getClass(), "id", 0);
        setIntField(term1098, term1098.getClass(), "goodsId", 0);
        setField(term1098, term1098.getClass(), "goodsName", null);
        setIntField(term1098, term1098.getClass(), "customerId", 0);
        setIntField(term1098, term1098.getClass(), "orderId", 0);
        setField(term1098, term1098.getClass(), "exchangeTime", null);
        setField(term1098, term1098.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGoodsName", argTypes, term1098, args);
    }

};


