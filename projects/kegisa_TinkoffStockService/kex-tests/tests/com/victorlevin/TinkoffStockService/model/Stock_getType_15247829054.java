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
import java.lang.String;
import java.lang.Object;

public class Stock_getType_15247829054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6013;

    public Stock_getType_15247829054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6127 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term6126 = ((Class) term6127).getDeclaredField((String) "GBP");
        ((Field) term6126).setAccessible(true);
        Object enum15 = ((Field) term6126).get((Object) null);
        term6013 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term6013, term6013.getClass(), "ticker", "YpJbIgJWWv");
        setField(term6013, term6013.getClass(), "figi", "JppkknKVOw");
        setField(term6013, term6013.getClass(), "name", "iljANwuEjk");
        setField(term6013, term6013.getClass(), "type", "kNqaJKIATy");
        setField(term6013, term6013.getClass(), "currency", enum15);
        setField(term6013, term6013.getClass(), "source", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term6013, args);
    }

};


