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
import java.util.ArrayList;

public class StockController_getStocksByTickers_11496834062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;
     Object term141;

    public StockController_getStocksByTickers_11496834062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.controller.StockController"));
        setField(term140, term140.getClass(), "stockService", null);
        ArrayList term142 = new ArrayList();
        ((ArrayList) term142).add("SzjVpOQTyS");
        ((ArrayList) term142).add("MjGYSRKTNF");
        ((ArrayList) term142).add("hRNSzYYIrc");
        ((ArrayList) term142).add("RMFIsYGgne");
        term141 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto"));
        setField(term141, term141.getClass(), "tickers", term142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.controller.StockController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto");
        Object[] args = new Object[1];
        args[0] = term141;
        callMethod(klass, "getStocksByTickers", argTypes, term140, args);
    }

};


