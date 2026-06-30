package com.stock.spider.entity;

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
import static com.stock.spider.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Data_setLine_31892085149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10541;

    public Data_setLine_31892085149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10541 = newInstance(Class.forName("com.stock.spider.entity.Data"));
        setField(term10541, term10541.getClass(), "industryCode", null);
        setField(term10541, term10541.getClass(), "industryName", null);
        setField(term10541, term10541.getClass(), "dayIncrease", null);
        setField(term10541, term10541.getClass(), "weekIncrease", null);
        setField(term10541, term10541.getClass(), "monthIncrease", null);
        setField(term10541, term10541.getClass(), "quarterIncrease", null);
        setField(term10541, term10541.getClass(), "halfYearIncrease", null);
        setField(term10541, term10541.getClass(), "yearIncrease", null);
        setField(term10541, term10541.getClass(), "line", null);
        setField(term10541, term10541.getClass(), "stockCode", null);
        setField(term10541, term10541.getClass(), "stockName", null);
        setField(term10541, term10541.getClass(), "tradingVolumeAvg", null);
        setField(term10541, term10541.getClass(), "tradingAmountAvg", null);
        setField(term10541, term10541.getClass(), "score", null);
        setField(term10541, term10541.getClass(), "profit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLine", argTypes, term10541, args);
    }

};


