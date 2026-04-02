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

public class ExchangeGoods_getState_51652110813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;

    public ExchangeGoods_getState_51652110813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term905 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term905, term905.getClass(), "id", -1786399638);
        setIntField(term905, term905.getClass(), "goodsId", 2055867847);
        setField(term905, term905.getClass(), "goodsName", "nyiiPDVjAc");
        setIntField(term905, term905.getClass(), "customerId", -1048298087);
        setIntField(term905, term905.getClass(), "orderId", 292681826);
        setField(term905, term905.getClass(), "exchangeTime", "aKnKipADSo");
        setField(term905, term905.getClass(), "state", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term905, args);
    }

};


