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

public class FigiesDto_setFigies_788226932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;
     Object term169;

    public FigiesDto_setFigies_788226932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term117 = new ArrayList();
        ((ArrayList) term117).add("EGtDIRbSSb");
        ((ArrayList) term117).add("SzjVpOQTyS");
        ((ArrayList) term117).add("MjGYSRKTNF");
        ((ArrayList) term117).add("hRNSzYYIrc");
        term116 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.dto.FigiesDto"));
        setField(term116, term116.getClass(), "figies", term117);
        term169 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.dto.FigiesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term169;
        callMethod(klass, "setFigies", argTypes, term116, args);
    }

};


