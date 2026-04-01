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

public class ExchangeGoods_getOrderId_12365625219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;

    public ExchangeGoods_getOrderId_12365625219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term597, term597.getClass(), "id", -1087774327);
        setIntField(term597, term597.getClass(), "goodsId", -1530420153);
        setField(term597, term597.getClass(), "goodsName", "vrQLuWIDJX");
        setIntField(term597, term597.getClass(), "customerId", -469968304);
        setIntField(term597, term597.getClass(), "orderId", -1145578966);
        setField(term597, term597.getClass(), "exchangeTime", "flxyYxBRtu");
        setField(term597, term597.getClass(), "state", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term597, args);
    }

};


