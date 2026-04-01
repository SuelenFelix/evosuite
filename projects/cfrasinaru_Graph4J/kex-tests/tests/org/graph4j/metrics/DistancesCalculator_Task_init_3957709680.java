package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DistancesCalculator_Task_init_3957709680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10386;
     Object term10435;

    public DistancesCalculator_Task_init_3957709680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10386 = newInstance(Class.forName("org.graph4j.metrics.DistancesCalculator"));
        Object[] term10387 = (Object[]) newArray("[I", 7);
        int[] term10388 = (int[]) newIntArray(8);
        int[] term10397 = (int[]) newIntArray(5);
        int[] term10403 = (int[]) newIntArray(9);
        int[] term10413 = (int[]) newIntArray(0);
        int[] term10414 = (int[]) newIntArray(4);
        int[] term10419 = (int[]) newIntArray(4);
        int[] term10424 = (int[]) newIntArray(9);
        setIntElement(term10388, 0, -435079567);
        setIntElement(term10388, 1, -1017617829);
        setIntElement(term10388, 2, 270928865);
        setIntElement(term10388, 3, -308526089);
        setIntElement(term10388, 4, -359675864);
        setIntElement(term10388, 5, -1671982964);
        setIntElement(term10388, 6, 776218451);
        setIntElement(term10388, 7, -1362132929);
        setElement(term10387, 0, term10388);
        setIntElement(term10397, 0, 1267740164);
        setIntElement(term10397, 1, 1363887997);
        setIntElement(term10397, 2, -1744763945);
        setIntElement(term10397, 3, 852281447);
        setIntElement(term10397, 4, 1248430530);
        setElement(term10387, 1, term10397);
        setIntElement(term10403, 0, -1911828505);
        setIntElement(term10403, 1, 241725499);
        setIntElement(term10403, 2, 823179298);
        setIntElement(term10403, 3, 1174484848);
        setIntElement(term10403, 4, 939889496);
        setIntElement(term10403, 5, -495242269);
        setIntElement(term10403, 6, 932810106);
        setIntElement(term10403, 7, -2138801137);
        setIntElement(term10403, 8, -1470115841);
        setElement(term10387, 2, term10403);
        setElement(term10387, 3, term10413);
        setIntElement(term10414, 0, 480909331);
        setIntElement(term10414, 1, -2024983877);
        setIntElement(term10414, 2, 1757149811);
        setIntElement(term10414, 3, 1505375686);
        setElement(term10387, 4, term10414);
        setIntElement(term10419, 0, -132005524);
        setIntElement(term10419, 1, -1235127374);
        setIntElement(term10419, 2, -2077814162);
        setIntElement(term10419, 3, 444514470);
        setElement(term10387, 5, term10419);
        setIntElement(term10424, 0, -147055177);
        setIntElement(term10424, 1, 1979044375);
        setIntElement(term10424, 2, 961252909);
        setIntElement(term10424, 3, 1455842357);
        setIntElement(term10424, 4, 1349806561);
        setIntElement(term10424, 5, 923905351);
        setIntElement(term10424, 6, 428360161);
        setIntElement(term10424, 7, 631528579);
        setIntElement(term10424, 8, -1652091834);
        setElement(term10387, 6, term10424);
        setField(term10386, term10386.getClass(), "dist", term10387);
        setField(term10386, term10386.getClass(), "graph", null);
        setBooleanField(term10386, term10386.getClass(), "directed", false);
        term10435 = new Integer(-282021579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DistancesCalculator$Task");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.metrics.DistancesCalculator");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10386;
        args[1] = term10435;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


