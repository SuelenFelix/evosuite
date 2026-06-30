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

public class ExchangeGoods_setExchangeTime_163469743112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812;

    public ExchangeGoods_setExchangeTime_163469743112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term812 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term812, term812.getClass(), "id", 579005622);
        setIntField(term812, term812.getClass(), "goodsId", -14890619);
        setField(term812, term812.getClass(), "goodsName", "kuTXqwMtDB");
        setIntField(term812, term812.getClass(), "customerId", 1632125673);
        setIntField(term812, term812.getClass(), "orderId", 454281060);
        setField(term812, term812.getClass(), "exchangeTime", "Ghbwtircqb");
        setField(term812, term812.getClass(), "state", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setExchangeTime", argTypes, term812, args);
    }

};


