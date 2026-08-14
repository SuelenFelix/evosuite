package com.victorlevin.TinkoffStockService.controller;

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
import static com.victorlevin.TinkoffStockService.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StockController_getStocksByTickers_11496834066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;

    public StockController_getStocksByTickers_11496834066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.controller.StockController"));
        setField(term236, term236.getClass(), "stockService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.controller.StockController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getStocksByTickers", argTypes, term236, args);
    }

};


