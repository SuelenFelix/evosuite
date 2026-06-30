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

public class ExchangeGoods_getGoodsId_5496078553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public ExchangeGoods_getGoodsId_5496078553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term145, term145.getClass(), "id", -1339778481);
        setIntField(term145, term145.getClass(), "goodsId", 1725571209);
        setField(term145, term145.getClass(), "goodsName", "SzjVpOQTyS");
        setIntField(term145, term145.getClass(), "customerId", -522618178);
        setIntField(term145, term145.getClass(), "orderId", 1134449235);
        setField(term145, term145.getClass(), "exchangeTime", "MjGYSRKTNF");
        setField(term145, term145.getClass(), "state", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsId", argTypes, term145, args);
    }

};


