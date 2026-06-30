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

public class Data_getTradingAmountAvg_49332135056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10548;

    public Data_getTradingAmountAvg_49332135056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10548 = newInstance(Class.forName("com.stock.spider.entity.Data"));
        setField(term10548, term10548.getClass(), "industryCode", null);
        setField(term10548, term10548.getClass(), "industryName", null);
        setField(term10548, term10548.getClass(), "dayIncrease", null);
        setField(term10548, term10548.getClass(), "weekIncrease", null);
        setField(term10548, term10548.getClass(), "monthIncrease", null);
        setField(term10548, term10548.getClass(), "quarterIncrease", null);
        setField(term10548, term10548.getClass(), "halfYearIncrease", null);
        setField(term10548, term10548.getClass(), "yearIncrease", null);
        setField(term10548, term10548.getClass(), "line", null);
        setField(term10548, term10548.getClass(), "stockCode", null);
        setField(term10548, term10548.getClass(), "stockName", null);
        setField(term10548, term10548.getClass(), "tradingVolumeAvg", null);
        setField(term10548, term10548.getClass(), "tradingAmountAvg", null);
        setField(term10548, term10548.getClass(), "score", null);
        setField(term10548, term10548.getClass(), "profit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradingAmountAvg", argTypes, term10548, args);
    }

};


