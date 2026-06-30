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

public class ExchangeGoods_getState_51652110828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1137;

    public ExchangeGoods_getState_51652110828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1137 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1137, term1137.getClass(), "id", 0);
        setIntField(term1137, term1137.getClass(), "goodsId", 0);
        setField(term1137, term1137.getClass(), "goodsName", null);
        setIntField(term1137, term1137.getClass(), "customerId", 0);
        setIntField(term1137, term1137.getClass(), "orderId", 0);
        setField(term1137, term1137.getClass(), "exchangeTime", null);
        setField(term1137, term1137.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term1137, args);
    }

};


