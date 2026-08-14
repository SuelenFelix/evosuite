package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tools_maxValue_5106532705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10659;

    public Tools_maxValue_5106532705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10659 = (Object[]) newArray("[D", 5);
        double[] term10660 = (double[]) newDoubleArray(3);
        double[] term10664 = (double[]) newDoubleArray(9);
        double[] term10674 = (double[]) newDoubleArray(1);
        double[] term10676 = (double[]) newDoubleArray(9);
        double[] term10686 = (double[]) newDoubleArray(4);
        setDoubleElement(term10660, 0, 0.40176586625454525);
        setDoubleElement(term10660, 1, 0.2641345529914265);
        setDoubleElement(term10660, 2, 0.36923381893433327);
        setElement(term10659, 0, term10660);
        setDoubleElement(term10664, 0, 0.6076495596892013);
        setDoubleElement(term10664, 1, 0.37773193782763337);
        setDoubleElement(term10664, 2, 0.8474802076607362);
        setDoubleElement(term10664, 3, 0.5183269973490326);
        setDoubleElement(term10664, 4, 0.7655020693602768);
        setDoubleElement(term10664, 5, 0.1374549299694151);
        setDoubleElement(term10664, 6, 0.7031006357544823);
        setDoubleElement(term10664, 7, 0.9527281779865117);
        setDoubleElement(term10664, 8, 0.9828442029246764);
        setElement(term10659, 1, term10664);
        setDoubleElement(term10674, 0, 0.2779719046761513);
        setElement(term10659, 2, term10674);
        setDoubleElement(term10676, 0, 0.6436713023569729);
        setDoubleElement(term10676, 1, 0.7332741045694002);
        setDoubleElement(term10676, 2, 0.4569171842750229);
        setDoubleElement(term10676, 3, 0.8598297828918529);
        setDoubleElement(term10676, 4, 0.43692187681405226);
        setDoubleElement(term10676, 5, 0.7633268466829064);
        setDoubleElement(term10676, 6, 0.13481025392611334);
        setDoubleElement(term10676, 7, 0.3800088629986428);
        setDoubleElement(term10676, 8, 0.5840714198152577);
        setElement(term10659, 3, term10676);
        setDoubleElement(term10686, 0, 0.7559240768573477);
        setDoubleElement(term10686, 1, 0.10667076642995188);
        setDoubleElement(term10686, 2, 0.11493000848982304);
        setDoubleElement(term10686, 3, 0.37161417339133307);
        setElement(term10659, 4, term10686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10659;
        callMethod(klass, "maxValue", argTypes, null, args);
    }

};


