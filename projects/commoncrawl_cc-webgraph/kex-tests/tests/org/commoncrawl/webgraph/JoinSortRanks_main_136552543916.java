package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JoinSortRanks_main_136552543916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10014;

    public JoinSortRanks_main_136552543916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10014 = (Object[]) newArray("java.lang.String", 9);
        setElement(term10014, 0, "EeBVbzjcCI");
        setElement(term10014, 1, "UfQtPRyWRC");
        setElement(term10014, 2, "FPvxVzzSvD");
        setElement(term10014, 3, "WHcwFgsGFC");
        setElement(term10014, 4, "HzqpegHiRq");
        setElement(term10014, 5, "jwsfVjMoJT");
        setElement(term10014, 6, "ZfdXfCCFDf");
        setElement(term10014, 7, "MwwjNtdOFT");
        setElement(term10014, 8, "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10014;
        callMethod(klass, "main", argTypes, null, args);
    }

};


