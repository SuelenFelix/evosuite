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

public class Stock_getTicker_40786983310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4581;

    public Stock_getTicker_40786983310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4581 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term4581, term4581.getClass(), "ticker", null);
        setField(term4581, term4581.getClass(), "figi", null);
        setField(term4581, term4581.getClass(), "name", null);
        setField(term4581, term4581.getClass(), "type", null);
        setField(term4581, term4581.getClass(), "currency", null);
        setField(term4581, term4581.getClass(), "source", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTicker", argTypes, term4581, args);
    }

};


