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

public class Stock_equals_8730090706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3025;
     Object term3098;

    public Stock_equals_8730090706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3140 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term3139 = ((Class) term3140).getDeclaredField((String) "CHF");
        ((Field) term3139).setAccessible(true);
        Object enum8 = ((Field) term3139).get((Object) null);
        term3025 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term3025, term3025.getClass(), "ticker", "AijpHYOFuy");
        setField(term3025, term3025.getClass(), "figi", "SbAoxhfrkn");
        setField(term3025, term3025.getClass(), "name", "kuTXqwMtDB");
        setField(term3025, term3025.getClass(), "type", "Ghbwtircqb");
        setField(term3025, term3025.getClass(), "currency", enum8);
        setField(term3025, term3025.getClass(), "source", "xrwlQZdwCp");
        term3098 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3098;
        callMethod(klass, "equals", argTypes, term3025, args);
    }

};


