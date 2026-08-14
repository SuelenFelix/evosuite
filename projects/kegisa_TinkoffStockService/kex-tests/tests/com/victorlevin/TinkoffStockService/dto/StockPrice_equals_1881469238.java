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

public class StockPrice_equals_1881469238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3863;

    public StockPrice_equals_1881469238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3863 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3863, term3863.getClass(), "figi", null);
        setField(term3863, term3863.getClass(), "price", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term3863, args);
    }

};


