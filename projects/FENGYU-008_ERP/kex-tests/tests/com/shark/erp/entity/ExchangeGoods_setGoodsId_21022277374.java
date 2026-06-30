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

public class ExchangeGoods_setGoodsId_21022277374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term257;

    public ExchangeGoods_setGoodsId_21022277374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term216, term216.getClass(), "id", -883034806);
        setIntField(term216, term216.getClass(), "goodsId", 1585847225);
        setField(term216, term216.getClass(), "goodsName", "RMFIsYGgne");
        setIntField(term216, term216.getClass(), "customerId", 597278769);
        setIntField(term216, term216.getClass(), "orderId", -1685132342);
        setField(term216, term216.getClass(), "exchangeTime", "NRdvgJlhkX");
        setField(term216, term216.getClass(), "state", "uuaPigETmJ");
        term257 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257;
        callMethod(klass, "setGoodsId", argTypes, term216, args);
    }

};


