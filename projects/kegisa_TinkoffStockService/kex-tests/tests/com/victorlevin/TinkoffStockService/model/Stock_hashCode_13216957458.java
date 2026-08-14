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

public class Stock_hashCode_13216957458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7570;

    public Stock_hashCode_13216957458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7684 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term7683 = ((Class) term7684).getDeclaredField((String) "TRY");
        ((Field) term7683).setAccessible(true);
        Object enum19 = ((Field) term7683).get((Object) null);
        term7570 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term7570, term7570.getClass(), "ticker", "vGiuZVPJNH");
        setField(term7570, term7570.getClass(), "figi", "tlzpzIjMib");
        setField(term7570, term7570.getClass(), "name", "AZdLeSugwv");
        setField(term7570, term7570.getClass(), "type", "RMsXuyzKJV");
        setField(term7570, term7570.getClass(), "currency", enum19);
        setField(term7570, term7570.getClass(), "source", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7570, args);
    }

};


