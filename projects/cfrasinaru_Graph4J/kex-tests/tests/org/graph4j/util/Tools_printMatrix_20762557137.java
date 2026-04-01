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
     Object term184972;

    public Tools_printMatrix_20762557137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184972 = (Object[]) newArray("[I", 4);
        int[] term184973 = (int[]) newIntArray(7);
        int[] term184981 = (int[]) newIntArray(1);
        int[] term184983 = (int[]) newIntArray(7);
        int[] term184991 = (int[]) newIntArray(5);
        setIntElement(term184973, 0, 1630634090);
        setIntElement(term184973, 1, 795268454);
        setIntElement(term184973, 2, 2071423306);
        setIntElement(term184973, 3, 1381184751);
        setIntElement(term184973, 4, -119120055);
        setIntElement(term184973, 5, -621482159);
        setIntElement(term184973, 6, 1116774402);
        setElement(term184972, 0, term184973);
        setIntElement(term184981, 0, -1021057583);
        setElement(term184972, 1, term184981);
        setIntElement(term184983, 0, -1675135419);
        setIntElement(term184983, 1, -192456802);
        setIntElement(term184983, 2, -1440344177);
        setIntElement(term184983, 3, 1854587192);
        setIntElement(term184983, 4, 552161283);
        setIntElement(term184983, 5, -533505195);
        setIntElement(term184983, 6, -27748358);
        setElement(term184972, 2, term184983);
        setIntElement(term184991, 0, -449693352);
        setIntElement(term184991, 1, 397657766);
        setIntElement(term184991, 2, -1913693541);
        setIntElement(term184991, 3, -806910109);
        setIntElement(term184991, 4, 890021651);
        setElement(term184972, 3, term184991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term184972;
        callMethod(klass, "printMatrix", argTypes, null, args);
    }

};


