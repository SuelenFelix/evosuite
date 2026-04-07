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

public class ExchangeGoods_setState_9285269214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976;

    public ExchangeGoods_setState_9285269214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term976, term976.getClass(), "id", 458147407);
        setIntField(term976, term976.getClass(), "goodsId", -184153539);
        setField(term976, term976.getClass(), "goodsName", "UlajhuVLaP");
        setIntField(term976, term976.getClass(), "customerId", 493620644);
        setIntField(term976, term976.getClass(), "orderId", 1328271830);
        setField(term976, term976.getClass(), "exchangeTime", "gGSMzuGICf");
        setField(term976, term976.getClass(), "state", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setState", argTypes, term976, args);
    }

};


