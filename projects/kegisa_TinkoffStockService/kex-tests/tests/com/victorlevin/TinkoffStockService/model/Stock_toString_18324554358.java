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

public class Stock_toString_18324554358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3804;

    public Stock_toString_18324554358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3918 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term3917 = ((Class) term3918).getDeclaredField((String) "JPY");
        ((Field) term3917).setAccessible(true);
        Object enum10 = ((Field) term3917).get((Object) null);
        term3804 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term3804, term3804.getClass(), "ticker", "gGSMzuGICf");
        setField(term3804, term3804.getClass(), "figi", "hxCBltsObl");
        setField(term3804, term3804.getClass(), "name", "BndsHwAFMv");
        setField(term3804, term3804.getClass(), "type", "GzFkzHGYFt");
        setField(term3804, term3804.getClass(), "currency", enum10);
        setField(term3804, term3804.getClass(), "source", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3804, args);
    }

};


