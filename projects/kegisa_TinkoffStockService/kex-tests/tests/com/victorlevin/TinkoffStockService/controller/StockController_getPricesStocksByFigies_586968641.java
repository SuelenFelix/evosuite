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

public class StockController_getPricesStocksByFigies_586968641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;

    public StockController_getPricesStocksByFigies_586968641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.controller.StockController"));
        setField(term24, term24.getClass(), "stockService", null);
        ArrayList term26 = new ArrayList();
        ((ArrayList) term26).add("sjlJAEtRrb");
        ((ArrayList) term26).add("MuLcgQHgqz");
        ((ArrayList) term26).add("xxtlPwDYFs");
        ((ArrayList) term26).add("jJCZpVmanW");
        ((ArrayList) term26).add("EGtDIRbSSb");
        term25 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.FigiesDto"));
        setField(term25, term25.getClass(), "figies", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.controller.StockController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.victorlevin.TinkoffStockService.dto.FigiesDto");
        Object[] args = new Object[1];
        args[0] = term25;
        callMethod(klass, "getPricesStocksByFigies", argTypes, term24, args);
    }

};


