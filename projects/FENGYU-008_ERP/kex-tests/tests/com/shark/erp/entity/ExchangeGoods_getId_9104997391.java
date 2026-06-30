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

public class ExchangeGoods_getId_9104997391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExchangeGoods_getId_9104997391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setIntField(term1, term1.getClass(), "goodsId", 1162663216);
        setField(term1, term1.getClass(), "goodsName", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "customerId", 1484323161);
        setIntField(term1, term1.getClass(), "orderId", 391863371);
        setField(term1, term1.getClass(), "exchangeTime", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "state", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


