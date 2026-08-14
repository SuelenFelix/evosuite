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

public class StocksDto_getStocks_15773074434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3463;

    public StocksDto_getStocks_15773074434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3463 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto"));
        setField(term3463, term3463.getClass(), "stocks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStocks", argTypes, term3463, args);
    }

};


