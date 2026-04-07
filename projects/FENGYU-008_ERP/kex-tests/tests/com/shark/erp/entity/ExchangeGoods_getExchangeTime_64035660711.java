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

public class ExchangeGoods_getExchangeTime_64035660711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public ExchangeGoods_getExchangeTime_64035660711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term741, term741.getClass(), "id", 1876565163);
        setIntField(term741, term741.getClass(), "goodsId", -817164822);
        setField(term741, term741.getClass(), "goodsName", "dWRymuLBtr");
        setIntField(term741, term741.getClass(), "customerId", -1016503459);
        setIntField(term741, term741.getClass(), "orderId", -1968847291);
        setField(term741, term741.getClass(), "exchangeTime", "AijpHYOFuy");
        setField(term741, term741.getClass(), "state", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExchangeTime", argTypes, term741, args);
    }

};


