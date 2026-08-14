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

public class Stock_equals_8730090707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7180;
     Object term7253;

    public Stock_equals_8730090707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7295 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term7294 = ((Class) term7295).getDeclaredField((String) "USD");
        ((Field) term7294).setAccessible(true);
        Object enum18 = ((Field) term7294).get((Object) null);
        term7180 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term7180, term7180.getClass(), "ticker", "iikZEapDlu");
        setField(term7180, term7180.getClass(), "figi", "nhoHrZfnIN");
        setField(term7180, term7180.getClass(), "name", "ZkMALXpEAZ");
        setField(term7180, term7180.getClass(), "type", "tXfQjSqDzN");
        setField(term7180, term7180.getClass(), "currency", enum18);
        setField(term7180, term7180.getClass(), "source", "BjugTaMcxJ");
        term7253 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7253;
        callMethod(klass, "equals", argTypes, term7180, args);
    }

};


