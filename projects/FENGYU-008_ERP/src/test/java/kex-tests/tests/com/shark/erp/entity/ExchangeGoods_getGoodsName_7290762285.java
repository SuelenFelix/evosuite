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

public class ExchangeGoods_getGoodsName_7290762285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;

    public ExchangeGoods_getGoodsName_7290762285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term289, term289.getClass(), "id", 1622346318);
        setIntField(term289, term289.getClass(), "goodsId", 1048535127);
        setField(term289, term289.getClass(), "goodsName", "MxlszYVzRf");
        setIntField(term289, term289.getClass(), "customerId", -655067527);
        setIntField(term289, term289.getClass(), "orderId", -6029667);
        setField(term289, term289.getClass(), "exchangeTime", "LQFpaHEwXR");
        setField(term289, term289.getClass(), "state", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsName", argTypes, term289, args);
    }

};


