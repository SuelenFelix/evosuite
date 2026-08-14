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
import java.util.LinkedList;

public class StocksDto_setStocks_18942600251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1155;
     Object term1206;

    public StocksDto_setStocks_18942600251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1348 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term1347 = ((Class) term1348).getDeclaredField((String) "RUB");
        ((Field) term1347).setAccessible(true);
        Object enum3 = ((Field) term1347).get((Object) null);
        Object term1158 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1158, term1158.getClass(), "ticker", "");
        setField(term1158, term1158.getClass(), "figi", "");
        setField(term1158, term1158.getClass(), "name", "");
        setField(term1158, term1158.getClass(), "type", "");
        setField(term1158, term1158.getClass(), "currency", enum3);
        setField(term1158, term1158.getClass(), "source", "");
        Class<? extends Object> term1614 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term1613 = ((Class) term1614).getDeclaredField((String) "CHF");
        ((Field) term1613).setAccessible(true);
        Object enum4 = ((Field) term1613).get((Object) null);
        Object term1166 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1166, term1166.getClass(), "ticker", "");
        setField(term1166, term1166.getClass(), "figi", "");
        setField(term1166, term1166.getClass(), "name", "");
        setField(term1166, term1166.getClass(), "type", "");
        setField(term1166, term1166.getClass(), "currency", enum4);
        setField(term1166, term1166.getClass(), "source", "");
        Class<? extends Object> term1880 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term1879 = ((Class) term1880).getDeclaredField((String) "CNY");
        ((Field) term1879).setAccessible(true);
        Object enum5 = ((Field) term1879).get((Object) null);
        Object term1174 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1174, term1174.getClass(), "ticker", "");
        setField(term1174, term1174.getClass(), "figi", "");
        setField(term1174, term1174.getClass(), "name", "");
        setField(term1174, term1174.getClass(), "type", "");
        setField(term1174, term1174.getClass(), "currency", enum5);
        setField(term1174, term1174.getClass(), "source", "");
        Class<? extends Object> term2146 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term2145 = ((Class) term2146).getDeclaredField((String) "CNY");
        ((Field) term2145).setAccessible(true);
        Object enum6 = ((Field) term2145).get((Object) null);
        Object term1182 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1182, term1182.getClass(), "ticker", "");
        setField(term1182, term1182.getClass(), "figi", "");
        setField(term1182, term1182.getClass(), "name", "");
        setField(term1182, term1182.getClass(), "type", "");
        setField(term1182, term1182.getClass(), "currency", enum6);
        setField(term1182, term1182.getClass(), "source", "");
        Object term1190 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1190, term1190.getClass(), "ticker", "");
        setField(term1190, term1190.getClass(), "figi", "");
        setField(term1190, term1190.getClass(), "name", "");
        setField(term1190, term1190.getClass(), "type", "");
        setField(term1190, term1190.getClass(), "currency", enum3);
        setField(term1190, term1190.getClass(), "source", "");
        Class<? extends Object> term2412 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term2411 = ((Class) term2412).getDeclaredField((String) "RUB");
        ((Field) term2411).setAccessible(true);
        Object enum7 = ((Field) term2411).get((Object) null);
        Object term1196 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1196, term1196.getClass(), "ticker", "");
        setField(term1196, term1196.getClass(), "figi", "");
        setField(term1196, term1196.getClass(), "name", "");
        setField(term1196, term1196.getClass(), "type", "");
        setField(term1196, term1196.getClass(), "currency", enum7);
        setField(term1196, term1196.getClass(), "source", "");
        ArrayList term1156 = new ArrayList();
        ((ArrayList) term1156).add(term1158);
        ((ArrayList) term1156).add(term1166);
        ((ArrayList) term1156).add(term1174);
        ((ArrayList) term1156).add(term1182);
        ((ArrayList) term1156).add(term1190);
        ((ArrayList) term1156).add(term1196);
        term1155 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto"));
        setField(term1155, term1155.getClass(), "stocks", term1156);
        Class<? extends Object> term2718 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term2717 = ((Class) term2718).getDeclaredField((String) "RUB");
        ((Field) term2717).setAccessible(true);
        Object enum8 = ((Field) term2717).get((Object) null);
        Object term1209 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1209, term1209.getClass(), "ticker", "nHXjMycHlU");
        setField(term1209, term1209.getClass(), "figi", "ieCtQFdkii");
        setField(term1209, term1209.getClass(), "name", "dEnhdmILtU");
        setField(term1209, term1209.getClass(), "type", "hoicvmsovO");
        setField(term1209, term1209.getClass(), "currency", enum8);
        setField(term1209, term1209.getClass(), "source", "eqJfYWRaEL");
        Object term1275 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1275, term1275.getClass(), "ticker", "");
        setField(term1275, term1275.getClass(), "figi", "");
        setField(term1275, term1275.getClass(), "name", "");
        setField(term1275, term1275.getClass(), "type", "");
        setField(term1275, term1275.getClass(), "currency", enum6);
        setField(term1275, term1275.getClass(), "source", "");
        Object term1282 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1282, term1282.getClass(), "ticker", null);
        setField(term1282, term1282.getClass(), "figi", null);
        setField(term1282, term1282.getClass(), "name", null);
        setField(term1282, term1282.getClass(), "type", null);
        setField(term1282, term1282.getClass(), "currency", enum4);
        setField(term1282, term1282.getClass(), "source", null);
        term1206 = new LinkedList();
        ((LinkedList) term1206).add(term1209);
        ((LinkedList) term1206).add(term1275);
        ((LinkedList) term1206).add(term1282);
        ((LinkedList) term1206).add((Object)null);
        ((LinkedList) term1206).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.StocksDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1206;
        callMethod(klass, "setStocks", argTypes, term1155, args);
    }

};


