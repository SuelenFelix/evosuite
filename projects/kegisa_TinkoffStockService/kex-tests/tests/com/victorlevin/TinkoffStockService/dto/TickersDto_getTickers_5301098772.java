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

public class TickersDto_getTickers_5301098772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3606;

    public TickersDto_getTickers_5301098772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3607 = new ArrayList();
        ((ArrayList) term3607).add("lHfTrWKMPk");
        ((ArrayList) term3607).add("JDaAnsVTGV");
        ((ArrayList) term3607).add("mLUZFTfjle");
        ((ArrayList) term3607).add("xIeFjkHkOe");
        ((ArrayList) term3607).add("SdCKLMIYnX");
        ((ArrayList) term3607).add("OJJtVNPyKZ");
        ((ArrayList) term3607).add("AKNapTAfmD");
        term3606 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto"));
        setField(term3606, term3606.getClass(), "tickers", term3607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.TickersDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTickers", argTypes, term3606, args);
    }

};


