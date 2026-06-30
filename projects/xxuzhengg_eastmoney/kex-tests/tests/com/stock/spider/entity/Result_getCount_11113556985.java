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
import java.util.ArrayList;
import java.lang.Object;

public class Result_getCount_11113556985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11486;

    public Result_getCount_11113556985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11514 = newInstance(Class.forName("com.stock.spider.entity.Data"));
        Object term11517 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11521 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11525 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11529 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11533 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11537 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11544 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11548 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11552 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term11514, term11514.getClass(), "industryCode", "");
        setField(term11514, term11514.getClass(), "industryName", "");
        setField(term11517, term11517.getClass(), "intVal", null);
        setIntField(term11517, term11517.getClass(), "scale", 51);
        setIntField(term11517, term11517.getClass(), "precision", 0);
        setField(term11517, term11517.getClass(), "stringCache", null);
        setLongField(term11517, term11517.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "dayIncrease", term11517);
        setField(term11521, term11521.getClass(), "intVal", null);
        setIntField(term11521, term11521.getClass(), "scale", 47);
        setIntField(term11521, term11521.getClass(), "precision", 0);
        setField(term11521, term11521.getClass(), "stringCache", null);
        setLongField(term11521, term11521.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "weekIncrease", term11521);
        setField(term11525, term11525.getClass(), "intVal", null);
        setIntField(term11525, term11525.getClass(), "scale", 52);
        setIntField(term11525, term11525.getClass(), "precision", 0);
        setField(term11525, term11525.getClass(), "stringCache", null);
        setLongField(term11525, term11525.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "monthIncrease", term11525);
        setField(term11529, term11529.getClass(), "intVal", null);
        setIntField(term11529, term11529.getClass(), "scale", 51);
        setIntField(term11529, term11529.getClass(), "precision", 0);
        setField(term11529, term11529.getClass(), "stringCache", null);
        setLongField(term11529, term11529.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "quarterIncrease", term11529);
        setField(term11533, term11533.getClass(), "intVal", null);
        setIntField(term11533, term11533.getClass(), "scale", 53);
        setIntField(term11533, term11533.getClass(), "precision", 0);
        setField(term11533, term11533.getClass(), "stringCache", null);
        setLongField(term11533, term11533.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "halfYearIncrease", term11533);
        setField(term11537, term11537.getClass(), "intVal", null);
        setIntField(term11537, term11537.getClass(), "scale", 51);
        setIntField(term11537, term11537.getClass(), "precision", 0);
        setField(term11537, term11537.getClass(), "stringCache", null);
        setLongField(term11537, term11537.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "yearIncrease", term11537);
        setField(term11514, term11514.getClass(), "line", "");
        setField(term11514, term11514.getClass(), "stockCode", "");
        setField(term11514, term11514.getClass(), "stockName", "");
        setField(term11544, term11544.getClass(), "intVal", null);
        setIntField(term11544, term11544.getClass(), "scale", 53);
        setIntField(term11544, term11544.getClass(), "precision", 0);
        setField(term11544, term11544.getClass(), "stringCache", null);
        setLongField(term11544, term11544.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "tradingVolumeAvg", term11544);
        setField(term11548, term11548.getClass(), "intVal", null);
        setIntField(term11548, term11548.getClass(), "scale", 52);
        setIntField(term11548, term11548.getClass(), "precision", 0);
        setField(term11548, term11548.getClass(), "stringCache", null);
        setLongField(term11548, term11548.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "tradingAmountAvg", term11548);
        setField(term11552, term11552.getClass(), "intVal", null);
        setIntField(term11552, term11552.getClass(), "scale", 53);
        setIntField(term11552, term11552.getClass(), "precision", 0);
        setField(term11552, term11552.getClass(), "stringCache", null);
        setLongField(term11552, term11552.getClass(), "intCompact", -9223372036854775808L);
        setField(term11514, term11514.getClass(), "score", term11552);
        setField(term11514, term11514.getClass(), "profit", "");
        ArrayList term11512 = new ArrayList();
        ((ArrayList) term11512).add(term11514);
        term11486 = newInstance(Class.forName("com.stock.spider.entity.Result"));
        setField(term11486, term11486.getClass(), "code", "EKjQdtKxAM");
        setField(term11486, term11486.getClass(), "msg", "TXZAIPQJHt");
        setIntField(term11486, term11486.getClass(), "count", -1922583790);
        setField(term11486, term11486.getClass(), "data", term11512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term11486, args);
    }

};


