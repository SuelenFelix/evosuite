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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class StocksDto_init_16391423483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2993;

    public StocksDto_init_16391423483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3188 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term3187 = ((Class) term3188).getDeclaredField((String) "CNY");
        ((Field) term3187).setAccessible(true);
        Object enum9 = ((Field) term3187).get((Object) null);
        Object term2996 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term2996, term2996.getClass(), "ticker", "cAPeiZHKGJ");
        setField(term2996, term2996.getClass(), "figi", "LvJFtLBaxj");
        setField(term2996, term2996.getClass(), "name", "PHvxnGHptP");
        setField(term2996, term2996.getClass(), "type", "TimdotUuNC");
        setField(term2996, term2996.getClass(), "currency", enum9);
        setField(term2996, term2996.getClass(), "source", "PkWMRdJcBb");
        Object term3062 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term3062, term3062.getClass(), "ticker", "");
        setField(term3062, term3062.getClass(), "figi", "");
        setField(term3062, term3062.getClass(), "name", "");
        setField(term3062, term3062.getClass(), "type", "");
        setField(term3062, term3062.getClass(), "currency", enum9);
        setField(term3062, term3062.getClass(), "source", "");
        Object term3069 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term3069, term3069.getClass(), "ticker", null);
        setField(term3069, term3069.getClass(), "figi", null);
        setField(term3069, term3069.getClass(), "name", null);
        setField(term3069, term3069.getClass(), "type", null);
        setField(term3069, term3069.getClass(), "currency", null);
        setField(term3069, term3069.getClass(), "source", null);
        term2993 = new LinkedList();
        ((LinkedList) term2993).add(term2996);
        ((LinkedList) term2993).add(term3062);
        ((LinkedList) term2993).add(term3069);
        ((LinkedList) term2993).add((Object)null);
        ((LinkedList) term2993).add((Object)null);
        ((LinkedList) term2993).add((Object)null);
        ((LinkedList) term2993).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2993;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


