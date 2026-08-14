package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class FailedState_init_7805556990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4416;
     Object term4418;

    public FailedState_init_7805556990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4416 = new Integer(-1016087889);
        Object term4421 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4423 = (int[]) newIntArray(7);
        int[] term4431 = (int[]) newIntArray(5);
        setIntField(term4421, term4421.getClass(), "vertex", 1968287557);
        setIntElement(term4423, 0, 1101385603);
        setIntElement(term4423, 1, 1980267589);
        setIntElement(term4423, 2, -2009434910);
        setIntElement(term4423, 3, -374887532);
        setIntElement(term4423, 4, -165487736);
        setIntElement(term4423, 5, -608393431);
        setIntElement(term4423, 6, 298082829);
        setField(term4421, term4421.getClass(), "values", term4423);
        setIntElement(term4431, 0, -1494372780);
        setIntElement(term4431, 1, 703799187);
        setIntElement(term4431, 2, -1305898281);
        setIntElement(term4431, 3, 140501130);
        setIntElement(term4431, 4, -1458890291);
        setField(term4421, term4421.getClass(), "positions", term4431);
        setIntField(term4421, term4421.getClass(), "size", 1016087323);
        Object term4439 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4441 = (int[]) newIntArray(8);
        int[] term4450 = (int[]) newIntArray(2);
        setIntField(term4439, term4439.getClass(), "vertex", 1957748979);
        setIntElement(term4441, 0, -1290093259);
        setIntElement(term4441, 1, -1200934890);
        setIntElement(term4441, 2, 1765633108);
        setIntElement(term4441, 3, 1312888741);
        setIntElement(term4441, 4, -1443680397);
        setIntElement(term4441, 5, -1331169079);
        setIntElement(term4441, 6, 1109050836);
        setIntElement(term4441, 7, 1978065000);
        setField(term4439, term4439.getClass(), "values", term4441);
        setIntElement(term4450, 0, -2121133707);
        setIntElement(term4450, 1, -1005498887);
        setField(term4439, term4439.getClass(), "positions", term4450);
        setIntField(term4439, term4439.getClass(), "size", 1329150584);
        term4418 = new LinkedList();
        ((LinkedList) term4418).add(term4421);
        ((LinkedList) term4418).add(term4439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.FailedState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term4416;
        args[1] = term4418;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


