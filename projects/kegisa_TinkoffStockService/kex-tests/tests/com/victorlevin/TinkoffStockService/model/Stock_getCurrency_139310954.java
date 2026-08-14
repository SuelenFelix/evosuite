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

public class Stock_getCurrency_139310954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2247;

    public Stock_getCurrency_139310954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2361 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term2360 = ((Class) term2361).getDeclaredField((String) "JPY");
        ((Field) term2360).setAccessible(true);
        Object enum6 = ((Field) term2360).get((Object) null);
        term2247 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term2247, term2247.getClass(), "ticker", "xOEqzGAmDU");
        setField(term2247, term2247.getClass(), "figi", "eZFUvlxvGV");
        setField(term2247, term2247.getClass(), "name", "BYqFIqCKAV");
        setField(term2247, term2247.getClass(), "type", "vrQLuWIDJX");
        setField(term2247, term2247.getClass(), "currency", enum6);
        setField(term2247, term2247.getClass(), "source", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term2247, args);
    }

};


