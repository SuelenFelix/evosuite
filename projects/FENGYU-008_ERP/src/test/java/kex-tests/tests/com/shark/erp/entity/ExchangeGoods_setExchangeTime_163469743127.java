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

public class ExchangeGoods_setExchangeTime_163469743127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1132;

    public ExchangeGoods_setExchangeTime_163469743127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1132 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1132, term1132.getClass(), "id", 0);
        setIntField(term1132, term1132.getClass(), "goodsId", 0);
        setField(term1132, term1132.getClass(), "goodsName", null);
        setIntField(term1132, term1132.getClass(), "customerId", 0);
        setIntField(term1132, term1132.getClass(), "orderId", 0);
        setField(term1132, term1132.getClass(), "exchangeTime", null);
        setField(term1132, term1132.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExchangeTime", argTypes, term1132, args);
    }

};


