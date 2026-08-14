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

public class StocksPricesDto_toString_13246340513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4797;

    public StocksPricesDto_toString_13246340513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4802 = new Double(0.43692187681405226);
        Object term4800 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4800, term4800.getClass(), "figi", "");
        setField(term4800, term4800.getClass(), "price", term4802);
        Double term4806 = new Double(0.7633268466829064);
        Object term4804 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4804, term4804.getClass(), "figi", "");
        setField(term4804, term4804.getClass(), "price", term4806);
        ArrayList term4798 = new ArrayList();
        ((ArrayList) term4798).add(term4800);
        ((ArrayList) term4798).add(term4804);
        term4797 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto"));
        setField(term4797, term4797.getClass(), "prices", term4798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4797, args);
    }

};


