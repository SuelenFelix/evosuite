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

public class Stock_hashCode_13216957457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3415;

    public Stock_hashCode_13216957457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3529 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term3528 = ((Class) term3529).getDeclaredField((String) "RUB");
        ((Field) term3528).setAccessible(true);
        Object enum9 = ((Field) term3528).get((Object) null);
        term3415 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term3415, term3415.getClass(), "ticker", "IDCWpPLRkE");
        setField(term3415, term3415.getClass(), "figi", "nyiiPDVjAc");
        setField(term3415, term3415.getClass(), "name", "aKnKipADSo");
        setField(term3415, term3415.getClass(), "type", "wSQxaModmm");
        setField(term3415, term3415.getClass(), "currency", enum9);
        setField(term3415, term3415.getClass(), "source", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3415, args);
    }

};


