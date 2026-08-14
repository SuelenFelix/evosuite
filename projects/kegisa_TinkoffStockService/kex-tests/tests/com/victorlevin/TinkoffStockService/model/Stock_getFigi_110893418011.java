package com.victorlevin.TinkoffStockService.model;

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
import static com.victorlevin.TinkoffStockService.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stock_getFigi_110893418011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4582;

    public Stock_getFigi_110893418011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4582 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term4582, term4582.getClass(), "ticker", null);
        setField(term4582, term4582.getClass(), "figi", null);
        setField(term4582, term4582.getClass(), "name", null);
        setField(term4582, term4582.getClass(), "type", null);
        setField(term4582, term4582.getClass(), "currency", null);
        setField(term4582, term4582.getClass(), "source", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFigi", argTypes, term4582, args);
    }

};


