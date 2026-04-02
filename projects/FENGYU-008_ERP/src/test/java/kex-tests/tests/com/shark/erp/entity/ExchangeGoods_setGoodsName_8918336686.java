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

public class ExchangeGoods_setGoodsName_8918336686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360;

    public ExchangeGoods_setGoodsName_8918336686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term360, term360.getClass(), "id", -2068769794);
        setIntField(term360, term360.getClass(), "goodsId", -117576464);
        setField(term360, term360.getClass(), "goodsName", "aJlieCFVtF");
        setIntField(term360, term360.getClass(), "customerId", -1007160944);
        setIntField(term360, term360.getClass(), "orderId", 1135664017);
        setField(term360, term360.getClass(), "exchangeTime", "ZiaGIbnzTs");
        setField(term360, term360.getClass(), "state", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setGoodsName", argTypes, term360, args);
    }

};


