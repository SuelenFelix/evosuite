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

public class Tools_printMatrix_20762557137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184983;

    public Tools_printMatrix_20762557137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184983 = (Object[]) newArray("[I", 4);
        int[] term184984 = (int[]) newIntArray(7);
        int[] term184992 = (int[]) newIntArray(1);
        int[] term184994 = (int[]) newIntArray(7);
        int[] term185002 = (int[]) newIntArray(5);
        setIntElement(term184984, 0, 1630634090);
        setIntElement(term184984, 1, 795268454);
        setIntElement(term184984, 2, 2071423306);
        setIntElement(term184984, 3, 1381184751);
        setIntElement(term184984, 4, -119120055);
        setIntElement(term184984, 5, -621482159);
        setIntElement(term184984, 6, 1116774402);
        setElement(term184983, 0, term184984);
        setIntElement(term184992, 0, -1021057583);
        setElement(term184983, 1, term184992);
        setIntElement(term184994, 0, -1675135419);
        setIntElement(term184994, 1, -192456802);
        setIntElement(term184994, 2, -1440344177);
        setIntElement(term184994, 3, 1854587192);
        setIntElement(term184994, 4, 552161283);
        setIntElement(term184994, 5, -533505195);
        setIntElement(term184994, 6, -27748358);
        setElement(term184983, 2, term184994);
        setIntElement(term185002, 0, -449693352);
        setIntElement(term185002, 1, 397657766);
        setIntElement(term185002, 2, -1913693541);
        setIntElement(term185002, 3, -806910109);
        setIntElement(term185002, 4, 890021651);
        setElement(term184983, 3, term185002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term184983;
        callMethod(klass, "printMatrix", argTypes, null, args);
    }

};


