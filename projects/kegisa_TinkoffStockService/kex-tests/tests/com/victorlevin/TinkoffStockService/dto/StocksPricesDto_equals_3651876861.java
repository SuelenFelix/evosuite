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

public class StocksPricesDto_equals_3651876861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4730;
     Object term4767;

    public StocksPricesDto_equals_3651876861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4735 = new Double(0.6076495596892013);
        Object term4733 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4733, term4733.getClass(), "figi", "");
        setField(term4733, term4733.getClass(), "price", term4735);
        Double term4739 = new Double(0.37773193782763337);
        Object term4737 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4737, term4737.getClass(), "figi", "");
        setField(term4737, term4737.getClass(), "price", term4739);
        Double term4743 = new Double(0.8474802076607362);
        Object term4741 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4741, term4741.getClass(), "figi", "");
        setField(term4741, term4741.getClass(), "price", term4743);
        Double term4747 = new Double(0.5183269973490326);
        Object term4745 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4745, term4745.getClass(), "figi", "");
        setField(term4745, term4745.getClass(), "price", term4747);
        Double term4751 = new Double(0.7655020693602768);
        Object term4749 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4749, term4749.getClass(), "figi", "");
        setField(term4749, term4749.getClass(), "price", term4751);
        Double term4755 = new Double(0.1374549299694151);
        Object term4753 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4753, term4753.getClass(), "figi", "");
        setField(term4753, term4753.getClass(), "price", term4755);
        Double term4759 = new Double(0.7031006357544823);
        Object term4757 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4757, term4757.getClass(), "figi", "");
        setField(term4757, term4757.getClass(), "price", term4759);
        Double term4763 = new Double(0.9527281779865117);
        Object term4761 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4761, term4761.getClass(), "figi", "");
        setField(term4761, term4761.getClass(), "price", term4763);
        ArrayList term4731 = new ArrayList();
        ((ArrayList) term4731).add(term4733);
        ((ArrayList) term4731).add(term4737);
        ((ArrayList) term4731).add(term4741);
        ((ArrayList) term4731).add(term4745);
        ((ArrayList) term4731).add(term4749);
        ((ArrayList) term4731).add(term4753);
        ((ArrayList) term4731).add(term4757);
        ((ArrayList) term4731).add(term4761);
        term4730 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto"));
        setField(term4730, term4730.getClass(), "prices", term4731);
        term4767 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4767;
        callMethod(klass, "equals", argTypes, term4730, args);
    }

};


