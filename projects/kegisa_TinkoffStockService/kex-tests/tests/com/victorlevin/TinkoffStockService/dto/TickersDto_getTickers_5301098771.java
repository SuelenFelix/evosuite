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

public class TickersDto_getTickers_5301098771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3465;

    public TickersDto_getTickers_5301098771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3466 = new ArrayList();
        ((ArrayList) term3466).add("mXGCWJDOqA");
        ((ArrayList) term3466).add("dpNsDgfPso");
        ((ArrayList) term3466).add("hCWPJQKpdc");
        ((ArrayList) term3466).add("WzMEhMXkKx");
        ((ArrayList) term3466).add("XOiDvlDhdc");
        ((ArrayList) term3466).add("AdxvLJhNLe");
        ((ArrayList) term3466).add("lHfTrWKMPk");
        term3465 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto"));
        setField(term3465, term3465.getClass(), "tickers", term3466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTickers", argTypes, term3465, args);
    }

};


