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

public class ExchangeGoods_getId_91049973916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1069;

    public ExchangeGoods_getId_91049973916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1069 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1069, term1069.getClass(), "id", 0);
        setIntField(term1069, term1069.getClass(), "goodsId", 0);
        setField(term1069, term1069.getClass(), "goodsName", null);
        setIntField(term1069, term1069.getClass(), "customerId", 0);
        setIntField(term1069, term1069.getClass(), "orderId", 0);
        setField(term1069, term1069.getClass(), "exchangeTime", null);
        setField(term1069, term1069.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1069, args);
    }

};


