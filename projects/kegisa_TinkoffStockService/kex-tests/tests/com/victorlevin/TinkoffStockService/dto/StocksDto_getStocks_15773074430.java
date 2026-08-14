package com.victorlevin.TinkoffStockService.dto;

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
import static com.victorlevin.TinkoffStockService.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class StocksDto_getStocks_15773074430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;

    public StocksDto_getStocks_15773074430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term358 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term357 = ((Class) term358).getDeclaredField((String) "RUB");
        ((Field) term357).setAccessible(true);
        Object enum0 = ((Field) term357).get((Object) null);
        Object term217 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term217, term217.getClass(), "ticker", "");
        setField(term217, term217.getClass(), "figi", "");
        setField(term217, term217.getClass(), "name", "");
        setField(term217, term217.getClass(), "type", "");
        setField(term217, term217.getClass(), "currency", enum0);
        setField(term217, term217.getClass(), "source", "");
        Class<? extends Object> term624 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term623 = ((Class) term624).getDeclaredField((String) "JPY");
        ((Field) term623).setAccessible(true);
        Object enum1 = ((Field) term623).get((Object) null);
        Object term225 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term225, term225.getClass(), "ticker", "");
        setField(term225, term225.getClass(), "figi", "");
        setField(term225, term225.getClass(), "name", "");
        setField(term225, term225.getClass(), "type", "");
        setField(term225, term225.getClass(), "currency", enum1);
        setField(term225, term225.getClass(), "source", "");
        Object term233 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term233, term233.getClass(), "ticker", "");
        setField(term233, term233.getClass(), "figi", "");
        setField(term233, term233.getClass(), "name", "");
        setField(term233, term233.getClass(), "type", "");
        setField(term233, term233.getClass(), "currency", enum0);
        setField(term233, term233.getClass(), "source", "");
        Class<? extends Object> term890 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term889 = ((Class) term890).getDeclaredField((String) "GBP");
        ((Field) term889).setAccessible(true);
        Object enum2 = ((Field) term889).get((Object) null);
        Object term239 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term239, term239.getClass(), "ticker", "");
        setField(term239, term239.getClass(), "figi", "");
        setField(term239, term239.getClass(), "name", "");
        setField(term239, term239.getClass(), "type", "");
        setField(term239, term239.getClass(), "currency", enum2);
        setField(term239, term239.getClass(), "source", "");
        ArrayList term215 = new ArrayList();
        ((ArrayList) term215).add(term217);
        ((ArrayList) term215).add(term225);
        ((ArrayList) term215).add(term233);
        ((ArrayList) term215).add(term239);
        term214 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto"));
        setField(term214, term214.getClass(), "stocks", term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStocks", argTypes, term214, args);
    }

};


