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

public class ReturnGoods_getOrderId_171339595624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3503;

    public ReturnGoods_getOrderId_171339595624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3503 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3503, term3503.getClass(), "id", 0);
        setIntField(term3503, term3503.getClass(), "goodsId", 0);
        setField(term3503, term3503.getClass(), "goodsName", null);
        setIntField(term3503, term3503.getClass(), "customerId", 0);
        setIntField(term3503, term3503.getClass(), "orderId", 0);
        setField(term3503, term3503.getClass(), "returnTime", null);
        setField(term3503, term3503.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term3503, args);
    }

};


