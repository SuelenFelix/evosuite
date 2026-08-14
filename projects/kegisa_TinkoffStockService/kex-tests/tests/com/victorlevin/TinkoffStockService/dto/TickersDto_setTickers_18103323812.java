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
import java.util.LinkedList;
import java.lang.Object;

public class TickersDto_setTickers_18103323812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3624;
     Object term3629;

    public TickersDto_setTickers_18103323812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3625 = new ArrayList();
        term3624 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto"));
        setField(term3624, term3624.getClass(), "tickers", term3625);
        term3629 = new LinkedList();
        ((LinkedList) term3629).add("JDaAnsVTGV");
        ((LinkedList) term3629).add("mLUZFTfjle");
        ((LinkedList) term3629).add("");
        ((LinkedList) term3629).add((Object)null);
        ((LinkedList) term3629).add((Object)null);
        ((LinkedList) term3629).add((Object)null);
        ((LinkedList) term3629).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3629;
        callMethod(klass, "setTickers", argTypes, term3624, args);
    }

};


