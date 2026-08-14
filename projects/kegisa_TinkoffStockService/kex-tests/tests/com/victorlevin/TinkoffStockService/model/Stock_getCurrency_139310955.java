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

public class Stock_getCurrency_139310955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6402;

    public Stock_getCurrency_139310955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6516 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term6515 = ((Class) term6516).getDeclaredField((String) "GBP");
        ((Field) term6515).setAccessible(true);
        Object enum16 = ((Field) term6515).get((Object) null);
        term6402 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term6402, term6402.getClass(), "ticker", "lFRJFUMVbx");
        setField(term6402, term6402.getClass(), "figi", "sZdUNdggUW");
        setField(term6402, term6402.getClass(), "name", "OqbwYQfvAe");
        setField(term6402, term6402.getClass(), "type", "tRxZafjqIx");
        setField(term6402, term6402.getClass(), "currency", enum16);
        setField(term6402, term6402.getClass(), "source", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term6402, args);
    }

};


