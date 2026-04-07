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

public class ExchangeGoods_setState_9285269229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142;

    public ExchangeGoods_setState_9285269229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1142 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1142, term1142.getClass(), "id", 0);
        setIntField(term1142, term1142.getClass(), "goodsId", 0);
        setField(term1142, term1142.getClass(), "goodsName", null);
        setIntField(term1142, term1142.getClass(), "customerId", 0);
        setIntField(term1142, term1142.getClass(), "orderId", 0);
        setField(term1142, term1142.getClass(), "exchangeTime", null);
        setField(term1142, term1142.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setState", argTypes, term1142, args);
    }

};


