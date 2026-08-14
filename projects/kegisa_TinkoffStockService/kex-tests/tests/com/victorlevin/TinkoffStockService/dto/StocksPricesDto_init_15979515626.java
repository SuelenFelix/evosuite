package com.victorlevin.TinkoffStockService.dto;

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
import static com.victorlevin.TinkoffStockService.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Double;

public class StocksPricesDto_init_15979515626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3913;

    public StocksPricesDto_init_15979515626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3929 = new Double(0.7655020693602768);
        Object term3916 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3916, term3916.getClass(), "figi", "EeBVbzjcCI");
        setField(term3916, term3916.getClass(), "price", term3929);
        Double term3934 = new Double(0.1374549299694151);
        Object term3932 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3932, term3932.getClass(), "figi", "");
        setField(term3932, term3932.getClass(), "price", term3934);
        Double term3938 = new Double(0.7031006357544823);
        Object term3937 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3937, term3937.getClass(), "figi", null);
        setField(term3937, term3937.getClass(), "price", term3938);
        term3913 = new LinkedList();
        ((LinkedList) term3913).add(term3916);
        ((LinkedList) term3913).add(term3932);
        ((LinkedList) term3913).add(term3937);
        ((LinkedList) term3913).add((Object)null);
        ((LinkedList) term3913).add((Object)null);
        ((LinkedList) term3913).add((Object)null);
        ((LinkedList) term3913).add((Object)null);
        ((LinkedList) term3913).add((Object)null);
        ((LinkedList) term3913).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3913;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


