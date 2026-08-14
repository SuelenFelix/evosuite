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

public class StocksPricesDto_hashCode_8138743612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4768;

    public StocksPricesDto_hashCode_8138743612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4773 = new Double(0.9828442029246764);
        Object term4771 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4771, term4771.getClass(), "figi", "");
        setField(term4771, term4771.getClass(), "price", term4773);
        Double term4777 = new Double(0.2779719046761513);
        Object term4775 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4775, term4775.getClass(), "figi", "");
        setField(term4775, term4775.getClass(), "price", term4777);
        Double term4781 = new Double(0.6436713023569729);
        Object term4779 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4779, term4779.getClass(), "figi", "");
        setField(term4779, term4779.getClass(), "price", term4781);
        Double term4785 = new Double(0.7332741045694002);
        Object term4783 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4783, term4783.getClass(), "figi", "");
        setField(term4783, term4783.getClass(), "price", term4785);
        Double term4789 = new Double(0.4569171842750229);
        Object term4787 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4787, term4787.getClass(), "figi", "");
        setField(term4787, term4787.getClass(), "price", term4789);
        Double term4793 = new Double(0.8598297828918529);
        Object term4791 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StockPrice"));
        setField(term4791, term4791.getClass(), "figi", "");
        setField(term4791, term4791.getClass(), "price", term4793);
        ArrayList term4769 = new ArrayList();
        ((ArrayList) term4769).add(term4771);
        ((ArrayList) term4769).add(term4775);
        ((ArrayList) term4769).add(term4779);
        ((ArrayList) term4769).add(term4783);
        ((ArrayList) term4769).add(term4787);
        ((ArrayList) term4769).add(term4791);
        term4768 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto"));
        setField(term4768, term4768.getClass(), "prices", term4769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksPricesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4768, args);
    }

};


