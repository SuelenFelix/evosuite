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
import java.lang.Double;

public class StocksPricesDto_equals_3651876862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3880;
     Object term3897;

    public StocksPricesDto_equals_3651876862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3885 = new Double(0.6076495596892013);
        Object term3883 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3883, term3883.getClass(), "figi", "");
        setField(term3883, term3883.getClass(), "price", term3885);
        Double term3889 = new Double(0.37773193782763337);
        Object term3887 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3887, term3887.getClass(), "figi", "");
        setField(term3887, term3887.getClass(), "price", term3889);
        Double term3893 = new Double(0.8474802076607362);
        Object term3891 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term3891, term3891.getClass(), "figi", "");
        setField(term3891, term3891.getClass(), "price", term3893);
        ArrayList term3881 = new ArrayList();
        ((ArrayList) term3881).add(term3883);
        ((ArrayList) term3881).add(term3887);
        ((ArrayList) term3881).add(term3891);
        term3880 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto"));
        setField(term3880, term3880.getClass(), "prices", term3881);
        term3897 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3897;
        callMethod(klass, "equals", argTypes, term3880, args);
    }

};


